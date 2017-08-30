<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>大学生户外趴欢迎您</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.css">
<link rel="stylesheet" href="css/Untitled-2.css">
    <link href="css/toastr.css" rel="stylesheet"/>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body >
<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
  <div class="container-fluid"> 
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="#"> </a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
<!--        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a> </li>
        <li><a href="#">Link</a> </li>
        <li><a href="#">Link</a> </li>
        <li><a href="#">Link</a> </li>-->
        <li><a href="#">欢&nbsp;迎&nbsp;使&nbsp;用</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
  
        <li><a role="button"  data-toggle="modal" data-target="#myModal2">管理员登录</a> </li>
      </ul>
    </div>
    <!-- /.navbar-collapse --> 
  </div>
  <!-- /.container-fluid --> 
</nav>
<div class="container" style="padding-top: 100px">
  <div class="row">
    <div class="col-lg-12">
      <div class="jumbotron" >
        <h1 class="text-center"  >College Student's Outdoor Party  welcome !</h1>
        <div class="row" >
          <div class="col-lg-2 col-lg-offset-4 col-md-offset-4 col-md-2 col-sm-offset-3 col-sm-3 col-xs-offset-3 col-xs-3">
            <p><a class="btn btn-success btn-lg" href="#" role="button" data-toggle="modal" data-target="#registerForm">注&nbsp; 册</a> </p>
          </div>
          <div class="col-lg-2 col-md-6 col-sm-6">
            <p><a class="btn btn-primary btn-lg"  role="button"  data-toggle="modal" data-target="#myModal">登 &nbsp;录</a> </p>
          </div>
        </div>
        <p class="text-center">&nbsp;你还在为找不到人聚餐而愁吗？你还在为找不到同学打球而难受吗？你还在为找不到伙伴烧烤篝火无奈吗？大学生户外趴是针对当代大学交际不足，提供的一个交际平台，它丰富课余生活，享受户外活动的魅力，值得大家的参与！！</p>
        <img src="images/c473f13d0268e8699c4dc0cf596c1367.jpg" alt="66666666666666666666" class="img-responsive"> </div>
    </div>
  </div>
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog " style="width:400px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel"><div><h2>用户登录</h2></div></h4>
            </div>
            <div class="modal-body">
                <div style="padding: 20px 20px 20px 20px;">
                    <form class="bs-example bs-example-form" role="form"  method="post">
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="input-group input-group-lg">
                                    <input type="text" class="form-control "  maxlength="20" name="studentId" placeholder="请输入账户名 " onkeydown="clear1()">
                                </div><!-- /input-group -->
                            </div>
                            <div class="col-lg-2">
                                <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="input-group input-group-lg">
                                    <input type="password" class="form-control " value="" maxlength="20" name="studentPassword" placeholder="请输入密码" onkeydown="clear1()">
                                </div><!-- /input-group -->
                            </div>
                        </div><!-- /.row -->
                        <div ><p style="color: red" id="message"></p></div>
                        <br>
                        <div class="row">
                            <div class=" col-lg-6">
                                <input type="button" class="btn btn-block" value="登录" onclick="CheckLoginId()"/>
                            </div>
                            <div class="col-lg-6">
                                <div class="checkbox">
                                    <label>
                                        <a>忘记密码</a>
                                    </label>
                                </div>
                            </div>

                        </div>

                    </form>
                </div>
            </div>

        </div>

    </div><!-- /.modal-content -->
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog " style="width:400px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabe3"><div><h3>管理员登录</h3></div></h4>
            </div>
            <div class="modal-body">
                <div style="padding: 20px 20px 20px 20px;">
                    <form class="bs-example bs-example-form" role="form" action="" method="post">
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="input-group input-group-lg">
                                    <input type="text" class="form-control " value="${adminname}" maxlength="20" name="admintId" placeholder="请输入管理员账户名 " onkeydown="clear1()">
                                </div><!-- /input-group -->
                            </div>
                            <div class="col-lg-2">
                                <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="input-group input-group-lg">
                                    <input type="password" class="form-control " value="" maxlength="20" name="adminPassword" placeholder="请输入密码" onkeydown="clear1()">
                                </div><!-- /input-group -->
                            </div>
                        </div><!-- /.row -->
                        <div ><p style="color: red" id="message1"></p></div>
                        <br>
                        <div class="row">
                            <div class=" col-lg-6">
                                <input type="submit" class="btn btn-block" value="登录">
                            </div>
                            <div class="col-lg-6">
                                <div class="checkbox">
                                    <label>
                                        <a>忘记密码</a>
                                    </label>
                                </div>
                            </div>

                        </div>

                    </form>
                </div>
            </div>

        </div>

    </div><!-- /.modal-content -->
