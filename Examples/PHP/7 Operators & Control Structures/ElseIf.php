<?php

$authors = ["Charles Dickens", "Jane Austin", "William Shakespeare", "Mark Twain", "Louisa May Alcott"];

$count = count($authors);

if($count == 1){
    echo "There is 1 author.";
}
else if($count > 1){
    echo "There is a total of ".$count." author(s).";
}
else{
    echo "There are no author(s).";
}

echo "\n";

$emptyArray = 0;

if($emptyArray > 0){
    echo "This block of Code is never reached.";
}
else if($emptyArray > 1){
    echo "This block of Code is never reached.";
}
else if($count > 1){
    echo "This block of Code is reached if the previous \"if\" or \"else if\" condition is not met.";
}
else{
    echo "This block of Code is approached if none of the \"if\" conditions in a group (if, if else group) are met.";
}