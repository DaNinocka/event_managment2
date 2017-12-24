<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Event Manager</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        h1{
            color: white;
            font-family: "Microsoft Sans Serif";
        }
        .dugmence {
            background-color: purple;
            border: groove;
            color: white;
            padding: 10px 10px;
            text-align: center;
            text-decoration: solid;
            font-family: "Microsoft Sans Serif";
            font-size: 15px;
            width: 200px;
            border-radius: 15px;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;


        }
        .dugmence:hover {
            background-color: plum;
            color: purple;
        }

        th {
            background-color: plum;
            border: 2px solid grey;
            text-align: center;
            border-style: groove;
            color: white;
            padding: 20px;

        }
        .slika{
            width: 1800px;


        }
        .tag {
            font-family: "Microsoft Sans Serif";
            font-size: large;
            border-collapse: collapse;

        }
        .adding{
            font-family: "Microsoft Sans Serif";
            font-size: large;
            border-collapse: collapse;
            width: 1400px;
            height: 400px;
            margin: 0px auto;


        }
        .list {
            border: 2px solid grey;
            text-align: center;
            padding: 20px;
            width: 1400px;

        }
        .list:nth-child(even) {background-color: papayawhip;}
    </style>

</head>
<body>
<div class="w3-container w3-purple">
    <h1>Event Manager</h1>

</div>

<div class="slika">
    <img src="resources/Upcoming-Events.jpg" alt="slika" style="width:1400px"/>
</div>
<h2 align="left">Add your Event</h2>
<br>

<c:url var="addAction" value="/add" ></c:url>

<form:form action="${addAction}" commandName="event">
    <table class="adding">
        <c:if test="${!empty event.name}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="id" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Name(required)"/>
                </form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="location">
                    <spring:message text="Location(required)"/>
                </form:label>
            </td>
            <td>
                <form:input path="location" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="start_date">
                    <spring:message text="Start date (required in format YYYY-MM-DD)"/>
                </form:label>
            </td>
            <td>
                <form:input path="start_date" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="start_time">
                    <spring:message text="Start time (required in format HH:MM:SS)"/>
                </form:label>
            </td>
            <td>
                <form:input path="start_time" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="end_date">
                    <spring:message text="End date(required in format YYYY-MM-DD) "/>
                </form:label>
            </td>
            <td>
                <form:input path="end_date" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="end_time">
                    <spring:message text="End time (required in format HH:MM:SS)"/>
                </form:label>
            </td>
            <td>
                <form:input path="end_time" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty event.name}">
                    <input type="submit" class="dugmence"
                           value="<spring:message text="Update Event"/>" />
                </c:if>
                <c:if test="${empty event.name}">
                    <input type="submit" class="dugmence"
                           value="<spring:message text="Add Event"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>Check out list of upcoming Events</h3>
<c:if test="${!empty listEvents}">
    <table class="tag">
        <tr>
            <th>Event ID</th>
            <th>Event Name</th>
            <th>Event Location</th>
            <th>Start date</th>
            <th>Start time</th>
            <th>End date</th>
            <th>End time</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${listEvents}" var="event">
            <tr>
                <td class="list">${event.id}</td>
                <td class="list">${event.name}</td>
                <td class="list">${event.location}</td>
                <td class="list">${event.start_date}</td>
                <td class="list">${event.start_time}</td>
                <td class="list">${event.end_date}</td>
                <td class="list">${event.end_time}</td>
                <td class="list">
                    <a href="<c:url value='/edit/${event.id}' />" >
                    <img class="slicka" src="resources/update.png" style="height:50px;">
                    </a>
                </td>
                <td class="list"><a href="<c:url value='/remove/${event.id}' />" >
                    <img class="slicka" src="resources/delete.png"alt="more"style="height:50px;">
                </a></td>
            </tr>


        </c:forEach>
    </table>
</c:if>
<br>
<br>
<br>
<br>
<br>
<br>

<footer class="w3-container w3-gray">
    <p>Copyright Event Manager © 2017. All Rights Reserved</p>
</footer>

</body>
</html>
