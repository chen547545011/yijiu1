<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>疾病查询</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="doctor/query/dise" method="post">
     <table border="1" align="center">
       <tr>
         <td colspan="2" align="center">部位查询</td>
         
       </tr>
       <tr>
         <td align="left">部位：</td>
         <td>
            <input type="text" name="bodypart.part" value="五官科"/>
          </td>
       </tr>
       <tr>
         <td align="left">疾病名称：</td>
         <td>
            <input type="text" name="tcmdiseaseName" value="牙痛"/>
          </td>
       </tr>
       <tr>
         <td><input type="submit" name="submit" value="确定"/></td>
         <td><input type="reset" name="reset" value="取消"/></td>
       </tr>
     </table>
     </form>
  </body>
</html>
