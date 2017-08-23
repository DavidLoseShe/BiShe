/**
 * Created by d on 2017/7/20.
 */
$(document).ready(function () {
   // $("[data-toggle='tooltip']").tooltip("");
    chaxun();
    $("[data-toggle='tooltip']").tooltip();
    toastr.options = {
        "closeButton": false,
        "debug": false,
        "positionClass": "toast-top-center",
        "onclick": null,
        "preventDuplicates": true,//是否阻止弹出多个消息框
        "showDuration": "300",
        "hideDuration": "1000",
        "timeOut": "2000",
        "extendedTimeOut": "1000",
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut"
    }


});

(function ($) {

    $.extend({
        tipsBox: function (options) {
            options = $.extend({
                obj: null,  //jq对象，要在那个html标签上显示
                str: "+1",  //字符串，要显示的内容;也可以传一段html，如: "<b style='font-family:Microsoft YaHei;'>+1</b>"
                startSize: "12px",  //动画开始的文字大小
                endSize: "30px",    //动画结束的文字大小
                interval: 600,  //动画时间间隔
                color: "red",    //文字颜色
                callback: function () { }    //回调函数
            }, options);
            $("body").append("<span class='num'>" + options.str + "</span>");
            var box = $(".num");
            var left = options.obj.offset().left + options.obj.width() / 2;
            var top = options.obj.offset().top - options.obj.height();
            box.css({
                "position": "absolute",
                "left": left + "px",
                "top": top + "px",
                "z-index": 9999,
                "font-size": options.startSize,
                "line-height": options.endSize,
                "color": options.color
            });
            box.animate({
                "font-size": options.endSize,
                "opacity": "0",
                "top": top - parseInt(options.endSize) + "px"
            }, options.interval, function () {
                box.remove();
                options.callback();
            });
        }
    });
})(jQuery);



function chaxun() {
    var h=$("#iiid").text();
    var tt="";
   $.ajax({
        url: "Activityremark.action",
        type: "POST",
        data: {"activityId":h},
        dataType: "json",
        success: function (data) {
              if(data.remarkinformationList.length>0) {
                  $("#remark").html("");
                  $.each(data.remarkinformationList, function (i, value) {

                      tt = "    <div class='well' style='opacity:0.7'>"
                          + " <div class='row'> <span> " + value.studentId + "</span>:<span>" + value.remarkContent + "</span> </div>"
                          + "<p class='text-right'>" + value.remarkTime + "</p>"
                          + "</div>" + tt;

                  });
                  $("#remark").html(tt);
              }
        }

    });
}
function remark(){
    $("#zishu").html("50");
    var content=$("#remarkContent").val();
    if(content.length>10){
    $("#remarkContent").val("");
    var remarkpeople=$("#username").text();
    var activityId=$("#iiid").text();
    $.ajax({
        url: "ActivityremarkSave.action",
        type: "POST",
        data: {"activityId": activityId, "remarkContent": content},
        dataType: "json",
        success: function (data) {
            toastr["success"]("你的评论成功了!","恭喜你");
            chaxun();
        }
    });
    }
    else toastr["error"]("评论失败，您的评论字数少于10个!","错误");
}
function zishu(){
    var a=50-$("#remarkContent").val().length;
    $("#zishu").html(a);
}
function Song(){
  var sid=$("#sid").text();
  var u = $("#u").text();
    $.ajax({
        url: "Remarksong.action",
        type: "POST",
        data: {"username": sid, "u": u},
        dataType: "json",
        success: function (data) {
         if(data.i!=-1){

             $.tipsBox({
                 obj: $("#btn"),
                 str: "+1",
                 callback: function () {
                 }
             });
             niceIn($("#btn"));
            }
            else  toastr["error"]("鲜花不足啊你","糟糕");
        }
    });
}
function niceIn(prop){
    prop.find('i').addClass('niceIn');
    setTimeout(function(){
        prop.find('i').removeClass('niceIn');
    },800);
}