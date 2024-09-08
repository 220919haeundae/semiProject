<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.hh.member.model.vo.Member" %>
    <!DOCTYPE html>
    <html lang="en">
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>자주묻는 질문</title>
        <link rel="stylesheet" href="http://localhost:8080/hobbyharvest/views/css/csPage.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</head>
<body>
    <jsp:include page="csPage.jsp"></jsp:include>
    <%
    Member m = new Member(1, "mId", "mPw", "mNickName", "email", "address", "phone");
    request.getSession().setAttribute("userInfo", m);
    %>
        <div class="faq">
        
            <h2>자주묻는 질문</h2>
            <div class="flip">
                <h5>Q. 1</h5>
                <p>A. 1</p>
            </div>
            <div class="flipa">></div>
            
            <div class="flip">
                <h5>Q. 1</h5>
                <p>A. 1</p>
            </div>
            <div class="flipa">></div>
            
            <div class="flip">
                <h5>Q. 1</h5>
                <p>A. 1</p>
            </div>
            <div class="flipa">></div>
            
            <div class="flip">
                <h5>Q. 1</h5>
                <p>A. 1</p>
            </div>
            <div class="flipa">></div>
            
            <div class="flip">
                <h5>Q. 1</h5>
                <p>A. 1</p>
            </div>
            <div class="flipa">></div>
            
        </div>
    </div>
    
    <script>

        $(function() {
        	$('.flip').click(function() {
        		let nextFlipa = $(this).next('.flipa');
                nextFlipa.slideDown();
                $('.flipa').not(nextFlipa).slideUp();
        	});
        });

    </script>
    
	<!-- Footer -->
	<jsp:include page="../common/footer.jsp"></jsp:include>


<body>
</html>
    