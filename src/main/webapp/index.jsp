<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<title>Basic Struts 2 Application - Welcome</title>
<body>
<h1>Welcome to Struts 2!</h1>
<p>
<a href="<s:url action='hello'/>">Hello World</a>
</p>

<s:url action="hello" var="helloLink" id="helloLink">
    <s:param name="userName">Bruce Phillips</s:param>
</s:url>
//TODO:???helloLink????
<p><a href="${helloLink}">Hello Bruce Phillips</a></p>

<p>Get your own personal hello by filling out and submitting this form.</p>
<s:form action="hello">
    <s:textfield name="userName" label="Your name"/>
    <s:submit value="Submit"/>

</s:form>
<p><a href="register.jsp">Please register</a> for our prize drawing.</p>

</body>
</html>
