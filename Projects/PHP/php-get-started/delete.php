<?php

require 'auth.php';

if(isset($_GET['id']) && ctype_digit($_GET['id'])){
    $id = $_GET['id'];
}
else{
    header('Location: select.php');
}

?>

<!DOCTYPE html>
<html>
<head>
    <title>PHP</title>
</head>
<body>
    <?php

    $dbconnection = mysqli_connect('localhost', 'root', '', 'php');
    $sql = "DELETE FROM users WHERE id=$id";
    mysqli_query($dbconnection, $sql);
    echo '<br><p>User deleted.</p><br>';
    mysqli_close($dbconnection);

    ?>
    <?php
    readfile('navigation.tmpl.html');
    ?>
</body>
</html>