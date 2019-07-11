<?php

class Person{
    const AVG_LIFE_SPAN = 79;

    protected $firstName;
    protected $lastName;
    protected $yearBorn;

    function __construct($tempFirst = "", $tempLast = "", $tempBorn = 0){
        $this->firstName = $tempFirst;
        $this->lastName = $tempLast;
        $this->yearBorn = $tempBorn;
    }

    public function getFirstName(){
        return $this->firstName.PHP_EOL;
    }

    public function setFirstName($tempName){
        $this->firstName = $tempName;
    }

    protected function getFullName(){
        return $this->firstName." ".$this->lastName.PHP_EOL;
    }
}

class Author extends Person{
    protected $penName = "Mark Twain";

    public function getPenName(){
        return $this->penName.PHP_EOL;
    }

    public function getCompleteName(){
        return $this->firstName." ".$this->lastName." a.k.a. ".$this->penName.PHP_EOL;
    }
}

$newAuthor = new Author("Samuel Langhorne", "Clemens", 1899);

//echo $newAuthor->penName; //Error - Ne može im se pristupiti izravno (kod poziva)

//echo $newAuthor->getFullName(); //Error - Ne može im se pristupiti izravno (kod poziva)

echo $newAuthor->getCompleteName();