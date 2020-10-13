<%--
  Created by IntelliJ IDEA.
  User: duck
  Date: 2020/9/25
  Time: 下午10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="pg" uri="/WEB-INF/tlds/pager-taglib.tld" %>--%>
<html>
<head>
    <title>分页测试</title>
</head>
<body>
        <div id="main">
                <div id="table">
                    <table>
                        <tr>
                            <th>学号</th>
                            <th>姓名</th>
                            <th>密码</th>
                            <th>性别</th>
                            <th>年龄</th>
                        </tr>
                        <c:forEach items="${pagers.list}" var="data">
                            <tr>
                                <th>${data.id}</th>
                                <th>${data.name}</th>
                            </tr>
                        </c:forEach>
                    </table>
                    <p>当前 ${pagers.pageNum }页,总${pagers.pages }
                            页,总 ${pagers.total } 条记录</div></p>
                    <a href="/pageTest/test1?pageNo=${pagers.firstPage}">第一页</a>
                    <c:if test="${pagers.hasPreviousPage }">
                        <a href="/pageTest/test1?pageNo=${pagers.pageNum-1}">上一页</a>
                    </c:if>

                    <c:if test="${pagers.hasNextPage }">
                        <a href="/pageTest/test1?pageNo=${pagers.pageNum+1}">下一页</a>
                    </c:if>

                    <a href="/pageTest/test1?pageNo=${pagers.lastPage}">最后页</a>

            </div>
        </div>
</body>
</html>
