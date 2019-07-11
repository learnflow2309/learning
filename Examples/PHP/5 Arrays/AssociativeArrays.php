<?php

$authors = array(
    "quarky" => "Charles Dickens",
    "brilliant" => "Jane Austin",
    "poetic" => "William Shakespeare"
);

print_r($authors);

// Array
// (
//    key [quarky] => Charles Dickens value
//    key [brilliant] => Jane Austin value
//    key [poetic] => William Shakespeare value
// )

echo "\n";

$authors = array(
    "quarky" => "Charles Dickens",
    10 => "Jane Austin", //Integer ga ne čini Indexiranim Arrayem
    "poetic" => "William Shakespeare"
);

print_r($authors);

// Array
// (
//    key [quarky] => Charles Dickens value
//    key [10] => Jane Austin value
//    key [poetic] => William Shakespeare value
// )

echo "\n";

$authors = array(
    "quarky" => "Charles Dickens",
    10 => "Jane Austin", //Integer ga ne čini Indexiranim Arrayem
    "poetic" => "William Shakespeare",
    "Mark Twain"
);

print_r($authors);

// Array
// (
//    key [quarky] => Charles Dickens value
//    key [10] => Jane Austin value
//    key [poetic] => William Shakespeare value
//    key [11] => Mark Twain value //Ako je postavljen Integer kao key kod jedne Vrijednosti onda je Index za sljedeću nepovezanu Vrijednost za jedan veći
// )

