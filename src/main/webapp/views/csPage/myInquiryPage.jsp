<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내가 작성한 문의</title>

        <link rel="stylesheet" href="http://localhost:8080/hobbyharvest/views/css/miPage.css">
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

		<h2>1:1문의 조회</h2>

		<div class="container">

			<div class="form-group title-area" style="display: flex; justify-content: space-between;">
				<label for="title">제목</label>
				<input type="text" id="title" name="title" class="display-title" style="width:75%" readonly/>
				<input type="text" id="wdate" name="wdate" class="display-date" value="2024. 09. 07." style="width:20%" readonly/>
			</div>
			<label for="content">내용</label>
			<div class="file-output">
				<span>첨부파일</span>
				<ul class="scroll-list">
					<li><a href="#" download="새로운파일이름.pdf">공지사항 첨부파일1</a></li>
					<li><a href="#" download="새로운파일이름.pdf">공지사항 첨부파일2</a></li>
					<li><a href="#" download="새로운파일이름.pdf">공지사항 첨부파일3</a></li>
				</ul>
				
			</div>
			<div class="form-group">
				<textarea id="content" name="content" class="input-content" readonly></textarea>
			</div>
			<div class="button-group">
				<button class="cancel-button">삭제</button>
				<button class="save-button">수정</button>
			</div>


		</div>

	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>