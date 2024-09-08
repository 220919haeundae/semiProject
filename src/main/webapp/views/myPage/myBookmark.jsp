<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hobby Harvest</title>
    <link rel="stylesheet" href="http://localhost:8080/hobbyharvest/views/css/myPage.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    
</head>
    <jsp:include page="myPageNav.jsp"></jsp:include>
        <div class="content">
            <div class="bookmark-list">
                <div class="bookmark-item">
                    <img src="img/Icon.jpg" alt="" class="bookmark-icon">
                    <img src="img/group1.png" alt="Group Image">
                    <div class="bookmark-info">
                        <h3>Group Title</h3>
                        <p>Group Description</p>
                    </div>
                </div>
                <div class="bookmark-item">
                    <img src="img/Icon.jpg" alt="" class="bookmark-icon">
                    <img src="img/group2.png" alt="Group Image">
                    <div class="bookmark-info">
                        <h3>Group Title</h3>
                        <p>Group Description</p>
                    </div>
                </div>
                <div class="bookmark-item">
                    <img src="img/Icon.jpg" alt="" class="bookmark-icon">
                    <img src="img/group2.png" alt="Group Image">
                    <div class="bookmark-info">
                        <h3>Group Title</h3>
                        <p>Group Description</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer -->
    <jsp:include page="../common/footer.jsp"></jsp:include>
    
    <script>
    	$.ajax({
    		url: '/hobbyharvest/myBookmark.do',
    		type: 'get',
    		data: {data: 'userInfo.mno'},
    		success: function(result) {
    			$('.content').html('<h3>북마크 기능 준비중<h3>');
    		},
    		error: function(error) {
    			alert('서버 통신 실패');
    		}
    	});
    </script>
    
</body>
</html>
