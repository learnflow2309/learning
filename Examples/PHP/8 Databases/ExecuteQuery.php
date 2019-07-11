<?php

$dbPassword = "PHPFundamentals";
$dbUserName = "PHPFundamentals";
$dbServer = "localhost";
$dbName = "PHPFundamentals";

$connection = new mysqli($dbServer, $dbUserName, $dbPassword, $dbName);

if($connection->connect_errno){
    // echo "Database Connection Failed. Reason: ".$connection->connect_error;
    exit("Database Connection Failed. Reason: ".$connection->connect_error);
}

//$query = "DELETE FROM Authors WHERE id = 4";

// $query = "UPDATE Authors SET pen_name = 'L. M. Montogmery' WHERE id = 2";

//$query = "INSERT INTO Authors (first_name, last_name, pen_name) VALUES ('Arthur Ignatius Conan', 'Doyle', 'Sir Arthur Conan Doyle')";

$connection->query($query);

$connection->close();