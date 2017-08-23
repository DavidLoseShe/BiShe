/**
 * Created by d on 2017/7/24.
 */
/*function login() {
    $.ajax({
        url: "StudentLogin.action",
        type: "POST",
        data: {"username": $("input[name='username']").val(), "Password": $("input[name='password']").val()},
        dataType: "json",
        success: function (data) {
          if(data.stduent!=null){
               $("#message").html("账户密码不匹配");
          }
          else $("#message").html("账户名不存在");
        }
    });
}*/
$(function(){
    if($("#user").text().length>0)
{
    if ($("#result").text().length > 0) {
        $("#myModal").modal();
        $("#message").html("账户密码不匹配");
        $("input[name='Password']").val("");
    }
    if ($("#result").text().length == 0) {
        $("#myModal").modal();
        $("#message").html("账户不存在");
        $("input[name='username']").val("")
        $("input[name='Password']").val("");
    }
}
})
function clear1(){
    $("#message").html("");
}