<?php

function booksByAuthorYear($tempAuthorName, $tempYear = 1910){
    echo $tempYear;
    echo "\n";
    echo $tempAuthorName;
    echo "\n";
}

function getAuthor(){
    return "Charles Dickens"; //return - Definira što vratiti nakon poziva Funkcije (Rezultat)
}

//getAuthor(); - U ovom slučaju Funkcija neće odraditi ništa pošto nema varijablu kojoj može proslijediti vraćenu vrijednost

$year = 1920;
$authorName = getAuthor(); //Spremanje rezultata Funkcije pod Varijablu

booksByAuthorYear($authorName, $year);

