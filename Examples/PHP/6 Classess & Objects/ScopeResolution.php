<?php

class Person{
    const AVG_LIFE_SPAN = 79;

    private $firstName;
    private $lastName;
    private $yearBorn;

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
    public static $centuryPopular = "19th";

    private $penName = "Mark Twain";

    public function getPenName(){
        return $this->penName.PHP_EOL;
    }

    public function getCompleteName(){
        return $this->getFullName()." a.k.a. ".$this->penName.PHP_EOL;
    }

    public static function getCenturyAuthorWasPopular(){
        return self::$centuryPopular;
    }
}

echo Author::$centuryPopular."\n";

echo Author::getCenturyAuthorWasPopular();