<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.12.2015
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="/resources/css/left-side.css" type="text/css">
  <link rel="stylesheet" href="/resources/css/admin.css" type="text/css">
  <link rel="stylesheet" href="/resources/css/buttons.css" type="text/css">
  <link rel="stylesheet" href="/resources/css/teacher.css" type="text/css">
</head>

<body>
<div id="left-side">
  <div class="block">
    <img id="photo"><span id="name">Name: <span class="role">Maxik           Kostenko</span></br>Role: <span class="role">Teacher</span></span>
  </div>
  <input class="button"  type="button" value="logout">

  <div id="menu">
    <ul class="items">
      <li class="main-item active">
        My subjects
      </li>
      <div class="triangle"></div>
    </ul>
  </div>
</div>
<div id="subjects">
  <div class="filter">
    <input id="field" type="text"  />
    <div id="search_icon">
      <div id="circle"></div>
      <div id="stick"></div>
    </div>
  </div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
  <div class="subject">Subject 1</div>
</div>
<div id="content">
  <div class="day">
    <table>
      <th class="day-name">Mn</th>
      <th>Class</th>
      <th>Subject</th>
      <tr>
        <td>8:30-9:50</td>
        <td>3-230</td>
        <td><div class="subject">Subject 1</div></td>
      </tr>

    </table>
  </div>
</div>

</body>

</html>