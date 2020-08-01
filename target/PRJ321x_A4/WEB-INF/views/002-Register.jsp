<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored ="false" %>
	<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/WEB-INF/views/commons/header.jsp"></jsp:include>
<title>Clickshop.com.vn | Register CMS</title>
</head>

<body>
	<div class="container-fluid">
		<div class="screen">
			<div class="box w-50">
				<div class="card shadow">
					<div class="card-header lead text-center">Clickshop.com.vn | <b>Register</b></div>
					<div class="card-body">
						<form:form method="post" action="${pageContext.request.contextPath}/register/submit" modelAttribute="user">
						<div class="form-group">
								<label for="name">Name <b style="color:red">(*)</b></label> <input
									type="text" name="name" class="form-control"
									id="name" placeholder="Enter your name" required>
									<form:errors cssClass="text-danger" path="name"/>
							</div>
							<div class="form-group">
								<label for="email">Email <b style="color:red">(*)</b></label> <input
									type="text" name="email" class="form-control"
									id="email" placeholder="Enter email" required>
									<form:errors cssClass="text-danger" path="email"/>
							</div>
							<div class="form-group">
								<label for="password">Password <b style="color:red">(*)</b></label> <input type="text"
									name="password" minlength="6" class="form-control"
									id="password" placeholder="Password" required>
									<form:errors cssClass="text-danger" path="password"/>
							</div>
							<div class="form-group">
								<label for="phone">Phone number <b style="color:red">(*)</b></label> <input
									type="text" name="phone" class="form-control"
									id="phone" placeholder="Enter phone number" required>
									<form:errors cssClass="text-danger" path="phone"/>
							</div>
							<div class="form-group">
								<label for="age">Age <b style="color:red">(*)</b></label> <input
									type="text" name="age" class="form-control"
									id="age" placeholder="Enter your age" required>
									<form:errors cssClass="text-danger" path="age"/>
							</div>
							<div class="form-group">
								<label for="address">Address <b style="color:red">(*)</b></label> <input
									type="text" name="address" class="form-control"
									id="address" placeholder="Enter your address" required>
									<form:errors cssClass="text-danger" path="address"/>
							</div>
							<button type="submit" class="btn btn-lg btn-success">Register</button>
							<a href="<%=request.getContextPath() %>/login" class="btn btn-primary">Login</a>
							<a href="<%=request.getContextPath() %>/home" class="btn btn-danger text-white">Back to home</a>
						</form:form>
					</div>
					<div class="card-footer text-muted lead text-center">CMS V1 @
						FUNiX</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/commons/footer.jsp"></jsp:include>
</body>

</html>