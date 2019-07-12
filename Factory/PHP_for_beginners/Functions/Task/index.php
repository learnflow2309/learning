<?php

/**
 * Napraviti program koji korisniku govori da li je punoljetan
 */

require "functions.php";

$age = 0;

if(isset($_GET['age']))
{
    $age = $_GET['age'];
}

$oldEnough = ageVerification($age);

require "index.view.php";