<?php

$person = [
    "age" => 29,
    "gender" => "male",
    "career" => "programmer"
];

/**
 * Push key i value u Asoc array
*/
$person["name"] = "Bran";

$animals = ["Dog", "Cat"];

$animals[] = "Elephant";

/**
 * Pisanje u DOM pomoću PHPa
*/
echo "<pre>";

print_r($person);

echo "</pre>";

echo "<pre>";

var_dump($person);

echo "</pre>";

/**
 * Zaustavlja izvršavanje PHP-a
 */
//die();

require 'index.view.php';