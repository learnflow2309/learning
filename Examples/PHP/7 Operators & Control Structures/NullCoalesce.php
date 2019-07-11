<?php

$authors = ["Charles Dickens", "Jane Austin", "William Shakespeare", "Mark Twain", "Louisa May Alcott"];
$count = count($authors);

$outcome = $count ? $count : "Count unavailable.";
echo $outcome;

echo "\n";

$outcome = $count ?? "Count unavailable.";
echo $outcome;

echo "\n";

$outcome = $test ?? "Test var unavailable.";
echo $outcome;

echo "\n";

$outcome = $test1 ?? $test2 ?? $test3 ?? "Not one of the Test vars is available.";
echo $outcome;