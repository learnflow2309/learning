<?php
$currency = 'penny';

$sampleString1 = 'A penny saved is a penny earned.'; //Single quotes string (Jednostruki navodnici)
echo $sampleString1; //Output: A penny saved is a penny earned. - Isto što bi se ispisalo i sa Duplim navodnicima

echo "\n";

$sampleString2 = 'A $currency saved is a $currency earned.';
echo $sampleString2; //Output: A $currency saved is a $currency earned.

echo "\n";

$misc = 'St. Patrick\'s Day\n'; //Broken string - Znak ' mora se escapeati pomoću \ ako je String naveden pod jednostrukim navodnicima
echo $misc;

//Sve unutar jednostrukih navodnika neće biti procjenjeno (parsano)
