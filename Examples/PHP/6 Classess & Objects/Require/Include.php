<?php

include 'Person.php';
include_once 'Author.php';

//include 'RandomClass.php'; //Warning - Ne postoji takav file i nije uspjelo dohvaćanje filea, nastavlja se izvršavanje skripte

require 'RandomClass.php'; //Warning i Fatal error - Ne postoji takav file i nije uspjelo dohvaćanje required filea, zaustavlja se izvršavanje skripte

$newAuthor = new Author("Samuel Langhorne", "Clemens", 1899);

echo $newAuthor->getCompleteName();