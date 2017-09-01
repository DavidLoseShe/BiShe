/**
 * Created by 28223 on 2017/8/29.
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
})
function  checkRegister() {
    // alert("123");
    $.ajax({
        url:"checkUserName",
        type:"post",
        data:{"regUserName":$("input[name='regUserName']").val()},
        dataType:"json",
        success:function (data) {
            if (data==true){
                // $("#registerForm").modal;
                $("#regnamemessage").html("账户已存在");
            }
            else
                $("#regnamemessage").html("可用");
        }
    }) ;
}
function  enterPassword() {
    // alert("123"+$("#result").text());
    var regPassword=$("input[name='regPassword']").val();
    var regpasswordenter=$("input[name='regpasswordenter']").val();
    if (regPassword!=regpasswordenter){
        $("#regpasswordmessage").html("<p style='color: red'>前后不一致</p>")
    }
    else
        $("#regpasswordmessage").html("<p style='color: green'>可用</p>")
}
function  validateEmail(){
    if($("input[name='email']").val().length>0){
    $.ajax({
        url: "validateEmail.do",
        type: "POST",
        data: {"email":$("input[name='email']").val()},
        dataType: "json",
        success: function (data) {
            if(data==true){
                 $("#states").html("<p style='color: green'>已发送</p>");
            }
            else {

            }
        }
    });
    }
    else {
        $("#states").html("<p style='color: green'>邮箱格式不对</p>");
    }
}
function Register() {
    $.ajax({
        url: "Register.do",
        type: "POST",
        data: {"regUserName":$("input[name='regUserName']").val(),"regPassword":$("input[name='regPassword']").val(),"regpasswordenter":$("input[name='regpasswordenter']").val(),"validate":$("input[name='validate']").val()},
        dataType: "json",
        success: function (data) {
            if(data==true){
                toastr["success"]("注册成功","恭喜你");
                setTimeout('window.location.href="welcome.jsp";',2000);

            }
           else if(data==false) {
               $("#message3").html("<p style='color: red'>验证码错误</p>");

            }
            else{
                alert("123");
            }
        }
    });

}