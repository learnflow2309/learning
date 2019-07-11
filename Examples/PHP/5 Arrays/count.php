<?php

$authors = array(
    "Charles Dickens",
    "Jane Austin",
    "William Shakespeare",
    "Mark Twain",
    "Louisa May Alcott"
);

echo count($authors);

echo "\n";

$authors = [
    "Male" => array(
        "Charles Dickens" => array(
            "A Christmas Carol",
            "Oliver Twist"
        ),
        "William Shakespeare" => array(
            "Romeo & Juliet",
            "Richard III"
        ),
        "Mark Twain" => array(
            "Tom Sawyer",
            "Huck Finn"
        )
        ),
    "Female" => array(
        "L. M. Montgomery" => array(
            "Anne of Green Gables",
            "Anne of Avonlea"
        ),
        "Louisa May Alcott" => array(
            "Little Women"
        )
    )
];

echo count($authors);

echo "\n";

echo count($authors, 1/*Count recursive*/);

echo "\n";

echo count($authors, COUNT_RECURSIVE/*Count recursive konstanta, konstante u PHPu se pišu uvijek VELIKIM SLOVIMA*/);

