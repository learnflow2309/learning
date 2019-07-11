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

print_r($authorsAssociative);

echo "\n";

ksort($authorsAssociative);

print_r($authorsAssociative);

