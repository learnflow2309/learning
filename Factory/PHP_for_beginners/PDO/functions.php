<?php

function connectToDb()
{
    /**
     * try - govori phpu da proba izvršiti ako ne može neka uhvati određeni tip greške te na temelju tog tipa prikaže specifičnu poruku
     */
    try
    {
        /**
         * Stvara instancu, Objekt, koji je konekcija na MySQL bazu
         * Prosljeđuje mu se DSN, username i password
         */
        return new PDO('mysql:host=127.0.0.1;dbname=mytodo', 'root', '');
    }
    catch (PDOException $e)
    {
        /**
         * Metoda PDOExceptiona za dohvaćanje poruke koja je nastala unutar PDOExceptiona
         */
        die($e->getMessage());
        /**
         * Ispis custom poruke
         */
        die('Could not connect.');
    }
}

function fetchAllTasks($pdo)
{
    /**
     * Pripremanje izraza za dohvaćanje iz baze preko isntance PDO-a
     * Poznato pod nazivom Prepared statements
     */
    $statement = $pdo->prepare('select * from todos');

    $statement->execute();

    /**
     * Metoda PDO-a koja ispisuje sve rezultate iz međumemorije pripremljenog izraza PDO-a
     */
    //var_dump($statement->fetchAll());

    /**
     * Metoda PDO-a koja ispisuje sve rezultate iz međumemorije pripremljenog izraza PDO-a
     * Može joj se proslijediti parametar za dohvaćanje u obliku specifične vrste poput Objekta ili instance Klase
     * Kod dohvaćanja u obliku Klase može se definirati koju Klasu želimo da koristi, tj. pod pravilima koje Klase
     */
    //$tasks = $statement->fetchAll(PDO::FETCH_OBJ);

    return $statement->fetchAll(PDO::FETCH_CLASS, 'Task');

    //var_dump($tasks[0]->description);

    /**
     * Pozivanje Metode instance Klase Task koja je Objekt
     */
    //var_dump($tasks[0]->foobar());
}

function dd($data)
{
    echo "<pre>";

    print_r($data);

    echo "</pre>";

    echo "<br>";
    
    echo "<pre>";

    var_dump($data);

    echo "</pre>";

    die();
}
