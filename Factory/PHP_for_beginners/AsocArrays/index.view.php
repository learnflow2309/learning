<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <!-- 
        HTML tag za uljepšavanje ispisanog Arraya
    -->
    <pre>
        <?php
            /**
            * Nativna PHP funkcija za ispis Arraya, print_r()
            */
            print_r($person);
        ?>
    </pre>
    <pre>
        <?php
            /**
            * Nativna PHP funkcija za ispis, var_dump()
            */
            var_dump($person);
        ?>
    </pre>
    <ul>
        <?php
            foreach($person as $feature) :
        ?>

        <li>
            <?=
                $feature;
            ?>
        </li>

        <?php
            endforeach;
        ?>
    </ul>
    <ul>
        <?php
            /**
             * Nativna PHP funkcija koja uklanja key i vrijednost iz Arraya
             */
            unset($person["age"]);

            foreach($person as $key => $value) :
        ?> 

        <li>
            <?=
                $key.
                " = ".
                $value;
            ?>
        </li>

        <?php
            endforeach;
        ?>
    </ul>
</body>
</html>