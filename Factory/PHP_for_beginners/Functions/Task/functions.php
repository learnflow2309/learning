<?php

function ageVerification($age)
{
    if ($age <=18) {
        return false;
    }
    else {
        return true;
    }
};

function dd($data){
    echo "<pre>";

    die(var_dump($data));

    echo "</pre>";
};