<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>header</title>
<!-- 부트스트랩 스크립트 코드 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style>

@font-face {
    font-family: 'HancomMalangMalang-Regular';
    src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/2406-1@1.0/HancomMalangMalang-Regular.woff2') format('woff2');
    font-weight: 400;
    font-style: normal;
}

.header {
	/* border: red solid 1px; */
	box-sizing: border-box;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	padding: 5px;
	width: 100%;
	min-width: 1200px;
	height: 82px;
	border-bottom: lightgray 1px solid;
}

#img-area {
	flex: left;
	width: 15%;
}

.nav-area {
	/* border: red solid 1px; */
	width: 60%;
	display: flex;
	justify-content: space-evenly;
	
}



.menu {
	/* border: red solid 1px; */
	display: flex;
	width: 150px;
	height: 70px;
	/* background-color: aqua;
            border: black solid; */
}

.menu a {
	/* border: red solid 1px; */
	color: black;
	font-size: 20px;
	font-weight: 900;
	border-radius: 15px;
	transition: 0.3s ease-out;
	opacity: 0.9;
	display: inline-block;
	width: 100%;
	height: 100%;
	line-height: 65px;
}

.menu a:hover {
	color: white;
	text-decoration: none;
	background-color: violet;
}

.login-area {
	/* border: red solid 1px; */
	width: 15%;
	display: flex;
	flex-direction: row;
	align-items: center;
	justify-content: center;
	padding: 3px;
}

.before-login {
	display: flex;
}

.before-login * {
	line-height: 75px;
}

.after-login {
	display: flex;
}

.after-login * {
	line-height: 75px;
}

.before-login button {
	/* border: red solid 1px; */
	border: none;
	background-color: cornflowerblue;
	font-weight: 900;
	padding: 10px;
	margin: 3px;
	border-radius: 15px;
}

.before-login button:hover {
	color: white;
	background-color: violet;
	transition: 0.3s ease-out;
	opacity: 0.9;
}

.after-login td {
	height: 100%;
	margin: 5px;
}

.after-login button {
	background-color: violet;
	border: none;
}

.after-login button:hover {
	background-color: cornflowerblue;
}

#profile-icon {
	/* border: blue solid 2px; */
	align-content: center;
}

#profile-icon img {
	width: 40px;
	height: 40px;
}

.dropdown button {
	/* border: red solid 1px; */
	width: 120px;
}

</style>

</head>



<body>

<% String contextPath = request.getContextPath(); %>

	<div class="header">
		<!-- 카테고리 영역 -->
		<div id="img-area">img</div>
		<div class="nav-area" align="center">
			<div class="menu">
				<a href="<%= contextPath %>">HOME</a>
			</div>
			<div class="menu">
				<a href="#">카테고리</a>
			</div>
			<div class="menu">
				<a href="#">공지사항</a>
			</div>
			<div class="menu">
				<a href="toFaqPage.do">고객센터</a>
			</div>
		</div>




		<div class="login-area">
			<!-- 로그인 전 -->
			<!-- <div class="before-login">
                <button id="btn-login">로그인</button>
                <button id="btn-join">회원가입</button>
            </div> -->

			<!-- 로그인 후 -->
			<div class="after-login">
				<div id="profile-icon">
					<img src="views/img/user_img.png" alt="아이콘">
				</div>

				<div class="dropdown">
					<button type="button" class="btn btn-primary dropdown-toggle"
						data-toggle="dropdown">ㅇㅇㅇ님</button>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="toMyInfo.do">마이페이지</a> 
						<a class="dropdown-item" href="#">로그아웃</a>
					</div>
				</div>
			</div>
		</div>


	</div>
</body>
</html>