<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng kí</title>
</head>

<body id="RegisterForm">
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
					<h2>REGISTER FORM</h2>
					<p>Đăng kí tài khoản</p>
				</div>
				<form action="<c:url value='/dang-ki'/>" method="post"
					id="formRegister">

					<div class="form-group">
						<input type="" class="form-control" id="userName"
							name="userName" placeholder="Tài khoản ">
					</div>

					<div class="form-group">
						<input type="password" class="form-control" id="password"
							name="password" placeholder="Mật khẩu">
					</div>
					<div class="forgot">
						<a href="reset.html">Quên mật khẩu?</a>
					</div>
					<input type="hidden" value="register" name="action"/>
					
					<button type="submit" class="btn btn-primary">Đăng kí</button>

				</form>
			</div>
		</div>
	</div>
	</div>


</body>


</html>