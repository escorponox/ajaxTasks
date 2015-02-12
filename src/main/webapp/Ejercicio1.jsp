<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="<c:url value="/scripts/jquery-2.1.3.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/scripts/ajaxFunctions.js" />"></script>

<html>
<head>
    <title>Ajax Exes</title>
</head>
<body>
<form>
    <div style="float: left;">
        <select id='select' name="select" onchange='ajax3(this,"targetDiv");'>
            <option value="1">Carlos</option>
            <option value="2">Antonio</option>
            <option value="3">Juan</option>
        </select>
    </div>
    <div id="targetDiv"></div>
</form>
</body>
</html>
