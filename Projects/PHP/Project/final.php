<?php

require 'assets/include.php';

if(isset($_SESSION['formPostData']))
{
    $postedData = $_SESSION['formPostData'];

    //session_destroy();

    unset($_SESSION['formPostData']);
}
else
{
    header('Location: index.php');
}

?>

<!DOCTYPE html>
<html>
    <head>
        <title>PHP Fundamentals</title>
		<link href="assets/styles.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
		<div id="Header">
			<img src="assets/Dickens_Gurney_head.jpg" border="0" alt="">
			<h2>
				Mailing List Information
			</h2>
		</div>        
        <div id="Body">
            <div>
                <label>Favorite Author:</label> 
                <span><?=$postedData['author']?>&nbsp;</span>
            </div>		
            <div>
                <label>Favorite Century:</label>
                <?php foreach($postedData['century'] as $temp) : ?>
                <span><?=$temp?>&nbsp;</span>
                <?php endforeach; ?>
            </div>
            <div>
                <label>Comments:</label>
                <span><?=$postedData['comments']?>&nbsp;</span>
            </div>
            <div>
                <label>Name:</label>
                <span><?=$postedData['name']?>&nbsp;</span>
            </div>
            <div>
                <label>E-mail Address:</label>
                <span><?=$postedData['email']?>&nbsp;</span>
            </div>
            <div>
                <label>Receive Newsletter:</label>
                <span><?=$postedData['newsletter']?>&nbsp;</span>
            </div>
        </div>
	</body>
</html>