<?php

class Person{
    const AVG_LIFE_SPAN = 79;

    public $firstName = "Samuel Langhorne";
    public $lastName = "Clemens";
    public $yearBorn = 1899;
}

$myObject = new Person();

echo $myObject::AVG_LIFE_SPAN."\n";

echo Person::AVG_LIFE_SPAN;