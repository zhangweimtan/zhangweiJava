$(function () {
    //找到事件触发
    $("#province").change(function () {
        //触发函数
        //获得参数
        var pid = $(this).val();
        //回调函数
        /*[
                {
                    "cname": "广州",
                    "id": 1,
                    "pid": 1
                },
                {
                    "cname": "深圳",
                    "id": 2,
                    "pid": 1
                }
            ]
        * */
        // 遍历json数据
        //清空

        $.post("CityServlet02",{pid:pid},function (data,status) {
            //先清空
            $("#city").html("<option value=''>"+"--请选择--");
           $(data).each(function (index,c) {
               // alert(c.cname);
               $("#city").append("<option value='"+c.id+"'>"+c.cname);
           });
        },"json");
    });
    //触发函数
});