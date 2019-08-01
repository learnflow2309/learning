<?php

class Connection{
    /**
     * static - Metoda postaje dostupna globalno bez da je potrebno stvarati instancu Klase
     */
    public static function make()
    {
        try
        {
            return new PDO('mysql:host=127.0.0.1;dbname=mytodo', 'root', '');
        }
        catch (PDOException $e)
        {
            die($e->getMessage());
            
            die('Could not connect.');
        }
    }
}

/**
 * Pozivanje static Metode
 */
//Connection::make();
