<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mobile Validation Form</title>
</head>
<body>
    <h1>Mobile Validation Form</h1>
    <s:form action="validateMobile" method="post">
        <s:textfield key="mobileNumber" label="Mobile Number" />
        <s:submit value="Submit" />
    </s:form>
</body>
</html>