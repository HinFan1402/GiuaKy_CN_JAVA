<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng nhập</title>
</head>

<body id="LoginForm">
	<div class="container">
		<p class="form-heading">CÔNG NGHỆ JAVA</p>
		<div class="login-form">
			<div class="main-div">
			<c:if test="${not empty message}">
					<div class="alert alert-${alert}">
							${message}
					</div>
			</c:if>
				<div class="panel">
					<h2>LOGIN FORM</h2>
					<p>Đăng nhập vào tài khoản của bạn</p>
				</div>
				<form action="<c:url value='/dang-nhap'/>" method="post"
					id="formLogin">

					<div class="form-group">
						<input type="" class="form-control" id="userName"
							name="userName" placeholder="Tài khoản ">
					</div>

					<div class="form-group">
						<input type="password" class="form-control" id="password"
							name="password" placeholder="Mật khẩu">
					</div>
					
					<input type="hidden" value="login" name="action"/>
					
					<button type="submit" class="btn btn-primary">Đăng nhập</button>

				</form>
				<br>
				Chưa có tài khoản? <a href='<c:url value="/dang-nhap?action=register"/>'>Đăng ký ngay</a>
			</div>
		</div>
	</div>
	</div>


</body>


</html>