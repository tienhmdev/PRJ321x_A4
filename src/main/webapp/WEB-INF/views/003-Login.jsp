<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
	<%@ page isELIgnored ="false" %>
	<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/WEB-INF/views/commons/header.jsp"></jsp:include>
<title>Clickshop.com.vn | Login CMS</title>
</head>

<body>
	<div class="container-fluid">
		<div class="screen">
			<div class="box w-50">
				<div class="card shadow">
					<div class="card-header lead text-center">Clickshop.com.vn | <b>Login</b></div>
					<div class="card-body">
						<spring:form method="post" action="${pageContext.request.contextPath}/login/submit" modelAttribute="user">
							<div class="form-group">
								<label for="email">Email address <b style="color:red">(*)</b></label> <input
									type="text" name="email" class="form-control"
									id="email" placeholder="Enter email">
									<spring:errors cssClass="text-danger" path="email"/>
							</div>
							<div class="form-group">
								<label for="password">Password <b style="color:red">(*)</b></label> <input type="password"
									name="password" minlength="6" class="form-control"
									id="password" placeholder="Password" required>
							</div>
							<button type="submit" class="btn btn-lg btn-success">Login</button>
							<a href="<%=request.getContextPath() %>/register" class="btn btn-primary">Register</a>
							<a href="<%=request.getContextPath() %>/home" class="btn btn-danger text-white">Back to home</a>
						</spring:form>
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