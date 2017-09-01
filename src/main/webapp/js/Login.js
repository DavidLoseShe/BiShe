/**
 * Created by guhao on 2017/7/24.
 */

$(function(){
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

/*    $.ajax({
 url:"CheckLogin.do",
 type:"post",
 data:"",
 dateType:"json",
 success:function (data) {
 if (data.length>0){
 alert(data);
 window.location.href="Login.do";
 }
 }
 });*/
})
function CheckFormate() {
}
function CheckLoginId() {
    $.ajax({
        url: "CheckLogin",
        type: "POST",
        data: {"studentId":$("input[name='studentId']").val()},
        dataType: "json",
        success: function (data) {

            if(data==true){
                CheckPassword();
            }
            else{
                $("#message").html("账户不存在");
            }
        }
    });
}
function CheckPassword() {
    $.ajax({
        url: "Login.do",
        type: "POST",
        data: {"studentId":$("input[name='studentId']").val(),"studentPassword": $("input[name='studentPassword']").val()},
        dataType: "json",
        success: function (data) {
            if(data==true){
                CheckLoginTime();
                SaveLoginTime();
                setTimeout('window.location.href="main.jsp";',2000);
            }
            else{
                $("#message").html("账户密码不匹配");
            }
        }
    });
}
function CheckLoginTime(){
    $.ajax({
        url: "CheckLoginTime.do",
        type: "POST",
        data: "",
        dataType: "json",
        success: function (data) {
            if(data) {
                toastr["error"]("今天已经获得过鲜花","错误");
            }
            else{
                SendFlower();
            }
        }
    });
}
function SendFlower(){
    $.ajax({
        url: "SendFlower.do",
        type: "POST",
        data: "",
        dataType: "json",
        success: function (data) {
            if(data){
                toastr["success"]("您获得一朵鲜花!","恭喜你");
            }
            else{
                toastr["error"]("获取鲜花失败","错误");
            }
        }
    });
}
function SaveLoginTime(){
    $.ajax({
        url: "SaveLoginTime.do",
        type: "POST",
        data: "",
        dataType: "json",
        success: function (data) {
            if(data){

            }
            else{
            }
        }
    });
}
function clear1(){
    $("#message").html("");
}
function forgetpassword(){

}