<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<body>
    <fmt:setLocale value="${sessionScope.locale}"/>
        <div class="page-wrapper">
                <div id="page-content">  
                    <h1><spring:message code="ordering.title"/></h1>
                    <div id="back">
                        <form name="back" action="frontController?command=car" method="POST">
                            <input type="submit" value="<spring:message code="ordering.back.button"/>"/>
                        </form>
                    </div>
                    <br/>
                    <b> <spring:message code="car.table.name.car"/> </b> <c:out value="${car.name}"/> <br/>
                    <b> <spring:message code="car.table.price"/> </b> <c:out value="${car.pricePerDay}"/><br/>
                    <b> <img src="${car.image}" width="200" height="135"/></b> <br/>

                    <input type="hidden" name="carId" value="${car.carId}" />
                    <form name ="order"  method="POST" action="frontController?command=Ordering">
                        <p><spring:message code="ordering.start.date"/></p>
                        <jsp:useBean id="now" class="java.util.Date" scope="page"/>
                        <input type="date" name="date" value="" required  max="2020-12-31" min="<fmt:formatDate type="time" value="${now}" pattern="yyyy-MM-dd"/>"/>
                        <div class="notice"><spring:message code="ordering.period"/></div>
                        <input  type="number"  min="1" max="30" required name="period" value="" placeholder="" />
                        <input type="submit" value="<spring:message code="car.order"/>" />
                    </form>
                     </div>
                </div>
            </div>
    </body>

