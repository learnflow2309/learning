<?php
$authorName = "William Shakespeare"; //Variable scope 1 - Variable unutar Skripte su dostupne u cijeloj Skripti (Na bilo kojem mjestu)

function setAuthorName(){
    $authorName = "Charles Dickens"; //Variable scope 2 - Varijable unutar Funkcije su dostupne samo u Funkciji
    //return $authorName; - Dodatak 1 - Da bi utjecalo na Varijablu izvan  Funkcije
}

//Funkciju treba smatrati kao Kutiju (Ako nema return, ne vraća ništa)

//Funkcija ima pristup Varijablama Skripte no ne i ostalih Funkcija

/*$authorName = - Dodatak 2 - Da bi utjecalo na Varijablu izvan  Funkcije*/ setAuthorName(); //Pozivanje funkcije - Ne mijenja varijablu Skripte pošto nema return

echo $authorName; //Output - William Shakespeare
