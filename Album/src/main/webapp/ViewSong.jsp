<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Songs</title>
</head>
<body>
List of Songs
	<table>
	
		<c:forEach items="${requestScope.songList}" var="currentSong">
			<tr>
				
				<td>${currentSong.songName} </td>
				<td>${currentSong.artistName} </td>
				
				
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>