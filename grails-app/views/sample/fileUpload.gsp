<%--
  Created by IntelliJ IDEA.
  User: neha
  Date: 1/3/16
  Time: 4:01 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>


<g:uploadForm name="upload" controller="sample" action="gFileUpload">
    <input type="file" name="myFile"/>
    <g:submitButton name="submit" value="submit"/>
</g:uploadForm>

<a href="${createLink(controller: 'sample',action: 'createOrderPDF')}">Download</a>
</body>
</html>