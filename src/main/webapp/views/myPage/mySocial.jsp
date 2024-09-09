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
            <div class="group-list">
                
            </div>
        </div>
    </div>

    <!-- Footer -->
    <jsp:include page="../common/footer.jsp"></jsp:include>
    
    <script>
    	$.ajax({
    		url: '/hobbyharvest/mySocial.do',
    		type: 'post',
    		data: {data: ${userInfo.memberNo}},
    		dataType: 'json',
    		success: function(result) {
    			let mySocialList = result;
    			console.log(mySocialList);
    			for(let mySocial of mySocialList) {
    				const a = document.createElement("a");
    				const divGroupItem = document.createElement("div");
    				const img = document.createElement("img");
    				const divGroupInfo = document.createElement("div");
    				const h3 = document.createElement("h3");
    				const p = document.createElement("p");
    				
    				a.href= "<%request.getContextPath();%>/서블릿?boardNo="+mySocial.boardNo;
    				divGroupItem.className = "group-item";
    				img.src = "D://upload" + mySocial.img;
    				img.alt = "Group Image";
    				divGroupInfo.className = "group-info";
    				h3.textContent = mySocial.title;
    				p.textContent = mySocial.description;
    				
    				divGroupItem.appendChild(img);
    				divGroupItem.appendChild(divGroupInfo);
    				divGroupInfo.appendChild(h3);
    				divGroupInfo.appendChild(p);
    				a.appendChild(divGroupItem);
    				
    				document.getElementsByClassName("group-list")[0].appendChild(a);
    			}
    			
    			
    		},
    		error: function(error) {
    			alert('서버 통신 실패');
    		}
    	});
    </script>
</body>
</html>
