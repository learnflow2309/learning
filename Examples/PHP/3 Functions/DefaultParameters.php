<?php

function booksByAuthorYear($tempAuthorName, $tempYear = 1910){
    echo $tempYear;
    echo "\n";
    echo $tempAuthorName;
    echo "\n";
}

$year = 1920;
$authorName = "William Shakespeare";

booksByAuthorYear($authorName, $year); //Output - 1920 William Shakespeare

booksByAuthorYear($authorName); //Output - 1910 William Shakespeare


