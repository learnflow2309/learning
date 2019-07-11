<?php
$bool1 = true; #Boolean (Uvijek je true ili false)
var_dump($bool1);

$bool2 = false; #Boolean (Uvijek je true ili false)
var_dump($bool2);

$hasValue1 = 1234;
var_dump((bool)$hasValue1); #Pretvorba u boolean (ako postoji vrijednost biti će true)

$hasValue2 = "";
var_dump((bool)$hasValue2); #Pretvorba u boolean (ako ne postoji vrijednost biti će false)

$hasValue3 = [];
var_dump((bool)$hasValue3); #Pretvorba u boolean (ako ne postoji vrijednost biti će false)

$hasValue4 = 0;
var_dump((bool)$hasValue4); #Pretvorba u boolean (ako ne postoji vrijednost biti će false)

$hasValue5 = "Hello!";
var_dump((bool)$hasValue5); #Pretvorba u boolean (ako postoji vrijednost biti će true)
