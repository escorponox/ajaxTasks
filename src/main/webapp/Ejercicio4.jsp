<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="<c:url value="/scripts/jquery-2.1.3.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/scripts/ajaxFunctions.js" />"></script>

<html>
<head>
    <title>Ajax Exes</title>
</head>
<body>
<form id="elForm">
    <div id="form" style="float: left;">
        <table>
            <tr>
                <td><label for="input1">input1: </label></td>
                <td><input type="text" id="input1"/></td>
            </tr>
            <tr>
                <td><label for="input2">input2: </label></td>
                <td><input type="text" id="input2"/></td>
            </tr>
            <tr>
                <td><label for="input3">input3: </label></td>
                <td><input type="text" id="input3"/></td>
            </tr>
        </table>
        <a id="submit" onclick="ajax4()">Submit</a>
    </div>
</form>
</body>
</html>