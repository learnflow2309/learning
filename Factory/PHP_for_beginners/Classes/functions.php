<?php

class Utilities
{
    public function dd($data)
    {
        echo "<pre>";
    
        print_r($data);
    
        echo "</pre>";

        echo "<br>";
        
        echo "<pre>";
    
        var_dump($data);
    
        echo "</pre>";

        die();
    }
}

