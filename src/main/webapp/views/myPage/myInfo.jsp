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
<body>
    <jsp:include page="myPageNav.jsp"></jsp:include>
        <div class="content">
        <div id="user-info">
        <h2>기본정보</h2>
        <hr>
            <table>
                <tr>
                    <td rowspan="2" style="vertical-align: middle; width: 0;"><img src="views/img/user_img.png" alt=""></td>
                    <td>${ userInfo.memberId }</td>
                </tr>
                <tr>
                    <td style="padding-left: 10px" >${ userInfo.email }</td>
                </tr>
                
                <tr>
                    <td style="vertical-align: middle;"><img src="views/img/Smartphone.png" alt=""></td>
                    <td>${ userInfo.phone }</td>
                </tr>
                <tr>
                    <td style="vertical-align: middle;"><img src="views/img/address.png" alt=""></td>
                    <td>${ userInfo.address }</td>
                </tr>
            </table>
        </div>
        <div style="margin-top: 10px;"><button class="btn btn-light" style="margin-left: 77%; box-shadow: 0px 3px 5px gray;">내 정보 수정</button></div>
        </div>
    </div>
        <!-- Footer -->
         <jsp:include page="../common/footer.jsp"></jsp:include>


<body>
</html>
    