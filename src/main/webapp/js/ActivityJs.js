/**
 * Created by d on 2017/7/13.
 */
$(document).ready(function () {
    MessageContent();
    setInterval(function() {
        $("#MessageContent").load(MessageContent());
    }, 10000);

    $("#previousPage").click(function () {
        var btn="加入我们";
        var tt="<div class='row'>";
        var pageCount=$("#pageCount").text()
        var pNo= $('#pageNo').text();
        if(pNo>1){pNo=pNo-1;}

        $.ajax({
            url: "page",
            type: "POST",
            data: {'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val()},
            dataType: "json",
            success: function (data) {
                pageCount=data;
                $("#pageCount").text(pageCount);
            }
        });
        $.ajax({
            url: "activityList",
            type: "POST",
            data: {'pageNo':pNo,'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val(),},
            dataType: "json",
            success: function (data) {
                if(pNo==1) document.getElementById("previousPage").style.visibility="hidden";
                if(pNo<pageCount) document.getElementById("nextPage").style.visibility="visible";
                $("#pageNo").text(pNo);
                $("#activityList").html("");
                if(data.length==0){
                    $("#activityList").html("抱歉，暂时没有此类活动");
                }
              else{   var tt="<div class='row'>";
                $.each(data,function(i,value){
                    var imgSrc="images/400X200.gif";
                    if(value.activityKind=="运动"){
                        imgSrc="images/yundong.jpg";
                    }
                    else if(value.activityKind=="烧烤"){
                        imgSrc="images/shaokao.jpg";
                    }
                    else if(value.activityKind=="野营"){
                        imgSrc="images/yeying.jpg";
                    }
                    else if(value.activityKind=="聚会"){
                        imgSrc="images/juhui.jpg";
                    }
                    else if(value.activityKind=="其他"){
                        imgSrc="images/qita.jpg";
                    }
                    if(value.activityState=="已经结束"){

                        btn="已结束";
                    }
                    tt=tt+"<div class='col-lg-4 col-md-4 col-sm-6 col-xs-6'>"
                        +  " <div class='thumbnail'> <img src='"+imgSrc+"' alt='Thumbnail Image 1' class='img-responsive'>"
                        +"  <div class='caption'>"
                        +" <h3>"+value.activityName+"</h3>"
                        + "<p>"+value.activityContent+"</p>"
                        + "<p>开始时间:"+value.activityStartTime+"</p>"
                        + "<p>结束时间:"+value.activityEndTime+"</p>"
                        + "<p class='text-right'>发布人：<a href='#' data-toggle='tooltip' data-placement='right' title='查看' >"+value.activityPeopleId+"</a></p>"
                        +" <hr>"
                        +" <p class='text-center'><a href='Activity.action?activityId="+ value.activityId+"' class='btn btn-success'role='button'>"+btn+"</a></p>"
                        +"</div>"
                        +"</div>"
                        +"</div>";

                });
                tt=tt+"</div>";
                $("#activityList").append(tt);
                }
            }
        });
    });
    $("#nextPage").click(function () {
        var btn="加入我们";
        var tt="<div class='row'>";
        var pNo= parseInt($('#pageNo').text());
        var pageCount=$("#pageCount").text()
        if(pNo<pageCount){ pNo=pNo+1;}
        $.ajax({
            url: "page",
            type: "POST",
            data: {'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val()},
            dataType: "json",
            success: function (data) {
                pageCount=data;
                $("#pageCount").text(pageCount);
            }
        });
        $.ajax({
            url: "activityList",
            type: "POST",
            data: {'pageNo':pNo,'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val(),},
            dataType: "json",
            success: function (data) {
                if(pNo>1) document.getElementById("previousPage").style.visibility="visible";
                if(pNo==pageCount) document.getElementById("nextPage").style.visibility="hidden";
                $("#pageNo").text(pNo);

                $("#activityList").html("");
                if(data.length==0){
                    $("#activityList").html("抱歉，暂时没有此类活动");
                }
               else{  var tt="<div class='row'>";
                $.each(data,function(i,value){
                    var imgSrc="images/400X200.gif";
                    if(value.activityKind=="运动"){
                        imgSrc="images/yundong.jpg";
                    }
                    else if(value.activityKind=="烧烤"){
                        imgSrc="images/shaokao.jpg";
                    }
                    else if(value.activityKind=="野营"){
                        imgSrc="images/yeying.jpg";
                    }
                    else if(value.activityKind=="聚会"){
                        imgSrc="images/juhui.jpg";
                    }
                    else if(value.activityKind=="其他"){
                        imgSrc="images/qita.jpg";
                    }
                    if(value.activityState=="已经结束"){

                        btn="已结束";
                    }
                    tt=tt+"<div class='col-lg-4 col-md-4 col-sm-6 col-xs-6'>"
                        +  " <div class='thumbnail'> <img src='"+imgSrc+"' alt='Thumbnail Image 1' class='img-responsive'>"
                        +"  <div class='caption'>"
                        +" <h3>"+value.activityName+"</h3>"
                        + "<p>"+value.activityContent+"</p>"
                        + "<p>开始时间:"+value.activityStartTime+"</p>"
                        + "<p>结束时间:"+value.activityEndTime+"</p>"
                        + "<p class='text-right'>发布人：<a href='#'data-toggle='tooltip' data-placement='right' title='查看'>"+value.activityPeopleId+"</a></p>"
                        +" <hr>"
                        +" <p class='text-center'><a href='Activity.action?activityId="+ value.activityId+"' class='btn btn-success'role='button'>"+btn+"</a></p>"
                        +"</div>"
                        +"</div>"
                        +"</div>";

                });
                tt=tt+"</div>";
                $("#activityList").append(tt);
                }
            }
        });
    });
    chaxun();

});
function chaxun(){
    var btn="加入我们";
    var pNo= 1;
    var pageCount;
    $.ajax({
        url: "page",
        type: "POST",
        data: {'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val()},
        dataType: "json",
        success: function (data) {
                pageCount=data;
            $("#pageCount").text(pageCount);
        }
    });
    $.ajax({
        url: "activityList",
        type: "POST",
        data: {'pageNo':1,'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val(),},
        dataType: "json",
        success: function (data) {
            document.getElementById("nextPage").style.visibility="hidden";
            if(pNo==1) document.getElementById("previousPage").style.visibility="hidden";
            if(pageCount>pNo)　document.getElementById("nextPage").style.visibility="visible";
            $("#pageNo").text(1);
            $("#activityList").html("");
            if(data.length==0){
                $("#activityList").html("抱歉，暂时没有此类活动");
            }
            else{
            var tt="<div class='row'>";
            $.each(data,function(i,value){
                var imgSrc="images/400X200.gif";
                if(value.activityKind=="运动"){
                    imgSrc="images/yundong.jpg";
                }
                else if(value.activityKind=="烧烤"){
                    imgSrc="images/shaokao.jpg";
                }
                else if(value.activityKind=="野营"){
                    imgSrc="images/yeying.jpg";
                }
                else if(value.activityKind=="聚会"){
                    imgSrc="images/juhui.jpg";
                }
                else if(value.activityKind=="其他"){
                    imgSrc="images/qita.jpg";
                }
               if(value.activityState=="已经结束"){

                    btn="已结束";
               }
                tt=tt+"<div class='col-lg-4 col-md-4 col-sm-6 col-xs-6'>"
                    +  " <div class='thumbnail'> <img src='"+imgSrc+"' alt='Thumbnail Image 1' class='img-responsive'>"
                    +"  <div class='caption'>"
                    +" <h3>"+value.activityName+"</h3>"
                    + "<p>"+value.activityContent+"</p>"
                    + "<p>开始时间:"+value.activityStartTime+"</p>"
                    + "<p>结束时间:"+value.activityEndTime+"</p>"
                    + "<p class='text-right'>发布人：<a href='#'data-toggle='tooltip' data-placement='right' title='查看'>"+value.activityPeopleId+"</a></p>"
                    +" <hr>"
                    +" <p class='text-center'><a href='Activity.action?activityId="+ value.activityId+"' class='btn btn-success'role='button'>"+btn+"</a></p>"
                    +"</div>"
                    +"</div>"
                    +"</div>";

            });
            tt=tt+"</div>";
            $("#activityList").append(tt);
            }
        }
    });
}
function MessageContent(){
    $.ajax({
        url:"messageAmount",
        type:"post",
        data:"",
        dateType:"json",
        success:function (data) {
            $("#MessageContent").text(data);
        }
    });

}
function  Message(){
    $("#myModal2").modal();
    MessageContentNoRead();
}
function MessageContentNoRead() {
    $.ajax({
        url:"MessageQueryMessage.action",
        type:"post",
        data:"",
        dateType:"json",
        success:function (data) {
            var c="";
            $.each(data.messageInformationList,function(i,value){
                c="<div>发送人:"+value.messageSendId+"</div><div>内容:"+value.messageContent+"</div><div>发送时间:"+value.messageTime+"</div><button onclick='read("+value.messageId+")' >已读</button><br>"+c;
            });
            $("#messageList").html(c);
        }
    });
}
function read(id) {
    $.ajax({
        url: "MessageModifyMessageState.action",
        type: "post",
        data: {'messageId':id},
        dateType: "json",
        success: function (data) {
            MessageContentNoRead();
            MessageContent();
        }
    });
}
function exitSystem(){

}
function PerpsonActivity() {
    $.ajax({
        url:"", 
        type:"",
        data:"",
        dateType:"json",
        success:function (data) {
            
        }
    });
}