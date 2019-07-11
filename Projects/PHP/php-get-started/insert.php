<?php

$name = "";
$password = "";
$gender = "";
$color = "";

if(isset($_POST['submit']))
{
    $temp = $_POST;

    //validations
    $ok = true;

    $temp['name'] = trim($temp['name']);
    if(!isset($temp['name']) || $temp['name'] === '')
    {
        $ok = false;
    }
    else
    {
        $name = $temp['name'];
    }

    $temp['password'] = trim($temp['password']);
    if(!isset($temp['password']) || $temp['password'] === '')
    {
        $ok = false;
    }
    else
    {
        $password = $temp['password'];
    }

    $temp['gender'] = trim($temp['gender']);
    if(!isset($temp['gender']) || $temp['gender'] === '')
    {
        $ok = false;
    }
    else
    {
        $gender = $temp['gender'];
    }

    $temp['color'] = trim($temp['color']);
    if(!isset($temp['color']) || $temp['color'] === '')
    {
        $ok = false;
    }
    else
    {
        $color = $temp['color'];
    }

    //process form
    if($ok){
        $hash = password_hash($password, PASSWORD_DEFAULT);

        $dbconnection = mysqli_connect('localhost', 'root', '', 'php');
        $sql = sprintf("INSERT INTO users (name, password, gender, color) VALUES 
        (
            '%s', 
            '%s', 
            '%s',
            '%s'
        )",
        mysqli_real_escape_string($dbconnection, $name),
        mysqli_real_escape_string($dbconnection, $hash),
        mysqli_real_escape_string($dbconnection, $gender),
        mysqli_real_escape_string($dbconnection, $color)
        );
        mysqli_query($dbconnection, $sql);
        mysqli_close($dbconnection);
        echo '<br><p>User added.</p><br>';
    }
}

?>

<!DOCTYPE html>
<html>
<head>
    <title>PHP</title>
</head>
<body>
    <?php
    readfile('navigation.tmpl.html');
    ?>
    <form method="post" action="">
        User name: <input type="text" name="name" value="<?=htmlspecialchars($name)?>"><br>
        Password: <input type="password" name="password" value=""><br>
        Gender: 
            <input type="radio" name="gender" value="f" <?php if($gender === 'f'){echo 'checked';}?>>female
            <input type="radio" name="gender" value="m" <?php if($gender === 'm'){echo 'checked';}?>>male<br>
        Favorite color:
            <select name="color" >
                <option value="">Please select</option>
                <option value="#f00" <?php if($color === '#f00'){echo 'selected';}?>>red</option>
                <option value="#0f0" <?php if($color === '#0f0'){echo 'selected';}?>>green</option>
                <option value="#00f" <?php if($color === '#00f'){echo 'selected';}?>>blue</option>
            </select><br>
        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>