<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Page Title</title>
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
        <h1>
            <?= $greeting; ?>
        </h1>
        <ul style="list-style-type: none; padding: 0;">
            <li><?= $names[0]; ?></li>
            <li><?= $names[1]; ?></li>
            <li><?= $names[2]; ?></li>
        </ul>
    </header>
</body>
</html>