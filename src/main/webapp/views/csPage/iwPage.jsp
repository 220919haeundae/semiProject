<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1문의 작성</title>
        <link rel="stylesheet" href="http://localhost:8080/hobbyharvest/views/css/iwPage.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
<div id="bodySection">

	<h2>1:1문의 작성</h2>

	<div class="container">
		<div class="form-group">
				<label for="title">제목</label>
				<input type="text" id="title" name="title" class="input-title" />
		</div>
		<label for="content">내용</label>
		<div class="file-input">
			<label for="fileUpload">첨부파일</label>
			<input type="file" id="fileUpload" />
		</div>
		<div class="form-group">
				<textarea id="content" name="content" class="input-content"></textarea>
		</div>
		<div class="button-group">
				<button class="cancel-button">취소</button>
				<button class="save-button">저장</button>
		</div>
</div>

</div>



<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>