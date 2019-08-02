<?php

class Connection{
    /**
     * static - Metoda postaje dostupna globalno bez da je potrebno stvarati instancu Klase
     */
    public static function make($config)
    {
        try
        {
            return new PDO(
                $config['connection'].';dbname='.$config['name'],$config['username'],
                $config['password'],
                $config['options']
            );
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
