<?php
$currency = "penny";

$sampleString = "A $currency saved is a $currency earned.";
echo $sampleString; //Output: A penny saved is a penny earned.

echo "\n";

$var = 2;

//echo "$varnd place"; //Output: " place"

echo "${var}nd place"; //Curly brackets string var - Koristi se kada želimo ispisati tekst pokraj varijable bez razmaka (Ne radi kod Jednostrukih navodnika)
//Output: 2nd place

echo "\n";

echo $var."nd place"; //Concatenation - Spajanje varijabli u string (Kod većine jezika je + umjesto .) (Radi kod Jednostrukih navodnika)

echo "\n";

$misc1 = "St. Patrick's Day";
echo $misc1; //Output: St. Patrick's Day - Nema errora

echo "\n";

$misc2 = "St. Patrick\"s Day"; //Broken string - Znak " mora se escapeati pomoću \ ako je String naveden pod Dvostrukim navodnicima
echo $misc2;

$misc3 = "\n";
echo $misc3;

//Sve unutar dvostrukih navodnika biti će procjenjeno (parsano) (npr. \n ili neka varijabla)

//Ako želimo ispisati tekst nakon varijable unutar Dvostrukih navodnika treba koristiti ${} način zapisa varijable

//Ako želimo ispisati String nakon varijable treba koristiti . (Isto što i + kod većine jezika)
