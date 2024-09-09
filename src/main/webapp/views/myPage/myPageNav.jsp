<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.hh.member.model.vo.Member"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>

	<%
	String contextPath = request.getContextPath();
	Member m = new Member(1, "mId", "mPw", "mNickName", "email", "address", "phone");
	request.getSession().setAttribute("userInfo", m);
	%>
	<!-- Header -->
	<header>
		<jsp:include page="../common/header.jsp"></jsp:include>
	</header>

	<div id="bodySection">
		<!-- Sidebar -->
		<div id="side-bar">
			<ul>
				<li><a href="<%=contextPath%>/toMyInfo.do" id="toMyInfo"
					onclick="toMyInfo();">내 정보 확인</a></li>
				<li><a href="<%=contextPath%>/toMySocial.do" id="toMySocial"
					onclick="toMySocial();">내 모임</a></li>
				<li><a href="<%=contextPath%>/toMyComment.do"
					id="toMyComment" onclick="toMyComment();">내가 작성한 댓글</a></li>
				<li><a href="<%=contextPath%>/toMyBookmark.do"
					id="toMyBookmark" onclick="toMyBookmark();">북마크</a></li>
				<li><a href="<%=contextPath%>/deleteMember.do">회원 탈퇴</a></li>
			</ul>
		</div>

		<!-- Main Content -->
</body>
</html>




