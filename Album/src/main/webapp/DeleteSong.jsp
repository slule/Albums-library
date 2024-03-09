<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Song</title>
</head>
<body>
	<form action="DeleteSong" method="post">
		Enter Name of the Song to be deleted: <input type="text" name="songName" size="25"/>
		<input type="submit" value="Delete" />
	
	</form>
	<br>
	<a href="index.jsp">Home</a>

</body>
</html>