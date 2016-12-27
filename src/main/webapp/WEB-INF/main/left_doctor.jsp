<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>医生左界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 进行格式控制 -->
    <style type="text/css">
      *{margin:0;padding:0;list-style-type:none;}
      a,img{border:0;text-decoration:none;}
      body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}
      .b{display:block;height:15px;line-height:15px;overflow:hidden;padding:5px 25px;font-weight:bold;color:white;background:url(expanded.gif) no-repeat 10px center;cursor:pointer;border-bottom:1px solid #ddd;}
    </style>
     <!-- 应用sdmenu.css，sdmenu.js进行列表展示 -->
    <link rel="stylesheet" type="text/css" href="css/sdmenu.css" />
    <script type="text/javascript" src="js/sdmenu.js"></script>
    <script type="text/javascript">
        var myMenu;
        window.onload = function() 
        {
	      myMenu = new SDMenu("my_menu");
	      myMenu.init();
        };
    </script>
  </head>
  <body>
  <br/>
   <div class="sdmenu">
   
     <a href="../doctor/disease.jsp" target="bottom">疾病</a><br>
     <div id="my_menu">
      <div>
		<span>查询</span>
		<a href="../doctor/query/disease.jsp" target="bottom">疾病</a>
		<a href="../doctor/query/meridians.jsp" target="bottom">经络</a>
		<a href="../doctor/query/patient.jsp" target="bottom">患者</a>
	 </div>
    </div>
    <br>
   <a href="../doctor/recipe.jsp" target="bottom">处方</a><br>
   <a href="../doctor/doctor_study.jsp" target="bottom">医生学习</a><br>
   <a href="../doctor/history_record.jsp" target="bottom">历史记录</a><br> 
   <a href="../doctor/case_share.jsp" target="bottom">案例分享</a><br> 
  </div>
  </body>
</html>
<!-- 简易的下拉列表 -->
     <!-- 
  <a href="#" onmouseover="this.style.color='#0000ff'" onmouseout="this.style.color='#9532ff'" onclick="return OnClickDiv('test3');">
    <p>
                         查询
  </a> 
  </p>
  <div Id="test3" Style="Display:none">
     <a href="../doctor/disease.jsp" target="bottom">疾病</a><br> 
     <a href="../doctor/disease.jsp" target="bottom">经络</a><br> 
     <a href="../doctor/disease.jsp" target="bottom">患者</a><br> 
  </div>

  <script language="JavaScript">
    function OnClickDiv(DivId)
    {
      if(document.all[DivId].style.display=='none')
      {
         document.all[DivId].style.display='';
      } 
      else
      {    
         document.all[DivId].style.display='none';
      }
      return 0;
   }
</script>
 -->



