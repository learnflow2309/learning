<?php
define('CHECK_CONSTANT', "Yes, I am a constant!");
$intVar = 1234;
$stringVar = "I'm a String";
$boolVar = false;
$floatVar = 12.34;

echo is_int($intVar); #Provjerava da li je varijabla Integer (Vraća 1 ako je true, ne vraća ništa ako je false)
echo "\n";
echo is_int($floatVar);
echo "--------\n";

echo is_string($stringVar); #Provjerava da li je varijabla String (Vraća 1 ako je true, ne vraća ništa ako je false)
echo "\n";
echo is_string($floatVar);
echo "--------\n";

echo is_bool($boolVar); #Provjerava da li je varijabla Boolean (Vraća 1 ako je true, ne vraća ništa ako je false)
echo "\n";
echo is_bool($floatVar);
echo "--------\n";

echo is_float($floatVar); #Provjerava da li je varijabla Float (Vraća 1 ako je true, ne vraća ništa ako je false)
echo "\n";
echo is_float($intVar);
echo "--------\n";

echo defined('CHECK_CONSTANT'); #Provjerava da li je definirana Konstanta (Vraća 1 ako je true, ne vraća ništa ako je false)
echo "\n";
echo defined('TEST');
echo "--------\n";
