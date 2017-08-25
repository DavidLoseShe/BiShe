/**
 * Created by guhao on 2017/7/24.
 */

$(function(){
    if ($("#username").text()=="usernameWrong") {
        $("input[name='studentId']").val("");
        $("#myModal").modal();
        $("#message").html("账户不存在");
    }
   else  if ($("#username").text().length>0) {
        $("#myModal").modal();
        $("#message").html("账户密码不匹配");
    }

})
function clear1(){
    $("#message").html("");
}