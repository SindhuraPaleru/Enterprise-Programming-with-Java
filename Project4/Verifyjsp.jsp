<%-- 
    Document   : verifyjsp
    Created on : Feb 1, 2020, 1:16:54 PM
    Author     : sindh
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <body>
        <jsp:useBean id="obj" class="beanpack.BeanClass"></jsp:useBean>
        <jsp:setProperty name="obj" property="*"></jsp:setProperty>
          <sql:setDataSource var = "ds" driver = "org.apache.derby.jdbc.ClientDriver"
         url = "jdbc:derby://localhost:1527/logindb"
         user = "sa"  password = "sqlserver"/>
        <sql:update dataSource="${ds}" var="db">  
insert into LOGINBEAN values('<jsp:getProperty name="obj" property="tbname"></jsp:getProperty>','<jsp:getProperty name="obj" property="section"></jsp:getProperty>','<jsp:getProperty name="obj" property="branch"></jsp:getProperty>','<jsp:getProperty name="obj" property="tbun"></jsp:getProperty>','<jsp:getProperty name="obj" property="tbpwd"></jsp:getProperty>','<jsp:getProperty name="obj" property="gender"></jsp:getProperty>','<jsp:getProperty name="obj" property="tbregd"></jsp:getProperty>',<jsp:getProperty name="obj" property="tbcgpa"></jsp:getProperty>)
</sql:update> 
           Successfull registration
<jsp:include page="/index.html"></jsp:include>
    </body></html>
