<?php

$authors = array("Charles Dickens", "Jane Austin", "William Shakespeare");

$authorAssociative = array(
    "quarky" => "Charles Dickens",
    "brilliant" => "Jane Austin",
    "poetic" => "William Shakespeare"
);

echo $authors[1]; //Indexirani Arrayevi počinju od 0, u ovom slučaju pristupa se drugoj vrijednosti u nizu

echo "\n";

echo $authorAssociative['quarky'];

echo "\n";

echo array_key_exists(5, $authors);

echo "\n";

echo array_key_exists(2, $authors);

echo "\n";

echo array_key_exists('poetic', $authorAssociative);

