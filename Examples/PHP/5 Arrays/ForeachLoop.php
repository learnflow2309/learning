<?php

$authors = array(
    "quarky" => "Charles Dickens",
    "brilliant" => "Jane Austin",
    "poetic" => "William Shakespeare"
);

foreach($authors as $val){
    echo $val."\n"/*Spajanje novog reda uz Varijablu*/;
};

echo "\n";

foreach($authors as $key => $val){
    echo $val." (".$key.")\n";
};

