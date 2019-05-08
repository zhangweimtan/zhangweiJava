$(function () {
   //找到事件触发
   $("#province").change(function () {
       //触发函数
       //获得参数
       var pid = $(this).val();
       $.post("CityServlet02",{pid:pid},function (data,status) {
           //回调函数
           // $("#city").html(data);
           //遍历,从data中遍历city
           $("#city").html("<option value=''>--请选择--");
           $(data).find("city").each(function () {
               //清空以前的值
               var id = $(this).children("id").text();
               // alert("id=="+id);
               // $(this).children("id").text();
               var cname= $(this).children("cname").text();
               // $(this).children;

               $("#city").append("<option value='"+id+"'>"+cname);
           });
       });
   });
   //触发函数
});