<?php

require 'Task.php';

require 'functions.php';

/**
 * Dodjeljivanje rezultata connectToDb() funkcije na $pdo varijablu
 */
$pdo = connectToDb();

/**
 * Dodjeljivanje rezultata fetchAllTasks() funkcije na $tasks varijablu
 */
$tasks = fetchAllTasks($pdo);

require 'index.view.php';