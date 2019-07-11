<?php

$var1 = (6 < 7);
$var2 = (8 == 8);

var_dump($var1);
var_dump($var2);

var_dump($var1 and $var2);

var_dump($var1 && $var2);

$var1 = true;
$var2 = false;

var_dump($var1);
var_dump($var2);

var_dump($var1 && $var2);

var_dump($var1 or $var2);

var_dump($var1 || $var2);

var_dump(!$var1);

var_dump(!$var2);