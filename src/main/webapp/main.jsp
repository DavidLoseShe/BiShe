<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap Real Estate Website Template</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.css">
  <style type="text/css">
    *{ margin: 0; padding: 0; }
    body,html{ height: 100%;
      background-image: url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502379771162&di=2515ee3bcb7bab7c6e12b1cd3916c399&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20151106%2Fdansechouxiangduobianxingbeijingtupian_5263726.jpg");
      background-position: center center;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: cover;
    }
 .eee{
   border-style:none ;

 }
  </style>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid"> 
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myInverseNavbar2" aria-expanded="false"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="#">首页</a> </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="myInverseNavbar2">
      <ul class="nav navbar-nav navbar-right">
<!--        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
        -->
        <li><a href="Javascript: void(0)" onclick="Message()">消息 <span class="badge" id="MessageContent">0</span></a></li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" aria-haspopup="true" id ="user"> ${stduent.studentName}<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Javascript: void(0)" data-toggle="modal" data-target="#myModal" >个人信息</a></li>
            <li><a href="#">修改密码</a></li>
            <li><a href="PersonActivity.jsp">个人发布活动</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="welcome.jsp" onclick="exitSystem()">退出系统</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse --> 
  </div>
  <!-- /.container-fluid --> 
</nav>
  <div class="container" style="padding-top: 100px">
    <div class="row">
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 hidden-xs">
        <div id="carousel-299058" class="carousel slide">
          <ol class="carousel-indicators">
            <li data-target="#carousel-299058" data-slide-to="0" class=""> </li>
            <li data-target="#carousel-299058" data-slide-to="1" class="active"> </li>
            <li data-target="#carousel-299058" data-slide-to="2" class=""> </li>
          </ol>
          <div class="carousel-inner">
            <div class="item"> <img class="img-responsive" src="images/bg3.jpg" alt="thumb">
              <div class="carousel-caption"> Carousel caption. Here goes slide description. Lorem ipsum dolor set amet. </div>
            </div>
            <div class="item active"> <img class="img-responsive" src="images/bg2.jpg" alt="thumb">
              <div class="carousel-caption"> Carousel caption 2. Here goes slide description. Lorem ipsum dolor set amet. </div>
            </div>
            <div class="item"> <img class="img-responsive" src="images/bg1.jpg" alt="thumb">
              <div class="carousel-caption"> Carousel caption 3. Here goes slide description. Lorem ipsum dolor set amet. </div>
            </div>
          </div>
          <a class="left carousel-control" href="#carousel-299058" data-slide="prev"><span class="icon-prev"></span></a> <a class="right carousel-control" href="#carousel-299058" data-slide="next"><span class="icon-next"></span></a></div>
      </div>
    </div>
    <hr>
  </div>
<section>
  <div class="container">
    <div class="row">
      <div class="col-lg-4 col-md-4 col-sm-6 col-xs-6">
        <div class="media-object-default">
          <div class="media">
            <div class="media-left"> <a href="#"> <img class="media-object img-circle" src="images/100X100.gif" alt="placeholder image"> </a> </div>
            <div class="media-body">
              <h4 class="media-heading">Heading 1</h4>
              Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quaerat, sequi, repudiandae tenetur et veniam labore debitis repellendus totam non incidunt hic esse!</div>
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-6 col-xs-6">
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object img-circle" src="images/100X100.gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">Heading 2</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. A, odit, consequuntur, quae, at tempore nostrum perferendis corporis nam maxime tenetur iure facilis.</div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-6 hidden-sm hidden-xs">
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object img-circle" src="images/100X100.gif" alt="placeholder image"></a></div>
          <div class="media-body">
            <h4 class="media-heading">Heading 3</h4>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis, id, aut, officiis laboriosam a vero illo dolor asperiores provident quibusdam praesentium ipsum!</div>
        </div>
      </div>
    </div>
  </div>
</section>
<hr>
<div class="container">
  <div class="row">
    <div class="col-lg-9 col-md-12" >
      <div class="row" style="height: 650px">
      <div class="col-lg-12 col-md-12" id="activityList">
        <div class="col-lg-6">
        </div>
         <div class="col-lg-6"> <div class="row" id="preloader_1"></div>正在加载中……</div>
      </div>
      </div>
      <ul class="pager">
        <li ><a  id="firstPage">首页</a> </li>
        <li ><a id="previousPage" href="Javascript: void(0)" style="visibility: hidden">上一页</a></li>
        第<span id="pageNo">1</span>页 &nbsp;&nbsp;共<span id="pageCount"><!--${page}--></span>页
        <li ><a id="nextPage" href="Javascript: void(0)" style="visibility: hidden">下一页</a> </li>
        <li ><a id="finalPage">尾页</a> </li>
      </ul>
    </div>



    <div class="col-lg-3 col-md-6 col-md-offset-3 col-lg-offset-0">
      <div class="well">
        <h3 class="text-center">活动筛选</h3>
        <form class="form-horizontal">
          <div class="form-group">
            <label for="activityType" class="control-label">类别</label>
            <select class="form-control" name="" id="activityType" onchange="chaxun()">
              <option value="所有">所有</option>
              <option value="运动">运动</option>
              <option value="烧烤">烧烤</option>
              <option value="聚会">聚会</option>
              <option value="野营">野营</option>
              <option value="其他">其他</option>
            </select>
          </div>
