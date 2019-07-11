<?php

require 'auth.php';

if(isset($_GET['id']) && ctype_digit($_GET['id'])){
    $id = $_GET['id'];
}
else{
    header('Location: select.php');
}

if(isset($_POST['submit'])){
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
        $dbconnection = mysqli_connect('localhost', 'root', '', 'php');
        $sql = sprintf("UPDATE users SET name='%s', gender='%s', color='%s' WHERE id='%s'",
            mysqli_real_escape_string($dbconnection, $name),
            mysqli_real_escape_string($dbconnection, $gender),
            mysqli_real_escape_string($dbconnection, $color),
            $id
        );
        mysqli_query($dbconnection, $sql);
        mysqli_close($dbconnection);
        echo '<br><p>User updated.</p><br>';
    }
}
else{
    $dbconnection = mysqli_connect('localhost', 'root', '', 'php');
    $sql = sprintf(
        'SELECT * FROM users WHERE id=%s',
        $id
    );
    $result = mysqli_query($dbconnection, $sql);
    foreach($result as $row){
        $name = $row['name'];
        $gender = $row['gender'];
        $color = $row['color'];
    }
    mysqli_close($dbconnection);
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