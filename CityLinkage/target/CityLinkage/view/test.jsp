<%--
  Created by IntelliJ IDEA.
  User: duck
  Date: 2020/10/8
  Time: 上午10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>测试连结驱动</title>
    <script src="${ctx}/static/jquery-3.3.1.min.js"></script>
    <script>
            $(function () {
                    $("#province").change(function () {
                        var value = $(this).val();
                        $.ajax({
                            type :"post",
                            url :"/city/findBySql",
                            data :{pId:value},
                            dataType : "json",
                            success:function (result) {
                                var content = "";
                                content += "<option>选择城市</option>"
                                for(var i = 0; i < result.length;i++){
                                    // alert(result[i].cid + "名字:" + result[i].cname);
                                    content += "<option value=" + result[i].cid +">" + result[i].cname + "</option>";
                                }
                                $("#city").html(content);
                            }
                        })
                    });
                    $("#city").change(function () {
                        var value= $(this).val();
                        $.ajax({
                            type:"post",
                            url :"/district/findBySql",
                            data:{cId:value},
                            dataType :"json",
                            success :function (result) {
                                    var content = "";
                                    content += "<option>选择区域</option>"
                                    for(var i = 0;i < result.length;i++){
                                        content += "<option value=" + result[i].did +">" + result[i].dname +"</option>";
                                    }
                                    $("#district").html(content);
                            }
                        })
                    })
            })
    </script>
</head>
<body>
    <div>
<%--          <select id="province">--%>
<%--              <option>选择省份</option>--%>
<%--              <option value="1">北京</option>--%>
<%--              <option value="2">上海</option>--%>
<%--              <option value="3">重庆</option>--%>
<%--              <option value="4">深圳</option>--%>
<%--              <option value="5">天津</option>--%>
<%--              <option value="6">山东</option>--%>
<%--              <option value="7">江苏</option>--%>
<%--          </select>--%>
          <table>
              <h1>选择省份--城市--区县</h1>
              <select id="province">
                  <option>选择省份/直辖市</option>
                  <c:forEach items="${province}" var="data">
                      <option value="${data.pid}">${data.pname}</option>
                  </c:forEach>
              </select>
              <select id="city"></select>
              <select id="district"></select>
          </table>
    </div>
</body>
</html>
