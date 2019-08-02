<?php

$config = require 'config.php';

require 'database/Connection.php';

require 'database/QueryBuilder.php';

/* $pdo = Connection::make();

$query = new QueryBuilder($pdo); */

/**
 * Inline način umjesto koda iznad
 */
return new QueryBuilder(
    Connection::make($config['database'])
);