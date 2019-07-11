<?php

$authors = ["Charles Dickens", "Jane Austin", "William Shakespeare", "Mark Twain", "Louisa May Alcott"];

$count = count($authors);

if($count > 0){
    echo "There is a total of ".$count." author(s).";
}

echo "\n";

$authors = [];

$count = count($authors);

if($count < 1){
    echo "There are no author(s).";
}

echo "\n";

$emptyArray = 0;

if($emptyArray > 0){
    echo "This block of Code is never approached.";
}
else{
    echo "This block of Code is approached if none of the \"if\" conditions in a group (if, if else group) are met.";
}