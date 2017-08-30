/**
 * Created by 28223 on 2017/8/29.
 */
function  checkRegister() {
    // alert("123");
    $.ajax({
        url:"checkUserName",
        type:"post",
        data:{"regUserName":$("input[name='regUserName']").val()},
        dataType:"json",
        success:function (data) {
            alert("123000000");
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