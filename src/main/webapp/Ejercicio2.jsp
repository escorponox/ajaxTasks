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
        <table>
            <tr>
                <td><a id="link1" onclick="ajax2(this,'targetDiv')">/ajax/ejercicio2/a.html</a></td>
            </tr>
            <tr>
                <td><a id="link2" onclick="ajax2(this,'targetDiv')">/ajax/ejercicio2/b.html</a></td>
            </tr>
            <tr>
                <td><a id="link3" onclick="ajax2(this,'targetDiv')">/ajax/ejercicio2/c.html</a></td>
            </tr>
        </table>
    </div>
    <div id="targetDiv"></div>
</form>
</body>
</html>
