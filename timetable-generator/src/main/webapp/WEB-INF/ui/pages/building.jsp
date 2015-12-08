<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.12.2015
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="resources/css/left-side.css" type="text/css">
    <link rel="stylesheet" href="resources/css/admin.css" type="text/css">
    <link rel="stylesheet" href="resources/css/buttons.css" type="text/css">

    <!--<script src="js/menu.js" type="text/javascript"></script>-->
</head>

<body>
<div id="left-side">

    <div class="block">
        <img id="photo"><span id="name">Name: <span class="role">NGD123</span></br>Role: <span
            class="role">Admin</span></span>
    </div>
    <input class="button" type="button" value="logout">

    <div id="menu">
        <ul class="items">
            <li class="main-item">
                <a href="faculty.html">Faculty</a>
            </li>
            <div class="triangle triangle2"></div>
            <li class="main-item active">
                <a href="building.html">Building</a>
            </li>
        </ul>
    </div>

</div>

<div id="top-links">
    <ul class="breadcrumb">
        <li><a href="building.html">Building</a></li>
    </ul>
</div>

<div id="content">
    <c:forEach var="building" items="${buildings}">
        <div class="entity">
            <input type="hidden" value="${building.id}"/>
            <div class="del-pane">
                &#10006;
            </div>
            <div id="f-name"><a href="rooms.html?id=${building.id}"><span>${building.name}</span></a></div>
            <div class="edit-pane active">
                &#9998;edit
            </div>
        </div>
    </c:forEach>
    <div class="add active">
        +
    </div>
</div>


<script src="resources/js/jquery-2.1.3.min.js" type="text/javascript"></script>
<script src="resources/js/building.js" type="text/javascript"></script>
</body>

</html>