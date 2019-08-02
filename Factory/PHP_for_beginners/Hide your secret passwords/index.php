<?php

$query = require 'bootstrap.php';

$tasks = $query->selectAll('todosa');

require 'index.view.php';