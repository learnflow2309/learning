<?php 

$p = password_hash('t0ps€cr3t', PASSWORD_DEFAULT);

echo $p;

$ok = password_verify('t0ps€cr3t', $p);

echo "\n";

echo $ok;

?>