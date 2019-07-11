<?php

$authors = array("Charles Dickens", "Jane Austin", "William Shakespeare");

echo array_push($authors, "Louisa May Alcott");

echo "\n";

print_r($authors);

echo "\n";

$authors[] = "L. M. Montgomery";

print_r($authors);

$authors['nice'] = "Ivana B. Mažuranić";

print_r($authors);

$authors[] = "Test";

print_r($authors);

$mice = array(
    "nice" => "Razer Mamba", 
    "perfect" => "Logitech G Pro Wireless", 
    "little less perfect" => "Logitech G Pro"
);

$mice[] = "Final mouse 2018";

print_r($mice);

