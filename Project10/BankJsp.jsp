<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<script type="text/javascript">
var lab;
var toacc;
function init()
{
lab = document.getElementById("lab");
toacc = document.getElementById("toAcc");
}
function enable()
{
lab.hidden=false;
toacc.hidden=false;
}
function disable()
{
lab.hidden=true;
toacc.hidden=true;
}
</script>
</head>
<body onload="init()">
<form action="BankSer3" method="post">
Account No: <%= session.getAttribute("acc") %><br/>
<input type="radio" name="tr" value="dep" onchange="disable()"/>Deposit
<input type="radio" name="tr" value="wid" onchange="disable()"/>Withdraw
<input type="radio" name="tr" value="tra" onchange="enable()"/>Transfer
<br/>Amount: <input name="amount"/><br/>
<label id="lab" hidden="ture">To Account No: </label><input id="toAcc" name="toAcc" hidden="true"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>
