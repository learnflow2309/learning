<?php

require "functions.php";

/**
 * TODO (Komentar što sve još treba napraviti unutar trenutne skripte)
 * 
 * Todo, Comment, User
 */

 /**
  * Razlika između Funkcije i Metod je ta da je Metoda funkcija klase, a Funkcija je samostalna funkcija
  */

class Task
{
    /**
     * property - property Objekta
     * public - dostupno iz vana, npr. ako requireamo file koji ima public klasu i public metodu ta metoda se može izravno pozvati
     */
    public $description;


    /**
     * property - property Objekta
     * protected - dostupno iz klase i child klasa
     */
    public $completed = false;

    /**
    * Konstruktor se izvršava kod stvaranja instance Klase
    */

    public function __construct($description, /* Postavljanje inicijalne vrijednosti */ $completed=false)
    {
        /**
         * "$this" se koristi kada se želimo referencirati na trenutno aktivnu instancu klase (Objekt)
         * 
         * "->" se koristi za dodjeljivanje Svojstva Objektu
         */
        $this->description = $description;

        $this->completed = $completed;
    }

    public function checkCompletionStatus()
    {
        return $this->completed;
    }

    public function setCompletedStatus()
    {
        $this->completed = true;
    }
}

/**
 * Stvaranje instance Klase
 * Parametri kod stvaranja instance Klase koriste se za Konstruktore
 */
//$task = new Task('Go to the store', false);

//var_dump($task->checkCompletionStatus());

//$task->setCompletedStatus();

//var_dump($task->checkCompletionStatus());

$tasks = [
    new Task("Zadatak 1"),
    
    new Task("Zadatak 2", false),
    
    new Task("Zadatak 3", true),
    
    new Task("Zadatak 4", false)
];

/**
 * "::" Pozivanje public metode klase bez instanciranja
 */
//Utilities::dd($tasks);

require "index.view.php";