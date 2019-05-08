//1,捕捉键盘弹起,在document ready时候，对keyup监听
$(function () {
    $("#word").keyup(function () {
        // alert("keyup...");
        //2,获取输入框的值
        var word = $(this).val();
        if(word ==""){
            $("#div01").hide();
        }else{
            //3，请求数据
            $.post("FindServlet",{word:word},function (data, status) {
                // alert(data);
                $("#div01").show();
                $("#div01").html(data);
            });
        }
    });
});



