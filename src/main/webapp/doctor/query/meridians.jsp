<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>经络查询</title>
    
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
    <form action="doctor/query/meri" method="post">
     <table border="1" align="center">
       <tr>
         <td colspan="2" align="center">经络查询</td>
         
       </tr>
       <tr>
         <td align="left">经脉：</td>
         <td>
            <select name="select1" >
            <option value="足阳明胃经">足阳明胃经</option>
            <option value="手阳明大肠经">手阳明大肠经</option>
            <option value="足少阳胆经">足少阳胆经</option>
            <option value="手少阳三焦经">手少阳三焦经</option>
            <option value="足太阳膀胱经">足太阳膀胱经</option>
            <option value="手太阳小肠经">手太阳小肠经</option>
            <option value="足太阴脾经">足太阴脾经</option>
            <option value="手太阴肺经">手太阴肺经</option>
            <option value="足阙阴肝经">足阙阴肝经</option>
            <option value="手阙阴心包经">手阙阴心包经</option>
            <option value="足少阴肾经">足少阴肾经</option>
            <option value="手少阴心经">手少阴心经</option>
            
            
            <!-- 任脉、督脉、冲脉、带脉、阴跷脉、阳跷脉、阴维脉、阳维脉 -->
            <option value="任脉">任脉</option>
            <option value="督脉">督脉</option>
            <option value="冲脉">冲脉</option>
            <option value="带脉">带脉</option>
            <option value="阴跷脉">阴跷脉</option>
            <option value="阳跷脉">阳跷脉</option>
            <option value="阴维脉">阴维脉</option>
            <option value="阳维脉 ">阳维脉 </option>
            </select>
          </td>
       </tr>
       <tr>
         <td align="left">穴位：</td>
         <td>
            <select name="select2" >
            
            <!-- 手太阴肺经: 共有11个穴位, 其中9个穴位分布在上肢掌面桡侧，2个穴位在前胸上部. -->
            <option value="中府">中府</option>
            <option value="云门">云门</option>
            <option value="天府">天府</option>
            <option value="侠白">侠白</option>
            <option value="尺泽">尺泽</option>
            <option value="孔最">孔最</option>
            <option value="列缺">列缺</option>
            <option value="经渠">经渠</option>
            <option value="太渊">太渊</option>
            <option value="鱼际">鱼际</option>
            <option value="少商">少商</option>
            
            <!-- 手阳明大肠经: 本经共有20穴。15穴分布在上肢背面的桡侧，5穴在颈、面部 -->
            <option value="商阳">商阳</option>
            <option value="二间">二间</option>
            <option value="三间">三间</option>
            <option value="合谷">合谷</option>
            <option value="阳溪">阳溪</option>
            <option value="偏历">偏历</option>
            <option value="温溜">温溜</option>
            <option value="下廉">下廉</option>
            <option value="上廉">上廉</option>
            <option value="手三里">手三里</option>
            <option value="曲池">曲池</option>
            <option value="肘髎">肘髎</option>
            <option value="手五里">手五里</option>
            <option value="臂臑">臂臑</option>
            <option value="肩髃">肩髃</option>
            <option value="巨骨">巨骨</option>
            <option value="天鼎">天鼎</option>
            <option value="扶突">扶突</option>
            <option value="口禾髎">口禾髎</option>
            <option value="迎香">迎香</option>
            
            <!-- 足阳明胃经: 本经共有45个穴位，15个穴位分布在下肢的前外侧面，30个穴位在腹、胸部和头面部 -->
            <option value="承泣">承泣</option>
            <option value="四白">四白</option>
            <option value="巨髎">巨髎</option>
            <option value="地仓">地仓</option>
            <option value="大迎">大迎</option>
            <option value="颊车">颊车</option>
            <option value="下关">下关</option>
            <option value="头维">头维</option>
            <option value="人迎">人迎</option>
            <option value="水突">水突</option>
            <option value="气舍">气舍</option>
            <option value="缺盆">缺盆</option>
            <option value="气户">气户</option>
            <option value="库房">库房</option>
            <option value="屋翳">屋翳</option>
            <option value="膺窗">膺窗</option>
            <option value="乳中">乳中</option>
            <option value="乳根">乳根</option>
            <option value="不容">不容</option>
            <option value="承满">承满</option>
            <option value="梁门">梁门</option>
            <option value="关门">关门</option>
            <option value="太乙">太乙</option>
            <option value="滑肉门">滑肉门</option>
            <option value="天枢">天枢</option>
            <option value="外陵">外陵</option>
            <option value="大巨">大巨</option>
            <option value="水道">水道</option>
            <option value="归来">归来</option>
            <option value="气冲">气冲</option>
            <option value="髀关">髀关</option>
            <option value="伏兔">伏兔</option>
            <option value="阴市">阴市</option>
            <option value="梁丘">梁丘</option>
            <option value="犊鼻">犊鼻</option>
            <option value="足三里">足三里</option>
            <option value="上巨虚">上巨虚</option>
            <option value="条口">条口</option>
            <option value="下巨虚">下巨虚</option>
            <option value="丰隆">丰隆</option>
            <option value="解溪">解溪</option>
            <option value="冲阳">冲阳</option>
            <option value="陷谷">陷谷</option>
            <option value="内庭">内庭</option>
            <option value="厉兑">厉兑</option>
            <option value="2016">2016</option>
            <option value="2016">2016</option>
            <option value="2016">2016</option>
            <option value="2016">2016</option>
            <option value="2016">2016</option>
            </select>
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
