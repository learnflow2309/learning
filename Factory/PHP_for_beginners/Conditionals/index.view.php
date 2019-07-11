<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>title</title>
  </head>
  <body>
    <h1>Task For The Day</h1>
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
        <li>
            <strong>
                Status: 
            </strong>
            <?php
              if ($task["completed"] == false) 
              {
                  echo "&#x58";
              }
              else 
              {
                  echo "&#x2713";
              };
            ?>
        </li>
        <li>
            <strong>
                Status: 
            </strong>
            <?php
              if ($task["completed"] == false) :
            ?>
            <span>&#x58</span>

            <?php
                else :
            ?>
            <span>&#x2713</span>
            
            <?php 
                endif;
            ?>
        </li>
    </ul>
  </body>
</html>