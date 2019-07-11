<?php

$authors = array("Charles Dickens", "Jane Austin", "William Shakespeare");

$authorsAssociative = array(
    "quarky" => "Charles Dickens",
    "brilliant" => "Jane Austin",
    "poetic" => "William Shakespeare"
);

unset($authors[1], $authors[0]);

print_r($authors);

echo "\n";

unset($authorsAssociative['poetic']);

print_r($authorsAssociative);

// echo "\n";

// unset($authors);

// print_r($authors);

