<?php

return [
    'database' => [
        'connection' => 'mysql:host=127.0.0.1',
        'name' => 'mytodo',
        'username' => 'root',
        'password' => '',
        'options' => [
            /**
             * Opcije za ispis u slučaju iznimaka
             * ERRMODE_WARNING
             * ERRMODE_EXCEPTION
             */
            PDO::ATTR_ERRMODE => PDO::ERRMODE_WARNING
        ]
    ]
];