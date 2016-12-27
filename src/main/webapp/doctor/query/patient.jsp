<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>患者查询</title>
    
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
    <form action="" method="post">
     <table border="1" align="center">
       <tr>
         <td colspan="2" align="center">患者查询</td>
       </tr>
       <tr>
         <td align="left">ID号：</td>
         <td><input type="text" name="id" /></td>
       </tr>
       <tr>
         <td align="left">用户名：</td>
         <td><input type="text" name="userName" /></td>
       </tr>
       <tr>
         <td>性别：</td>
         <td><input type="radio" name="radiobutton" checked="checked"/>男
             <input type="radio" name="radiobutton" />女
          </td>
       </tr>
       <tr>
         <td>出生日期：</td>
         <td>
            <select name="select1" >
            <option value="1978">1978</option>
            <option value="1979">1979</option>
            <option value="1980">1980</option>
            <option value="1981">1981</option>
            <option value="1982">1982</option>
            <option value="1983">1983</option>
            <option value="1984">1984</option>
            <option value="1985">1985</option>
            <option value="1986">1986</option>
            <option value="1987">1987</option>
            <option value="1988">1988</option>
            <option value="1989">1989</option>
            <option value="1990">1990</option>
            <option value="1991">1991</option>
            <option value="1992">1992</option>
            <option value="1993">1993</option>
            <option value="1994">1994</option>
            <option value="1995">1995</option>
            <option value="1996">1996</option>
            <option value="1997">1997</option>
            <option value="1998">1998</option>
            <option value="1999">1999</option>
            <option value="2000">2000</option>
            <option value="2001">2001</option>
            <option value="2002">2002</option>
            <option value="2003">2003</option>
            <option value="2004">2004</option>
            <option value="2005">2005</option>
            <option value="2006">2006</option>
            <option value="2007">2007</option>
            <option value="2008">2008</option>
            <option value="2009">2009</option>
            <option value="2010">2010</option>
            <option value="2011">2011</option>
            <option value="2012">2012</option>
            <option value="2013">2013</option>
            <option value="2014">2014</option>
            <option value="2015">2015</option>
            <option value="2016">2016</option>
            </select>年
            <select name="select2" >
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            </select>月
             <select name="select3" >
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
            <option value="24">24</option>
            <option value="25">25</option>
            <option value="26">26</option>
            <option value="27">27</option>
            <option value="28">28</option>
            <option value="29">29</option>
            <option value="30">30</option>
            <option value="31">31</option>
            </select>日
          </td>
       </tr>
       <!-- 
       <tr>
          <td>你所在地：</td>
          <td>
            <select name="select4" size="1" >
            <option value="1" selected>北京</option>
            <option value="2">新疆</option>
            <option value="3">天津</option>
            <option value="4">河北</option>
            <option value="5">上海</option>
            <option value="6">河南</option>
            <option value="7">吉林</option>
            <option value="8">黑龙江</option>
            <option value="9">内蒙古</option>
            <option value="10">山东</option>
            <option value="11">山西</option>
            <option value="12">陕西</option>
            <option value="13">甘肃</option>
            <option value="14">宁夏</option>
            <option value="15">青海</option>
            <option value="16">辽宁</option>
            <option value="17">江苏</option>
            <option value="18">浙江</option>
            <option value="19">安徽</option>
            <option value="20">广东</option>
            <option value="21">海南</option>
            <option value="22">广西</option>
            <option value="23">云南</option>
            <option value="24">贵州</option>
            <option value="25">四川</option>
            <option value="26">重庆</option>
            <option value="27">西藏</option>
            <option value="28">香港</option>
            <option value="29">澳门</option>
            <option value="30">福建</option>
            <option value="31">江西</option>
            <option value="32">湖南</option>
            <option value="33">湖北</option>
            <option value="34">台湾地区</option>
            <option value="35">其他</option>
            </select>省
          </td>
       </tr>
        -->
       <tr>
         <td><input type="submit" name="submit" value="确定"/></td>
         <td><input type="reset" name="reset" value="取消"/></td>
       </tr>
     </table>
  </form>
  </body>
</html>
