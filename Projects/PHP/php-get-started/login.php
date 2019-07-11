<?php

session_start();

$message = "";
$messageDisplay = "display: none;";

if(isset($_POST['name']) && isset($_POST['password'])){
    $dbconnection = mysqli_connect('localhost', 'root', '', 'php');
    $sql = sprintf("SELECT * FROM users WHERE name='%s'",
    mysqli_real_escape_string($dbconnection, $_POST['name'])
    );
    $result = mysqli_query($dbconnection, $sql);
    $row = mysqli_fetch_assoc($result);
    echo '<pre>';
    print_r($row);
    echo '</pre>';
    $messageDisplay = "display: block;";
    if($row){
        $hash = $row['password'];
        $isAdmin = $row['is_admin'];

        if(password_verify($_POST['password'], $hash)){
            $message = 'Login successful.';

            $_SESSION['user'] = $row['name'];
            $_SESSION['isAdmin'] = $isAdmin;
        }
        else{
            $message = 'Log in failed.';
        }
    }
    else{
        $message = 'Log in failed.';
    }
    mysqli_close($dbconnection);
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <?php
    readfile('navigation.tmpl.html');
    echo "<p style=\"$messageDisplay\">$message</p>";
    ?>
    <form method="post" action="">
        User name: <input type="text" name="name"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" name="submit" value="Log in">
    </form>
</body>
</html>