<%--          <div class="form-group">
            <label for="activitySize" class="control-label"> 类型</label>
            <select class="form-control" name="" id="activitySize">
              <option value="">所有</option>
              <option value="">小型</option>
              <option value="">中型</option>
              <option value="">大型</option>
            </select>
          </div>--%>
          <div class="form-group">
            <label for="activityState" class="control-label" > 状态</label>
            <select class="form-control" name="" id="activityState" onchange="chaxun()">
              <option value="正在发布">正在发布</option>
              <option value="已经结束">已经结束</option>
            </select>
          </div>
      <div class="form-group">
            <label for="activityRelation" class="control-label" > 关系</label>
            <select class="form-control" name="" id="activityRelation" onchange="chaxun()">
              <option value="所有">所有</option>
              <option value="我参加过">我参加过</option>
            </select>
          </div>
          <p class="text-center"><a href="#" class="btn btn-danger" role="button">重置 </a></p>
        </form>
      </div>
      <hr>
      <h3 class="text-center">Agents</h3>
      <div class="media-object-default">
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object img-rounded" src="images/64X64.gif" alt="placeholder image"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">John Doe</h4>
            <abbr title="Phone">P:</abbr> (123) 456-7890 <a href="mailto:#">first.last@example.com</a> </div>
        </div>
        <div class="media">
          <div class="media-left"> <a href="#"> <img class="media-object img-rounded" src="images/64X64.gif" alt="placeholder image"> </a> </div>
          <div class="media-body">
            <h4 class="media-heading">Linda Smith</h4>
            <abbr title="Phone">P:</abbr> (123) 456-7890 <a href="mailto:#">first.last@example.com</a> </div>
        </div>
      </div>
    </div>
  </div>
</div>
<hr>
<div class="container well">
  <div class="row">
<div class="col-xs-6 col-sm-6 col-lg-4 col-md-4"> <span class="text-right">
      </span>
  <h3>About Us</h3>
  <hr>
  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Atque, consequatur neque exercitationem distinctio esse! Cupiditate doloribus a consequatur iusto illum eos facere vel iste iure maxime. Velit, rem, sunt obcaecati eveniet id nemo molestiae. In.</p>
</div>
<div class="col-xs-6 col-sm-6 col-lg-4 col-md-4 hidden-sm hidden-xs"> <span class="text-right"> </span>
  <h3>Latest News</h3>
  <hr>
  <div class="media-object-default">
  <div class="media">
  <div class="media-body">
        <h4 class="media-heading">Heading 1</h4>
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorum, quod temporibus veniam deserunt deleniti accusamus voluptatibus at illo sunt quisquam. </div>
      <div class="media-right"> <a href="#"> <img class="media-object" src="images/75X.gif" alt="placeholder image"></a></div>
</div>
</div>
</div>
<div class="col-xs-6 col-sm-6 col-lg-4 col-md-4"> <span class="text-right"> </span>
  <h3>Contact Us</h3>
  <hr>

    <address>
      <strong>MyStoreFront, Inc.</strong><br>
      Indian Treasure Link<br>
      Quitman, WA, 99110-0219<br>
  <abbr title="Phone">P:</abbr> (123) 456-7890
      </address>
</div>
  </div>
</div>
<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p>Copyright © MyWebsite. All rights reserved.</p>
      </div>
    </div>
  </div>
</footer>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog " style="width:700px">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel"><div><h2>用户信息</h2></div></h4>
      </div>
      <div class="modal-body">
        <div style="padding: 20px 20px 20px 20px;">
          <form class="bs-example bs-example-form" role="form" action="StudentLogin.action" method="post">
           <div class="container" style="font-size:large">
              <div class="row">
                  <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right" >用户名： </div>
                <input  class="eee" type="text"  value="admin"  maxlength="10" readonly>

              </div>
<br>
              <div class="row">
                <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right" >姓名：</div>
                <input class="eee" type="text"  value="admin"  maxlength="10" readonly>
              </div>
             <br>
              <div class="row">
                <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right"> 班级：</div>
                <input  class="eee" type="text"  value="admin"  maxlength="10" readonly>
              </div>
             <br>
              <div class="row">
                <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right">QQ：</div>
                <input class="eee" type="text"  value="admin"  maxlength="10" readonly>
              </div>
             <br>
              <div class="row">
                <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right"> 鲜花数：</div>
                <input class="eee" type="text"  value="admin"  maxlength="10" readonly>
              </div>
             <br>
              <div class="row">
                <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right">个性签名：</div>
                <input class="eee" type="text"  value="admin"  maxlength="10" readonly>
              </div>
             <br>
              <div class="row">
                <div class="col-lg-1"></div>
                <div class="col-lg-2 text-right">上次登录时间：</div>
                <input class="eee" type="text"  value="admin"  maxlength="10" readonly>
              </div>
             <br>
             <div class="row">
               <div class="col-lg-2"></div>
               <div class="col-lg-2"><a class="btn btn-default btn-lg"  role="button" >修改</a></div>
               <div class="col-lg-8"><a class="btn btn-default btn-lg"  role="button" >退出</a></div>

             </div>
           </div>
          </form>
        </div>

      </div>
    </div>
  </div><!-- /.modal-content -->
</div>
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog " style="width:600px " >
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabe2"><div><h4>消息</h4></div></h4>
      </div>
      <div class="modal-body" style="height:400px; overflow:scroll;">
        <div style="padding: 20px 20px 20px 20px;">
          <div id="messageList"></div>
        </div>
      </div>

    </div>
  </div><!-- /.modal-content -->
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<script src="js/jquery-3.2.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed --> 
<script src="bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<script src="js/ActivityJs.js"></script>

</body>
</html>