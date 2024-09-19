<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1문의</title>
<link rel="stylesheet" href="http://localhost:8080/hobbyharvest/views/css/csPage.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="customerServicePage.jsp"></jsp:include>



	<div class="pi">

		<h2>1:1 문의</h2>
		<div class="pia">
			<h6>작성자 이름</h6>
			<small>작성일</small>
		</div>


		<div class="under-side justify-content-center row" style="margin: auto; display: flex;">

			<div class="input-group mb-3 col-sm-2" style="border-radius: 20px; border: 1px solid lightgray; padding: 0;">
				<input type="text" class="form-control" style="border: none; border-radius: 20px;" placeholder="Recipient's username" aria-label="Recipient's username" aria-describedby="button-addon2">
				<button class="btn btn-outline-none bi bi-search" type="button" id="button-addon2" style="border-radius: 20px;"></button>
			</div>

			<ul class="pagination col-sm-5 justify-content-center">
				<li class="page-item"><a class="page-link" href="#">Previous</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">...</a></li>
				<li class="page-item"><a class="page-link" href="#">31</a></li>
				<li class="page-item"><a class="page-link" href="#">32</a></li>
				<li class="page-item"><a class="page-link" href="#">Next</a></li>
			</ul>
			<button type="button" class="btn btn-secondary col-sm-1" style="height:40px;"><a href="<%=request.getContextPath() %>/toIwPage.do">글쓰기</a></button>
		</div>
	</div>
	</div>

	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>