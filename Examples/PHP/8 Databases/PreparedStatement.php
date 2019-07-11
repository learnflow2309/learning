<?php

$dbPassword = "PHPFundamentals";
$dbUserName = "PHPFundamentals";
$dbServer = "localhost";
$dbName = "PHPFundamentals";

$connection = new mysqli($dbServer, $dbUserName, $dbPassword, $dbName);

if($connection->connect_errno){
    die("Database Connection Failed. Reason: ".$connection->connect_error);
}

$tempFirstName = 'Lucy Maud';

$query = "SELECT first_name, last_name, pen_name FROM Authors WHERE first_name = ?";
$statementObj = $connection->prepare($query);

$statementObj->bind_param("s", $tempFirstName);
$statementObj->execute();

$statementObj->bind_result($firstName, $lastName, $penName);
$statementObj->store_result();

if($statementObj->num_rows > 0){
    while($statementObj->fetch()){
        echo $firstName." ".$lastName." (".$penName.")".PHP_EOL;
    }
}

$statementObj->close(); //Statement obj može samo zatvoriti close() Metoda
$connection->close();