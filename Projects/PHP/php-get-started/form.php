<?php

$name = "";
$password = "";
$comments = "";
$gender = "";
$tc = "";
$color = "";
$languages = array();

if(isset($_POST['submit']))
{
    $temp = $_POST;

    //validations
    $ok = true;

    $temp['name'] = trim($temp['name']);
    if(!isset($temp['name']) || $temp['name'] === '')
    {
        $ok = false;
    }
    else
    {
        $name = $temp['name'];
    }

    $temp['password'] = trim($temp['password']);
    if(!isset($temp['password']) || $temp['password'] === '')
    {
        $ok = false;
    }
    else
    {
        $password = $temp['password'];
    }

    $temp['comments'] = trim($temp['comments']);
    if(!isset($temp['comments']) || $temp['comments'] === '')
    {
        $ok = false;
    }
    else
    {
        $comments = $temp['comments'];
    }

    $temp['gender'] = trim($temp['gender']);
    if(!isset($temp['gender']) || $temp['gender'] === '')
    {
        $ok = false;
    }
    else
    {
        $gender = $temp['gender'];
    }

    $temp['tc'] = trim($temp['tc']);
    if(!isset($temp['tc']) || $temp['tc'] === '')
    {
        $ok = false;
    }
    else
    {
        $tc = $temp['tc'];
    }

    $temp['color'] = trim($temp['color']);
    if(!isset($temp['color']) || $temp['color'] === '')
    {
        $ok = false;
    }
    else
    {
        $color = $temp['color'];
    }

    foreach($temp['languages'] as $key => $value)
    {
        $temp['languages'][$key] = trim($value);
    }

    // $temp['languages'] = array_map('trim',$temp['languages']);

    if(!isset($temp['languages']) || !is_array($temp['languages']) || count($temp['languages']) === 0)
    {
        $ok = false;      
    }
    else
    {
        $languages = $temp['languages'];
    }

    //process form
    if($ok){
        printf('<br>
        User name: -%s-<br>
        Password: -%s-<br>
        Gender: -%s-<br>
        Color: -%s-<br>
        Language(s): -%s-<br>
        Comments: -%s-<br>
        T&amp;C: -%s-<br><br>',
        trim(htmlspecialchars($name)),
        htmlspecialchars($password),
        htmlspecialchars($gender),
        htmlspecialchars($color),
        htmlspecialchars(implode(' ', $languages)),
        htmlspecialchars($comments),
        htmlspecialchars($tc)
        );
    }
}

?>

<!DOCTYPE html>
<html>
<head>
    <title>PHP</title>
</head>
<body>
    <form method="post" action="">
        User name: <input type="text" name="name" value="<?=htmlspecialchars($name)?>"><br>
        Password: <input type="password" name="password" value="<?=htmlspecialchars($password)?>"><br>
        Gender: 
            <input type="radio" name="gender" value="f" <?php if($gender === 'f'){echo 'checked';}?>>female
            <input type="radio" name="gender" value="m" <?php if($gender === 'm'){echo 'checked';}?>>male<br>
        Favorite color:
            <select name="color" >
                <option value="">Please select</option>
                <option value="#f00" <?php if($color === '#f00'){echo 'selected';}?>>red</option>
                <option value="#0f0" <?php if($color === '#0f0'){echo 'selected';}?>>green</option>
                <option value="#00f" <?php if($color === '#00f'){echo 'selected';}?>>blue</option>
            </select><br>
        Languages spoken:
            <select name="languages[]" multiple size="3">
                <option value="en" <?php if(in_array('en', $languages)){echo "selected";}?>>English</option>
                <option value="fr" <?php if(in_array('fr', $languages)){echo "selected";}?>>French</option>
                <option value="it" <?php if(in_array('it', $languages)){echo "selected";}?>>Italian</option>
            </select><br>
        Comments: <textarea name="comments"><?=htmlspecialchars($comments)?></textarea><br>
        <input type="checkbox" name="tc" value="ok" <?php if($tc === 'ok'){echo 'checked';}?>>I accept the T&C<br>
        <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>