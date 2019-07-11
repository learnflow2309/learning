<?php

class Person{
    const AVG_LIFE_SPAN = 79;

    public $firstName;
    public $lastName;
    public $yearBorn;

    function __construct($tempFirst = "", $tempLast = "", $tempBorn = 0){
        $this->firstName = $tempFirst;
        $this->lastName = $tempLast;
        $this->yearBorn = $tempBorn;
    }

    public function getFirstName(){
        return $this->firstName;
    }

    public function setFirstName($tempName){
        $this->firstName = $tempName;
    }
}

$myObject = new Person("Samuel Langhorne", "Clemens", 1899);

echo $myObject->getFirstName();