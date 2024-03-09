<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Albums</title>
</head>
<body>
List of Albums
	<table>	
		<c:forEach items="${requestScope.allAlbum}" var="currentalbum">
			<tr>
				<td>${currentalbum.albumName} </td>
				<td>${currentalbum.yearReleased} </td>
			</tr>
			<c:forEach items="${currentalbum.song}" var="currentsong">
				<tr>

					<td>${currentsong.songName} </td>
					<td>${currentsong.artistName} </td>
				
				</tr>
			</c:forEach>
				
	
		</c:forEach>
	
	</table>

</body>
</html>