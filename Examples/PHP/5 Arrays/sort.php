<?php

$authors = array(
    "Charles Dickens",
    "Jane Austin",
    "William Shakespeare",
    "Mark Twain",
    "Louisa May Alcott"
);

$authorsAssociative = array(
    "poetic" => "William Shakespeare",
    "brilliant" => "Jane Austin",
    "quarky" => "Charles Dickens"
);

print_r($authors);

echo "\n";

sort($authors);

print_r($authors);

echo "\n";

print_r($authorsAssociative);

echo "\n";

sort($authorsAssociative);

print_r($authorsAssociative);

