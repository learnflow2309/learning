<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>title</title>
  </head>
  <body>
    <h1>Task For The Day</h1>
    <ul>
        <?php
            foreach($task as $heading => $value) :
        ?>
        <li>
            <strong>
                <?=
                    /**
                     * Helper funkcije su funkcije koje se izvršavaju u jednom redu, tj. funkcije koje ubrzavaju pisanje određene funkcionalnosti
                     * 
                     * Nativna PHP funkcija, u jedno Helper funkcija, koja postavlja veliko slovo na svaku riječ prosljeđenog stringa
                     */
                    ucwords($heading);
                ?>
                :
                <?=
                    $value;
                ?>
            </strong>
        </li>
        <?php
            endforeach;
        ?>
    </ul>
    <ul>
        <li>
            <strong>
                Name: 
            </strong>
            <?=
                $task["title"];
            ?>
        </li>
        <li>
            <strong>
                Due date: 
            </strong>
            <?=
                $task["due"];
            ?>
        </li>
        <li>
            <strong>
                Personal responsible: 
            </strong>
            <?=
                $task["assigned_to"];
            ?>
        </li>
        <li>
            <strong>
                Status: 
            </strong>
            <?=
                /**
                 * Ternarni operator 
                 * true ? "do this" : "do that"
                 */
                $task["completed"] ? 'Complete' : 'Incomplete';
            ?>
        </li>
    </ul>
  </body>
</html>