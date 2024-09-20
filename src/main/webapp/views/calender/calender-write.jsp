<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
     .btn-frame {
        padding: 10px;
    }

    .btn-style {
        border: none; 
        border-radius: 10px; 
        width: 100px; 
        height: 50px;
    }

    [contenteditable]:empty:before {
        content: attr(placeholder);
        color: gray
    }

    .calender-write-frame {
        width: 1000px; 
        margin: auto;
    }

    .calender-write-title {
        border: 1px solid; 
        border-radius: 10px; 
        text-align: center; 
        height: 50px; 
        line-height: 50px; 
        margin: 10px 10px 10px 10px;
    }

    .calender-write-title-area {
        margin: 10px;
    }

    .calender-write-title-content{
        border: 1px solid; 
        border-bottom-left-radius: 10px; 
        border-bottom-right-radius: 10px; 
        padding: 10px;
    }

    .calender-write-area {
        width: 70%; 
        border: 1px solid;
        margin: auto;
    }

    .calender-title {
        border: 1px solid; 
        border-top-left-radius: 10px; 
        border-top-right-radius: 10px; 
        border-bottom: none; 
        padding: 10px;
    }

    .calender-content-area {
        border: 1px solid; 
        border-radius: 10px; 
        margin: 10px;
    }

    .content {
        margin: 10px; 
        min-height: 200px;
    }

    .calender-content-title {
        border-bottom: 1px solid; 
        padding: 10px;
    }
    .calender-date-frame {
        display: flex; 
        margin-left: 10px;
    }

    .calender-date-title {
        border: 1px solid; 
        border-top-left-radius: 10px; 
        border-bottom-left-radius: 10px; 
        width: 80px; 
        text-align: center; 
        line-height: 130px;
    }

    .calender-date-start-end {
        border: 1px solid; 
        border-top-right-radius: 10px; 
        border-bottom-right-radius: 10px;
    }

    .calender-date-start {
        border-bottom: 1px solid; 
        margin: 0px; 
        padding: 10px;
    }

    .calender-date-end {
        margin: 0px; 
        padding: 10px;
    }
</style>

</head>
<body>
    <div class="calender-write-frame">
        <div class="calender-write-area" >
            <div class="calender-write-title">캘린더 일정 작성</div>

            <div class="calender-write-title-area">
                <div class="calender-title">제목</div>
                <div class="calender-write-title-content">제목입니다.</div>
            </div>
            
            <div class="calender-date-frame">
                <div class="calender-date-title">날짜</div>
                <div class="calender-date-start-end">
                    <p class="calender-date-start">시작일<br><input type="date" value="<%= request.getParameter("startDate") %>"></p>
                    <p class="calender-date-end">종료일<br><input type="date" value="<%= request.getParameter("endDate") %>"></p>
                </div>
            </div>

            <div class="calender-content-area">
                <div>
                    <div class="calender-content-title">내용</div>
                </div>
                <div class="content" contenteditable placeholder='내용을 입력해 주세요...'></div>
            </div>
            
            <div class="btn-frame">
                <button class="btn-style">취소</button>
                <button class="btn-style">등록</button>
            </div>
        </div>
    </div>
</body>
</html>