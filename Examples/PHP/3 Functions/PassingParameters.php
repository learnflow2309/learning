<?php

function bookByAuthor($authorName){
    echo $authorName;
}

//$authorName = "William Shaespeare";

//bookByAuthor($authorName);

function bookByAuthorYear($authorName, $year){
    echo $year;
    echo "\n";
    echo $authorName;
}

$year = 1910;
$authorName = "William Shaespeare";

bookByAuthorYear($authorName, $year);