</div>
//注册模态框
<%--<div id="regpassword">${regpassword}</div>
<div id="regpasswordenter">${regpasswordenter}</div>--%>
<div class="modal fade" id="registerForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog " style="width:400px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabe2"><div><h2>用户注册</h2></div></h4>
            </div>
            <div class="modal-body">
                <div style="padding: 20px 20px 20px 20px;">
                    <form class="bs-example bs-example-form" role="form" action="/Register.do" method="post">
                        <div class="row">
                            <div class="col-lg-8">
                                <div class="input-group input-group-lg">
                                    <input type="text" class="form-control "  maxlength="20" name="regUserName" placeholder="请输入账户名 " onblur="checkRegister()" onkeydown="clear1()">
                                </div><!-- /input-group -->
                            </div>
                            <div class="col-lg-4" >
                                <div style="height: 4em!important; display:flex;justify-content: center; align-items: center;"><p style=" font-size:6px;color: red " id="regnamemessage"></p></div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-lg-8">
                                <div class="input-group input-group-lg">
                                    <input type="password" class="form-control "  maxlength="20" name="regPassword" placeholder="请输入密码" onkeydown="clear1()">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-lg-8">
                                <div class="input-group input-group-lg">
                                    <input type="password" class="form-control " value="" maxlength="20" name="regpasswordenter" placeholder="请确认密码" onblur="enterPassword()" onkeydown="clear1()">
                                </div>
                            </div>
                            <div class="col-lg-4" >
                                <div style="height: 4em!important; display:flex;justify-content: center; align-items: center;"><p style=" font-size:6px " id="regpasswordmessage"></p></div>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class=" col-lg-12">
                                <input type="submit" class="btn btn-block" onclick="" value="注册">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<hr>

<div class="container">
<div class="jumbotron" style="opacity:0.9">
	<div class="row">
		<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;只要你肯加入我们，你们就能够↓&nbsp;↓&nbsp;↓&nbsp;↓&nbsp;↓&nbsp;↓&nbsp;↓&nbsp;↓&nbsp;↓&nbsp;↓</h3>
	</div>
	</div>
</div>

<div class="container">
  <div class="row">
    <div class="col-sm-6">
      <div class="thumbnail"> <img width="600px" height="300px" src="images/saokao.gif" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>海边烧烤</h3>
          <p>有木有闻到香味？恩？有木有流水</p>
          <hr>
          <p><a data-toggle="modal" data-target="#myModal" class="btn btn-success" role="button">加入我们</a></p>
        </div>
      </div>
    </div>
    <div class="col-sm-6">
      <div class="thumbnail"> <img width="600px" height="300px"  src="images/baskteball.jpg" alt="Thumbnail Image 1" class="img-responsive">
        <div class="caption">
          <h3>篮球赛</h3>
          <p>舍友是不是不肯运动？我们来帮你找搭档，狗狗狗</p>
          <hr>
          <p><a data-toggle="modal" data-target="#myModal" class="btn btn-success" role="button">加入我们</a></p>
        </div>
      </div>
    </div>
  </div>
    <div class="row">
    <div class="col-sm-6">
      <div class="thumbnail"> <img  src="images/volleyball.gif" alt="Thumbnail Image 1" class="img-responsive" width="600px" height="300px">
        <div class="caption">
          <h3>足球赛</h3>
          <p>恩？？？恩？？？</p>
          <hr>
          <p><a data-toggle="modal" data-target="#myModal" class="btn btn-success" role="button">加入我们</a></p>
        </div>
      </div>
    </div>
    <div class="col-sm-6">
      <div class="thumbnail"> <img  src="images/juhui.gif" alt="Thumbnail Image 1" class="img-responsive"  width="600px" height="300px">
        <div class="caption">
          <h3>聚会</h3>
          <p>万一找到了对象了呢？</p>
          <hr>
          <p><a data-toggle="modal" data-target="#myModal" class="btn btn-success" role="button">加入我们</a></p>
        </div>
      </div>
    </div>
  </div>
</div>

<hr>
<div class="container">
  <div class="jumbotron">
  <div class="row">
  
<div class="col-lg-4 col-md-6 col-sm-6">
      <h2>Contact Us</h2>
      <address>
      <strong>MyCompany, Inc.</strong><br>
      Sunny Autumn Plaza, Grand Coulee,<br>
      CA, 91308-4075, US<br>
      <abbr title="Phone">P:</abbr> (123) 456-7890
      </address>
      <h4>Social</h4>
      <div class="row">
      	<div class="col-xs-2"><img class="img-circle" src="images/32X32.gif" alt=""></div>
      	<div class="col-xs-2"><img class="img-circle" src="images/32X32.gif" alt=""></div>
      	<div class="col-xs-2"><img class="img-circle" src="images/32X32.gif" alt=""></div>
      	<div class="col-xs-2"><img class="img-circle" src="images/32X32.gif" alt=""></div>        
      </div>
    </div>
    <div class="col-lg-4 col-md-6 col-sm-6">
      <h2>Testimonials</h2>
      <div class="media">
        <div class="media-left"> <a href="#"> <img class="media-object" src="images/35X35.gif" alt="..."> </a> </div>
        <div class="media-body">
          <h4 class="media-heading">Media heading</h4>
          Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
      </div>

    </div>
    <div class="col-lg-4 col-sm-12">
      <h2>About Us</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, voluptates, soluta velit nostrum </p>
    </div>
  
</div>
</div>
 </div>
  <hr>
<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12" style="color: white ">
        <p>Copyright © MyWebsite. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="js/jquery-3.2.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed --> 
<script src="bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<script src="js/Login.js"></script>
<script src="js/toastr.js"></script>
<script src="js/Register.js"></script>
</body>
</html>
