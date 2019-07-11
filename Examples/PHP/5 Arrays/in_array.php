<?php

$authors = array(
    "Charles Dickens",
    "Jane Austin",
    "William Shakespeare",
    "Mark Twain",
    "Louisa May Alcott",
    13
);

echo in_array("Jane Austin", $authors);

echo "\n";

echo in_array("L.M. Montgomery", $authors);

echo "\n";

echo in_array(13, $authors, true);

echo "\n";

echo in_array("13", $authors, true);

