<?php

/**
 * Refaktoriranje koda je preslagivanje i skraćivanje koda sa ciljem da se brže izvrši tražena funkcionalnost (u slučaju manje linija koda ili korištenjem funkcija i metoda koje se brže izvršavaju) te da je kod čitkiji
*/

/**
 * Spremanje rezultata izvršenog koda iz bootstrap.php u varijablu $query
 */
$query = require 'bootstrap.php';

//require 'Task.php';

//$tasks = $query->selectAll('todos', 'Task');

$tasks = $query->selectAll('todos');

/* $tasks = array_map(function($task){

    return "foo";

}, $tasks);

echo "<pre>";

die(var_dump($tasks));

echo "</pre>"; */

require 'index.view.php';