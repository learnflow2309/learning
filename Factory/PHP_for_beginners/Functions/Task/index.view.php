<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Age verification</title>
  </head>
  <body>
    <div id="main-wrapper" style="padding-left: 10px; max-width: 1000px;">
      <div id="main-text">
        <?php
            if($age <= 0) :
        ?>
        <h1>What is your age?</h1>
        <?php
            elseif($oldEnough) :
        ?>
        <h1>You are old enough to drink!</h1>
        <?php
            else :
        ?>
        <h1>You are not old enough to drink!</h1>
        <?php
            endif;
        ?>
      </div>
      <form name="form" action="" method="get">
        <input type="text" name="age" id="age" value="" placeholder="Enter your age...">
        <button type="submit">Submit</button>
      </form>
      <button onClick="window.location.href = '/learning/Factory/PHP_for_beginners/Functions/Task';" style="margin-top: 10px;">Reset</button>
    </div>
  </body>
</html>