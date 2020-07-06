<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body onload="document.f.id.focus();">
    <f:form name="f" action="${pageContext.request.contextPath }/member"
        method="POST" modelAttribute="memberVO">
        <table>
            <tr>
                <td>아이디 (영문 3글자+숫자 3글자 조합)</td>
         <!-- <td><input type="text" id="user_id" name="user_id" onfocus="this.value=''"/></td> -->
                <td><f:input path="id" /></td>
                <td><input type="button" value="중복확인" onclick="id()" />
                <f:errors path="id" cssClass="error" /></td>
            </tr>
            <tr>
                <td>비밀번호(6~20자리)</td>
                <!-- <td><input type="password" id="password" /></td> -->
                <td><f:password path="pw" /> </td>
                <td><f:errors path="pw"
                        cssClass="error" /></td>
            </tr>
            <tr>
                <td>email</td>
                <!-- <td><input type="text" id="email" /></td> -->
                <td><f:input path="email" /> </td>
                <td><f:errors path="email"
                        cssClass="error" /></td>
            </tr>
            <tr>
                <td>핸드폰(010-1234-1234)</td>
                <!-- <td><input type="text" id="phone" /></td> -->
                <td><f:input path="phone" /> </td>
                <td><f:errors path="phone"
                        cssClass="error" /></td>
            </tr>
            
           
        </table>

        <input type="button" value="가입" onclick="ip_pass()">
        <input type="reset" value="리셋">
        <input type="button" value="취소" onclick="cancel_sign()">
        <input type="hidden" id="client_id_sign" value="">
    </f:form>
    ${MSG }
</body>
</html>
