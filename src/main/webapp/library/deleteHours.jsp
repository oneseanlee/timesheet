<%@ page import="timeSheet.UtilWeb" %>
<%@ page import="timeSheet.database.manager.HoursManager" %>
<%--
  User: John Lawrence
  Date: 3/6/11
  Time: 8:15 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
UtilWeb.checkSession(session, out, false, false);
HoursManager hourManager = new HoursManager();
hourManager.removeByID(Integer.parseInt(request.getParameter("id")));
%>
<html>
<body>
<script type="text/javascript">
    window.history.back();
</script>
</body>
</html>
