<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>

<fmt:setLocale value="${sessionScope.locale}"/>

</div>
<div class="container-fluid">

        <table class="table">
            <tr>
                <div class="col-md-12">  </h1>  </div>
                <th class="col-md-2"><spring:message code="car.table.name.car"/></th>
                <div class="col-md-10">
                    <th class="col-md-4"><spring:message code="car.table.price"/> </th>
                    <th class="col-md-4"><spring:message code="car.table.imj"/></th>
                    <th class="col-md-2"></th>
                </div>
            </tr>

            <c:forEach var="car" items="${car}" varStatus="status">
                <tr class="info">
                    <td class="col-md-2">${car.name}</td>
                    <div class="col-md-10">
                        <td class="col-md-4">${car.pricePerDay}</td>
                        <td class="col-md-4"> <img src="${car.image}" width="200" height="135"/></td>
                        <td class="col-md-2">
                         <%--   <c:if test="${not empty user}">--%>
                             <c:url var="order" value="/orders/form/${car.id}" />
                             <s:form id="orderForm" name="ordering" action="${order}" method="get" modelAttribute="car" enctype="multipart/form-data">
<%--
                            <input type="hidden" name="carId" value="${car.id}" />
--%>
                            <input type="submit" value="<spring:message code="car.order"/>" />
                             </s:form>
                    <%--        </c:if>--%>
                        </td>
                    </div>
                </tr>
            </c:forEach>
        </table>
    </div>








