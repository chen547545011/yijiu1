<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <base href="<%=basePath%>">
        <meta charset="utf-8" />
        <title>针灸电子病历系统</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1.0" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <meta name="MobileOptimized" content="320">

        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        
        
        
        <!-- BEGIN THEME STYLES -->
        <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/plugins.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="assets/css/custom.css" rel="stylesheet" type="text/css" />
        <!-- END THEME STYLES -->

        <link rel="shortcut icon" href="app/img/favicon.ico" />
    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class="page-header-fixed"  >
        <!-- BEGIN HEADER -->
        <div class="header navbar navbar-inverse navbar-fixed-top">
            <!-- BEGIN TOP NAVIGATION BAR -->
            <div class="header-inner">
                <!-- BEGIN LOGO -->
                <a class="navbar-brand" href="javascript:;">
                    <img src="assets/img/logo.png" alt="logo" class="img-responsive" />
                </a>
                <!-- END LOGO -->
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <img
                    src="assets/img/menu-toggler.png" alt="" />
                </a>
                <!-- END RESPONSIVE MENU TOGGLER -->
                <!-- BEGIN TOP NAVIGATION MENU -->
                <ul class="nav navbar-nav pull-right">
                    <li class="dropdown user">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                            <img alt="" src="assets/img/avatar1_small.jpg"/>
                            <span class="username"> ${userInfo.username } </span>
                            <i class="fa fa-angle-down"></i>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="javascript:;" id="trigger_fullscreen">
                                    <i class="fa fa-move"></i> 全屏
                                </a>
                            </li>
                            <li>
                                <a href="extra_lock.html">
                                    <i class="fa fa-lock"></i> 锁屏
                                </a>
                            </li>
                            <li>
                                <a href="login.jsp">
                                    <i class="fa fa-key"></i> 退出
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!-- END USER LOGIN DROPDOWN -->
                </ul>
                <!-- END TOP NAVIGATION MENU -->
            </div>
            <!-- END TOP NAVIGATION BAR -->
        </div>
        <!-- END HEADER -->
        <div class="clearfix"></div>
        <!-- BEGIN CONTAINER -->
        <div class="page-container">
            <!-- BEGIN SIDEBAR -->
            <div class="page-sidebar-wrapper">
                <div class="page-sidebar navbar-collapse collapse">
                    <!-- BEGIN SIDEBAR MENU -->
                    <ul class="page-sidebar-menu" id="page-sidebar-menu">
                        <li class="sidebar-toggler-wrapper">
                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                            <div class="sidebar-toggler hidden-phone"></div>
                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                        </li>

                        <li class="start active">
                            <a href="rest/page/dashboard" id="btn-dashboard">
                                 <i ></i> <span class="title"> 疾病 </span><span
                                class="selected"> </span>
                            </a>
                        </li>

                        <li class="">
                            <a href="javascript:;">
                                 <i ></i><span class="title">查询 </span><span
                                class="arrow "> </span>
                            </a>
                            <ul class="sub-menu" >
                                <li>
                               
                                    <a href="disease.jsp" id="btn-dashboard" target="maincontent">
                                        疾病
                                    </a>
                                </li>
                                <li>
                                    <a href="meridian.jsp" id="btn-dashboard" target="maincontent">
                                        经络
                                    </a>
                                </li>
                                <li>
                                    <a href="hz.jsp" id="btn-dashboard" target="maincontent">
                                        患者
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li class="start active">
                            <a href="cf.jsp" id="btn-dashboard" target="maincontent">
                                <i ></i><span class="title"> 处方 </span><span
                                class="selected"> </span>
                            </a>
                        </li>
                        
                        <li class="start active">
                            <a href="ysxx.jsp" id="btn-dashboard" target="maincontent">
                                <i></i><span class="title"> 医生学习</span><span
                                class="selected"> </span>
                            </a>
                        </li>
                        
                        <li class="start active">
                            <a  href="lsjl.jsp" id="btn-dashboard" target="maincontent">
                                <i></i><span class="title">历史记录 </span><span
                                class="selected"> </span>
                            </a>
                        </li>
                        
                        <li class="start active">
                            <a href="alfx.jsp" id="btn-dashboard" target="maincontent">
                                <i></i><span class="title"> 案例分享</span><span
                                class="selected"> </span>
                            </a>
                        </li>
                                
     
                            </ul>
                        </li>

                    </ul>
                    <!-- END SIDEBAR MENU -->
                </div>
            </div>
            <!-- END SIDEBAR -->
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <div class="page-content">
              
                    
                    <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
                    <!-- BEGIN STYLE CUSTOMIZER -->
                    <div class="theme-panel hidden-xs hidden-sm">
                        <div class="toggler"></div>
                        <div class="toggler-close"></div>
                        <div class="theme-options">
                            <div class="theme-option theme-colors clearfix">
                                <span> 主题颜色 </span>
                                <ul>
                                    <li class="color-black current color-default" data-style="default"></li>
                                    <li class="color-blue" data-style="blue"></li>
                                    <li class="color-brown" data-style="brown"></li>
                                    <li class="color-purple" data-style="purple"></li>
                                    <li class="color-grey" data-style="grey"></li>
                                    <li class="color-white color-light" data-style="light"></li>
                                </ul>
                            </div>
                            <div class="theme-option">
                                <span> 布局 </span>
                                <select class="layout-option form-control input-small">
                                    <option value="fluid">顺序</option>
                                    <option value="boxed">盒状</option>
                                </select>
                            </div>
                           
                            
                            <div class="theme-option">
                                <span> 工具栏位置 </span>
                                <select class="sidebar-pos-option form-control input-small">
                                    <option value="left">左边</option>
                                    <option value="right">右边</option>
                                </select>
                            </div>
                            
                        </div>
                    </div>
                    <!-- END STYLE CUSTOMIZER -->

                    <!-- BEGIN PAGE HEADER-->
                    <div class="row">
                        <div class="col-md-12">
                            <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                            <h3 class="page-title" id="index-page-title">针灸电子病例系统</h3>
                            <ul class="page-breadcrumb breadcrumb">
                                <li>
                                    <i class="fa fa-home"></i>
                                    <a href="javascript:;">
                                        首页
                                    </a>
                                    <i class="fa fa-angle-right"></i>
                                </li>
                               
                            </ul>
                            <!-- END PAGE TITLE & BREADCRUMB-->
                        </div>
                    </div>
                    <!-- END PAGE HEADER-->
                   
                   
                    <!-- 轮播（Carousel）指标 -->
                     
                      <div id="main-content" class="carousel slide">
                       <iframe  name="maincontent"  frameborder="no"  allowtransparency="true" style="background:url(assets/img/01.jpg);background-size:100%"></iframe> 
   <!-- 轮播（Carousel）指标 -->
   <ol class="carousel-indicators">
      <li data-target="#main-content" data-slide-to="0" class="active"></li>
      <li data-target="#main-content" data-slide-to="1" class="active"></li>
      <li data-target="#main-content" data-slide-to="2" class="active"></li>
   </ol>   
   <!-- 轮播（Carousel）项目 -->
   <div class="carousel-inner">
      <div class="item active">
         <img src="/assets/image/avatar1.jpg" alt="1" >
      </div>
      <div class="item">
         <img src="/assets/image/avatar2.jpg" alt="2">
      </div>
      <div class="item">
         <img src="/assets/image/avatar3.jpg" alt="3" >
      </div>
   </div>
   <!-- 轮播（Carousel）导航 -->
   <a class="carousel-control left" href="#main-content" 
      data-slide="prev">&lsaquo;</a>
   <a class="carousel-control right" href="#main-content" 
      data-slide="next">&rsaquo;</a>
</div> 
                     
                     </div> 
                  
                    <!-- END PORTLET-->
                   
                </div>
            </div>
            <!-- END CONTENT -->
        </div>
        <!-- END CONTAINER -->
        <!-- BEGIN FOOTER -->
        
        <!--[if lt IE 9]>
        <script src="assets/plugins/respond.min.js"></script>
        <script src="assets/plugins/excanvas.min.js"></script>
        <![endif]-->
         <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
        <script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
        <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
   
        <script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>

        <script src="assets/scripts/app.js" type="text/javascript"></script>
        <script type="text/javascript" src="app/js/index.js"></script>

        <!-- <script data-main="app/js/main" src="app/lib/requirejs/require.js"></script> -->
    </body>
</html>