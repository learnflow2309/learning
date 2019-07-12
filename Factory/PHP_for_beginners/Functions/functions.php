<?php

htmlspecialchars("");

ucwords("");

function basicDumper($array)
{
    echo "<pre>";

    print_r($array);

    echo "</pre>";
};

function dumper($value)
{
    echo "<pre>";

    var_dump($value);

    echo "</pre>";
};

/**
 * Dump and Die funkcija
 */
function dd($value){
    echo "<pre>";

    die(var_dump($value));

    echo "</pre>";
};

/* echo "<pre>";

die(var_dump($animals));

echo "</pre>"; */