<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医生登陆</title>
</head>
<body>
	<form action="doctor/login" method="post">
		<table width="207" border="0" align="center">
			<tr>
				<td colspan="2" align="center" nowrap="nowrap">用户注册</td>
			</tr>
			<tr>
				<td width="68" nowrap="nowrap">用户ID</td>
				<td width="127" nowrap="nowrap"><label> <input
						name="userId" type="text" id="userId" size="20" /> </label></td>
			</tr> 
			<tr>
				<td width="68" nowrap="nowrap">密码</td>
				<td width="127" nowrap="nowrap"><label> <input
						name="password" type="text" id="password" size="20" /> </label></td>
			</tr> 
			<tr>
				<td colspan="2" align="center" nowrap="nowrap"><label>
						<input type="submit" value="登陆" /> <input type="reset" value="重填" />
				</label></td>
			</tr>
		</table>
	</form>
</body>
</html>