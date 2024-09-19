<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hobby Harvest</title>
    <link rel="stylesheet" href="http://localhost:8080/hobbyharvest/views/css/myPage.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</head>
    <jsp:include page="myPageNav.jsp"></jsp:include>
        <div class="content">
            <div class="group-list">
            <c:forEach var="mySocial" items="${ mySocialList }">
                <a href="list?boardNo=${mySocial.boardNo }">
                	<div class="group-item">
	                	<img src = "${mySocial.img }">
	                	<div class="group-info">
	                		<h3>
	                			${ mySocial.title }
	                		</h3>
	                		<p>
	                			${ mySocial.description }
	                		</p>
	                	</div>
                	</div>
                </a>
            </c:forEach>
            </div>
            
            <c:if test="${pi.maxPage>1 }">
            <ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="toMySocial.do?cpage=${ pi.currentPage-1 }">Previous</a></li>
				<c:forEach var="i" begin="${ pi.startPage }" end="${ pi.endPage }">
				<li class="page-item"><a class="page-link" href="toMySocial.do?cpage=${ i }">${ i }</a></li>
				</c:forEach>
				<li class="page-item"><a class="page-link" href="toMySocial.do?cpage=${ pi.currentPage+1 }">Next</a></li>
			</ul>
			</c:if>
        </div>
	    
    </div>

	
    <!-- Footer -->
    <jsp:include page="../common/footer.jsp"></jsp:include>
    
    
</body>
</html>
