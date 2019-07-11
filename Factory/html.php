<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>

    <style>
        header{
            background-color: #eee;
            padding: 2em;
            text-align: center;
        }
    </style>
</head>
<body>
    <header>
        <h1>Hello world!</h1>
        <h1><?php echo 'Hello world 2!';?></h1>
        <h1>
            <?php 
                $greeting = "Hello world 3!";
        
                echo $greeting;
            ?>
        </h1>
        <h1>
            <?php 
                $name = $_GET['name'];
        
                echo $name;

                /*http://localhost/factory-plan_ucenja/html.php?name=Branimir*/
            ?>
        </h1>
        <h1><?php echo "Hello, ". $_GET['name']; ?></h1>
        <h1>
            <?= 
                /** 
                 * "<?=" je isto što i "<?php echo"              
                 */

                "Hello, ". htmlspecialchars($_GET['name']); 

                /**
                 * htmlspecialchars() - Nativna funkcija PHP-a
                 */

                /*http://localhost/factory-plan_ucenja/html.php?name=%3Ca%20href=%22test.com%22%3EBranimir%3C/a%3E*/
            ?>
        </h1>
    </header>
</body>
</html>