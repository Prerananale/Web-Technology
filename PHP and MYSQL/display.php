<?php
$username = "root";
$password = "";
$hostname = "localhost"; 

//connection to the database
$dbhandle = mysql_connect($hostname, $username, $password)
 or die("Unable to connect to MySQL");
echo "Connected to MySQL<br>";

//select a database to work with
$selected = mysql_select_db("addressbook",$dbhandle)
  or die("Could not select examples");

//execute the SQL query and return records
$result = mysql_query("SELECT  id, name, phno, email, padd, tadd FROM person");

//fetch tha data from the database
echo "<h1><center>AddressBook Information</center></h1>";
echo "<table border='5' align='center'>";
echo "<tr><th>ID</th><th>Name</th><th>Phone No</th><th>Email</th><th>P ADD</th><th>T ADD</th></tr>";
while ($row = mysql_fetch_array($result)) {
   echo "<tr><td>".$row{'id'}."</td>";
   echo "<td>".$row{'name'}."</td>";
   echo "<td>".$row{'phno'}."</td>";
   echo "<td>".$row{'email'}."</td>";
   echo "<td>".$row{'padd'}."</td>";
   echo "<td>".$row{'tadd'}."</td></tr>";
}
echo "</table>";
//close the connection
mysql_close($dbhandle);
?>
<html>
<body>
<form name="f1" action="addressbook.php" method="post">
<input type="submit" name="display" value="back"/>
</form>
</body>
</html>
