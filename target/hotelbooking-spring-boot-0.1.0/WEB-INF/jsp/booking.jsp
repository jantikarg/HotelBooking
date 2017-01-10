<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Hotel Booking Page</title>
</head>
<body>
<h1>
	Hotel Booking - Enter Details of Hotel to Book
</h1>
<c:if test="${SUCCESS_MESSAGE != null}">
  <div id="status_message">${SUCCESS_MESSAGE}</div>
</c:if> 
<form:form method="POST" action="/bookaroom" commandName="book">
   <table>
    <tr>
        <td><form:label path="customerName">Name</form:label></td>
        <td><form:input cssClass="required" required="required" path="customerName" /></td>
        <td><form:errors path="customerName" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="city">City</form:label></td>
        <td><form:select cssClass="required" required="required" path="city" id="city" name="city">
		   <option value="Bangalore">Bangalore</option>
		   <option value="Chennai">Chennai</option>
		   <option value="Mumbai">Mumbai</option>
		   <option value="Delhi">Delhi</option>
		</form:select></td>
        <td><form:errors path="city" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="hotelName">Hotel</form:label></td>
        <td><form:select cssClass="required" required="required" id="hotelName" path="hotelName" name="hotelName">
		   <option value="Marriot">Marriot</option>
		   <option value="Taj">Taj</option>
		   <option value="Clarion">Clarion</option>
		</form:select></td>
        <td><form:errors path="hotelName" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="checkinDate">Checkin Date</form:label></td>
        <td><form:input type="text" cssClass="datepicker start required" required="required" path="checkinDate" /></td>
        <td><form:errors path="checkinDate" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="checkoutDate">Checkout Date</form:label></td>
        <td><form:input type="text" cssClass="datepicker end required" required="required" path="checkoutDate" /></td>
        <td><form:errors path="checkoutDate" cssClass="error" /></td>
    </tr>
    <tr>
        <td><form:label path="roomsBooked">Rooms</form:label></td>
        <td><form:input cssClass="required" required="required" path="roomsBooked" /></td>
        <td><form:errors path="roomsBooked" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" name="submit" value="Submit"/>
        </td>
        <td colspan="2">
            <input type="submit" name="cancel" value="Cancel"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>
