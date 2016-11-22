<%--
  Created by IntelliJ IDEA.
  User: xieql2
  Date: 2016/11/21
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h2><s:property value="messageStore.message"/></h2>
<p>I've said hello <s:property value="helloCount"/> times</p>
<p><s:property value="messageStore" /></p>
</body>
</html>
