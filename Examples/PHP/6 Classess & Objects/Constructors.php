<?php

class Person{
    const AVG_LIFE_SPAN = 79;

    public $firstName;
    public $lastName;
    public $yearBorn;

    function __construct(){
        echo "I'm in the constructor\n";
        $this->firstName = "Samuel Langhorne";
        $this->lastName = "Clemens";
        $this->yearBorn = 1899;
    }

    public function getFirstName(){
        return $this->firstName;
    }

    public function setFirstName($tempName){
        $this->firstName = $tempName;
    }
}

$myObject = new Person();

echo $myObject->getFirstName();