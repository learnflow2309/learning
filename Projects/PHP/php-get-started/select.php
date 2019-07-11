<?php

$dbconnection = mysqli_connect('localhost', 'root', '', 'php');
$sql = "SELECT * FROM users";
$result = mysqli_query($dbconnection, $sql);
mysqli_close($dbconnection);

?>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <?php
    readfile('navigation.tmpl.html');
    ?>
    <ul>
        <?php

        foreach($result as $row){
            printf('<li><span style="color: %s;">%s (%s) </span><a href="update.php?id=%s">edit</a><span>  </span><a href="delete.php?id=%s">delete</a></li>',
                htmlspecialchars($row['color']),
                htmlspecialchars($row['name']),
                htmlspecialchars($row['gender']),
                htmlspecialchars($row['id']),
                htmlspecialchars($row['id'])
            );
        }

        ?>
        
    </ul>
</body>
</html>