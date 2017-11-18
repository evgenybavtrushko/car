<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<div id="aaa">
    <fmt:setLocale value="${sessionScope.locale}"/>

    <h1><spring:message code="register.title"/></h1>
    <form name="RegisterForm" action="/create" method="POST">
        <div ><spring:message code="register.warn.login"/></div>
        <div>  <b><spring:message code="login.login"/>:</b>
            <div id="frmCheckUsername">
                <input name="login" type="text" id="login" class="demoInputBox" onBlur="checkAvailability()" pattern="^[a-z0-9_-]{3,16}$" value="${login}" autofocus required >
                <span id="user-availability-status"></span>
            </div>
        <c:if test="${not empty errorLogin}">
        <div class="error"><fmt:message bundle="${i18n}" key="error.double.login"/>
        </div>
        </c:if>

        <div>  <b><spring:message code="register.password"/>:</b>
            <h7>*</h7>
        </div>

        <input type="password" name="password" pattern="^[a-z0-9_-]{6,16}$" value="" required id='pas1'>

        <div><spring:message code="register.repeat_password"/>:
            <h7>*</h7>
        </div>
        <input type="password" name="passwordRepeat" value="" required id='pas2'>
        <c:if test="${not empty errorPassword}">
        <div class="error"><spring:message code="error.double.pass"/></div>
        </c:if>

        <div> <b><spring:message code="register.realName"/>:</b>
            <h7>*</h7>
        </div>
        <input type="text" name="realname" maxlength="25" value="${realname}" required>


        <div ><spring:message code="register.address"/>:
            <h7>*</h7>
        </div>
        <input type="text" name="address" maxlength="25" value="${address}" required>

        <div><spring:message code="register.email"/>:
            <h7>*</h7>
        </div>
        <input type="email" name="email" value="${email}" required>

        </div>

        <input type="submit" value="<spring:message code="register.button"/>">
        <br/>
    </form>
    <br/>
    <form name="back" action="/create" method="POST">
        <input type="submit" value="<spring:message code="error.back.button"/>"/>
    </form>
</div>
