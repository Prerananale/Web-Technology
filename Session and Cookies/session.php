 <?php
// Start the session
session_start();
?>
<!DOCTYPE html>
<html>
<body>
<form action="session1.php" method="post">
<?php
// Set session variables
$color= "green";
$animal= "cat";
$_SESSION["favcolor"] = $color;
$_SESSION["favanimal"] = $animal;
echo "Session variables are set.";
?>
<?php
// Echo session variables that were set on previous page
echo "Favorite color is " . $_SESSION["favcolor"] . ".<br>";
echo "Favorite animal is " . $_SESSION["favanimal"] . ".";
?>
<?php
print_r($_SESSION);
?>
<input type="submit" name="b1" value="Session1"/>
</body>
</html>

