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
        <div class="comment-list">
        
            <!-- <div class="comment-item">
                <img src="#" alt="Group Image">
                <div class="comment-info">
                    <h3>Group Title</h3>
                    <h5>작성일</h5>
                    <p>comment</p>
                </div>
            </div> -->
            
        </div>
    </div>
</div>
    <!-- Footer -->
    <jsp:include page="../common/footer.jsp"></jsp:include>
    
    <script>
    	$.ajax({
    		url: '/hobbyharvest/myComment.do',
    		type: 'post',
    		dataType: 'json',
    		data: {data: ${userInfo.memberNo}},
    		success: function(result) {
    			let commentList = result;
    				console.log(commentList);
    			for(let comment of commentList) {
    				const a = document.createElement("a");
    				const divCommentItem = document.createElement("div");
    				const img = document.createElement("img");
    				const divCommentInfo = document.createElement("div");
    				const h3 = document.createElement("h3");
    				const h5 = document.createElement("h5");
    				const p = document.createElement("p");
    				
    				
    				a.href = "<%request.getContextPath();%>/서블릿?boardNo="+comment.boardNo;
    				divCommentName.className = "comment-item";
    				img.src = "D://upload"+comment.img;
    				img.alt = "Group Image"
    				divCommentInfo.className = "comment-info";
    				h3.textContent = "댓글 작성한 게시판";
    				h5.textContent = "작성일";
    				p.textContent = "댓글 내용 일부";
    				
    				
    				divCommentItem.appendChild(img);
    				divCommentItem.appendChild(divCommentInfo);
    				divCommentInfo.appendChild(h3);
    				divCommentInfo.appendChild(h5);
    				divCommentInfo.appendChild(p);
    				a.appendChild(divCommentItem);
    				
    				document.getElementsbyClassName("comment-list")[0].appendChild(a);
    			}
    		},
    		error: function(error) {
    			alert('서버 통신 실패');
    		}
    	});
    </script>
    
</body>
</html>

            


    <!-- Footer -->
