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
            
            	<!-- <a href="#">
	                <div class="bookmark-item">
	                    <img src="img/Icon.jpg" alt="" class="bookmark-icon">
	                    <img src="img/group1.png" alt="Group Image">
	                    <div class="bookmark-info">
	                        <h3>Group Title</h3>
	                        <p>Group Description</p>
	                    </div>
	                </div>
                </a> -->
                
            </div>
        </div>
    </div>
    <!-- Footer -->
    <jsp:include page="../common/footer.jsp"></jsp:include>
    
    <script>
    	$.ajax({
    		url: '/hobbyharvest/myBookmark.do',
    		type: 'post',
    		data: {data: ${userInfo.memberNo}},
    		dataType: 'json',
    		success: function(result) {
    			let bookmarkList = result;
    			console.log(result);
    			for(let bookmark of bookmarkList) {
    				
    				let a = document.createElement("a");
        			let bookmarkItem = document.createElement("div");
        			let img1 = document.createElement("img");
        			let img2 = document.createElement("img");
        			let bookmarkInfo = document.createElement("div");
        			let h3 = document.createElement("h3");
        			let p = document.createElement("p");
        			
        			a.href = "<%request.getContextPath();%>/서블릿?boardNo="+bookmark.boardNo;
        			bookmarkItem.className = 'bookmark-item';
        			img1.src = "D://upload"+bookmark.img;
        			img2.src = "D://upload"+"기본이미지경로";
        			bookmarkInfo.className = "bookmark-Info";
        			h3.textContent = bookmark.title;
        			p.textContent = bookmark.description;
        			
        			a.appendChild(bookmarkItem);
        			bookmarkItem.appendChild(img1);
        			bookmarkItem.appendChild(img2);
        			bookmarkItem.appendChild(bookmarkInfo);
        			bookmarkInfo.appendChild(h3);
        			bookmarkInfo.appendChild(p);
        			
        			document.getElementsByClassName("bookmark-list")[0].appendChild(a);
    				
    			}
    			
    			
    			
    			
    		},
    		error: function(error) {
    			alert('서버 통신 실패');
    		}
    	});
    </script>
    
</body>
</html>
