<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>List Hotel Page</title>
</head>
<body>
<h1>
	Hotel Booking - Lowest Priced Hotels
</h1>
<form:form method="POST" action="/bookaroom" commandName="book">
<table>
	<tr>
		<th>Name</th>
		<th>City</th>
		<th>Rooms</th>
		<th>Rating</th>
		<th>Tariff</th>
	</tr>
	<%--${hotellist} --%>
	 <c:forEach items="${hotellist}" var="hotel">
		<tr>
			<td><input name="Name" disabled="true" value="${hotel.name}"/></td>
			<td><input name="City" disabled="true" value="${hotel.city}"/></td>
			<td><input name="Rooms" disabled="true" value="${hotel.numberOfRooms}"/></td>
			<td><input name="Rating" disabled="true" value="${hotel.starRating}"/></td>
			<td><input name="Tariff" disabled="true" value="${hotel.tariff}"/></td>
		</tr>
	</c:forEach>
	<tr colspan="2">
            <td><input type="submit" name="cancel" value="Cancel"/></td>
    </tr>
</table>	
</form:form>
</body>
</html>
