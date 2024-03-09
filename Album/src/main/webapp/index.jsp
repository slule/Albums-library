<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Album</title>
</head>
<body>
<a href="AddAlbum.jsp">Add Album</a> <br>
	<a href="AddSong.jsp">Add Song</a> <br>
		<form action="ViewAlbum" method="get">
			<input type="submit" value="View Album"/>
		</form>
		<form action="ViewSong" method="get">
			<input type="submit" value="View Song"/>
		</form>
		<a href="DeleteSong.jsp">Delete Song</a> <br>
		<a href="UpdateSong.jsp">Update Song</a> <br>
		

</body>
</html>