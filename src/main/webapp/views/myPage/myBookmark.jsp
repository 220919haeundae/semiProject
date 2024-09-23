<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hobby Harvest</title>
</head>
    <jsp:include page="myPageNav.jsp"></jsp:include>
        <div class="content">
            <div class="bookmark-list">
            	<c:forEach var="myBookmark" items="${ myBookmarkList }">
            	
	                <div class="bookmark-item">
	                    <img src="views/img/bookmarkicon.png" alt="북마크 아이콘" class="bookmark-icon">
	                    <img src="img/group1.png" alt="Group Image">
	                    <div class="bookmark-info">
	                    <a href="showBoard.me?board_id=${ myBookmark.boardNo }">
	                        <h3>${ myBookmark.title }</h3>
	                        <p>${ myBookmark.description }</p>
	                    </a>
	                    </div>
	                </div>
                
                </c:forEach>
            </div>
            <c:if test="${pi.maxPage>1 }">
            <ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="toMyBookmark.do?cpage=${ pi.currentPage-1 }">Previous</a></li>
				<c:forEach var="i" begin="${ pi.startPage }" end="${ pi.endPage }">
				<li class="page-item"><a class="page-link" href="toMyBookmark.do?cpage=${ i }">${ i }</a></li>
				</c:forEach>
				<li class="page-item"><a class="page-link" href="toMyBookmark.do?cpage=${ pi.currentPage+1 }">Next</a></li>
			</ul>
		</c:if>
        </div>
    </div>
    <!-- Footer -->
    <jsp:include page="../common/footer.jsp"></jsp:include>
    
</body>
</html>
