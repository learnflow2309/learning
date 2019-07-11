<?php

$quote = "It is a melancholy truth that even great men have their poor relations.";

$varArray = str_split($quote);

print_r($varArray); //omogućuje ispis Arraya u formi koja je čitljiva ljudima

echo "\n";

$varArray = str_split($quote, 8);

print_r($varArray); //omogućuje ispis Arraya u formi koja je čitljiva ljudima

