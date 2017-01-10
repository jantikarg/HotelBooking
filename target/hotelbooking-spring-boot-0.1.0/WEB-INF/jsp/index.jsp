<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<title>Home Page</title>
</head>
<body>
<h1>
	Hotel Booking - Home Page
</h1>

<a href="<spring:url value="/viewlowestpriced" />">View Lowest Priced Hotels</a><br>
<a href="<spring:url value="/booking" />">Book a room</a>

</body>
</html>
