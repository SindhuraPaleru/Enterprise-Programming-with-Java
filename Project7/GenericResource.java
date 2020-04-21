package com;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
@Path("generic")
public class GenericResource {
@Context
private UriInfo context;
double res;
String f;
String se,result;
public GenericResource() {
}
@GET
@Path("{n1}")
@Produces(MediaType.TEXT_PLAIN)
public String getText(@PathParam("n1") String text) {
//throw new UnsupportedOperationException();
char[] ch=new char[text.length()];
int flag=0;
result=text;
for(int i=0;i<text.length();i++)
{
if(i==0)
{
if(text.startsWith("-")){
ch[i]='0';
text=text.replaceFirst("-","0");
flag=1;
}
}
else
{
ch[i]=text.charAt(i);
}
if(ch[i]=='|')
ch[i]='/';
}
for(int i=0;i<text.length()-1;i++)
{
switch (ch[i]) {
case '+':f=text.substring(0,i);
se=text.substring(i+1,text.length());
if(flag==1)
{
res=Double.parseDouble(se)-Double.parseDouble(f);
result=String.valueOf(res);
}
else
{
res=Double.parseDouble(f)+Double.parseDouble(se);
result=String.valueOf(res);
}
break;
case '-':
f=text.substring(0,i);
se=text.substring(i+1,text.length());
if(flag==1)
{
res=Double.parseDouble(f)+Double.parseDouble(se);
System.out.println(res);
result=String.valueOf(res);
result="-"+result;
}
else
{
res=Double.parseDouble(f)-Double.parseDouble(se);
result=String.valueOf(res);
}
break;
case '/':
f=text.substring(0,i);
se=text.substring(i+1,text.length());
if(flag==1)
{
res=(Double.parseDouble(f))/(Double.parseDouble(se));
result=String.valueOf(res);
result="-"+result;
}
else
{
res=(Double.parseDouble(f))/(Double.parseDouble(se));
result=String.valueOf(res);
}
break;
case '*':
f=text.substring(0,i);
se=text.substring(i+1,text.length());
System.out.println("ses"+se);
if(flag==1)
{
res=Double.parseDouble(se)*Double.parseDouble(f);
result=String.valueOf(res);
result="-"+result;
}
else
{
res=Double.parseDouble(f)*Double.parseDouble(se);
result=String.valueOf(res);
}
break;
default:
break;
}
}
return result;
}
@PUT
@Consumes(MediaType.TEXT_PLAIN)
public void putText(String content) {
}
}
