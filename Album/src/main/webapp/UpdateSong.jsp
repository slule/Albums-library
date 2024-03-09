<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Song</title>
</head>
<body>
<form action="UpdateSong" method="post">
	New Song Name: <input type="text" name="songName" size="25" />
	New Artist Name: <input type="text" name="artistName" size="25" />
	New Album Name: <input type="text" name="albumName" size="25" />
	Enter the Current Song Name: <input type="text" name=oldName size="25"/>
	<input type="submit" value="update" />
	
	</form>

</body>
</html>