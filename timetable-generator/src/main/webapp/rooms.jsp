<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.12.2015
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="/resources/css/left-side.css" type="text/css">
  <link rel="stylesheet" href="/resources/css/admin.css" type="text/css">
  <link rel="stylesheet" href="/resources/css/buttons.css" type="text/css">
  <script src="/resources/js/jquery-2.1.3.min.js" type="text/javascript"></script>
  <script src="/resources/js/menu.js" type="text/javascript"></script>
</head>

<body>
<div id="left-side">

  <div class="block">
    <img id="photo"><span id="name">Name: <span class="role">NGD123</span></br>Role: <span class="role">Admin</span></span>
  </div>
  <input class="button"  type="button" value="logout">

  <div id="menu">
    <ul class="items">
      <li class="main-item">
        <a href="faculty.html">Faculty</a>
      </li>
      <div class=""></div>
      <li class="main-item">
        <a href="building.html">Building</a>
      </li>
    </ul>
  </div>

</div>

<div id="top-links">
  <ul class="breadcrumb">
    <li><a href="building.html">Building 1</a></li>
  </ul>
</div>

<div id="content">
  <div class="room">
    <div id="del-pane">
      <a href="#del">&#10006;</a>
    </div>
    <div class="room-f">
      <h3>Room 1</h3>
      <ul class="features">
        <li>Capacity : </li>
        <li>Board :  </li>
        <li>Projector :  </li>
        <li>Computers :  </li>
      </ul>
      <ul class="f-data" >
        <li><span class="adv">20</span></li>
        <li><span class="adv">&#10004;</span></li>
        <li><span class="adv">&#10004;</span></li>
        <li><span class="disadv">&#10006;</span></li>
      </ul>
    </div>
    <div id="edit-pane" class="active">
      <a href="#edit" >&#9998;edit</a>
    </div>
  </div>

  <div class="add active">
    +
  </div>
</div>



</body>

</html>