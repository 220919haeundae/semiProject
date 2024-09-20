<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .calender-view-frame {
        width: 1000px; 
        margin: auto;
    }

    #btn-reply { 
        width: 20%; 
        border-radius: 0px 10px 10px 0px; 
    }

    .first-border-reply { 
        border-radius: 10px 10px 0px 0px;
    }
    
    .no-border-reply { 
        border-top: none; 
        border-bottom: none; 
    }

    .top-border-reply { 
        border-top: 1px solid; 
        border-bottom: none; 
    }

    .end-border-reply { 
        border-radius: 0px 0px 10px 10px; 
        margin-bottom: 10px; 
    }

    .comment-reply-style {
        display: flex; 
        justify-content: space-between;
    }

    .reply-icon {
        background-image: url(../resource/keyboard_return.png); 
        background-repeat: no-repeat; 
        width: 15px; 
        height: 15px; 
        background-size: 15px; 
        margin: 8px 0px 0px 8px;
        margin-right: 10px;
    }

    #no-reply-margin {
        margin: 0px 0px 0px 23px;
    }

    .reply-area-style {
        border: 1px solid; 
        min-height: 50px;
    }

    #modify-delete-reply {
        margin-right: 10px;
    }

    .reply-content-style {
        margin: 0px;
        margin-left: 25px;
    }

    .reply-nicname-area-style { 
        display: flex; 
    }

    .icon-comment-reply {
        background-image: url(https://cdn-icons-png.flaticon.com/128/4824/4824439.png); 
        justify-content: flex-end;
    }

    #comment-area { 
        display: flex; 
        margin-bottom: 10px;
    }

    #comment-content { 
        border: 1px solid; 
        border-radius: 10px 0px 0px 10px; 
        height: 100px; 
        width: 80%; 
        resize: none; 
        padding: 8px; 
    }

    .display-comment {
        margin: 20px; 
        display: flex;
    }

    .btn-frame {
        padding: 10px;
    }

    .btn-style {
        border: none; 
        border-radius: 10px; 
        width: 100px; 
        height: 50px;
    }

    .calender-view-title {
        border: 1px solid; 
        border-radius: 10px; 
        text-align: center; 
        height: 50px; 
        line-height: 50px; 
        margin: 10px 10px 10px 10px;
    }

    .reply-icon-style {
        padding-left: 10px;
    }

    .padding-ten-pixel{
        padding: 10px;
    }

    .calender-view-title-content{
        padding: 10px; 
        width: 300px;
    }

    .display-flex-style {
        display: flex;
    }

    .calender-view-content {
        border-top: 1px solid; 
        min-height: 300px;
    }

    .calender-view-title-sector {
        display: flex; 
        justify-content: space-between;
    }

    .calender-view-title-area{
        border: 1px solid; 
        border-radius: 10px; 
        margin: 0px 10px 10px 10px;
    }

    .calender-view-area {
        width: 70%; 
        border: 1px solid;
        margin: auto;
    }

    #section-border-comment-reply {
        margin: 0px 10px 0px 10px;
    }
</style>
</head>
<body>
    <div class="calender-view-frame">
        <div class="calender-view-area">
            <div class="calender-view-title">캘린더 일정 상세보기</div>
            
            <div class="calender-view-title-area">
                <div class="calender-view-title-sector">
                    <div class="calender-view-title-content">제목</div>
                    <div class="display-flex-style">
                        <div class="padding-ten-pixel">날짜</div>
                        <div class="padding-ten-pixel">XXXX.XX.XX ~ XXXX.XX.XX</div>
                    </div>
                </div>
                
                <div class="calender-view-content">
                    <div class="padding-ten-pixel">내용</div>
                </div>
            </div>
            
            
            <div id="section-border-comment-reply">
                <div class="reply-area-style first-border-reply">
                    <div class="comment-reply-style">
                        <div class="reply-nicname-area-style">
                            <span id="no-reply-margin">닉네임</span>
                        </div>
                        <div id="modify-delete-reply">
                            <a href="#">수정</a> <a href="#">삭제</a> <a href="#">답글</a>
                        </div>
                    </div>
                    <div>
                        <p class="reply-content-style">댓글 내용</p>
                    </div>
                </div>
                
                <div class="reply-area-style no-border-reply">
                    <div class="comment-reply-style">
                        <div class="reply-nicname-area-style">
                            &emsp;<p class="reply-icon"></p>
                            <span>닉네임</span>
                        </div>
                        <div id="modify-delete-reply">
                            <a href="#">수정</a> <a href="#">삭제</a> <a href="#">답글</a>
                        </div>
                    </div>
                    <div>
                        <p class="reply-content-style reply-icon-style">&emsp;댓글 내용</p>
                    </div>
                </div>
                
                <div class="reply-area-style top-border-reply">
                    <div class="comment-reply-style">
                        <div class="reply-nicname-area-style">
                            &emsp;&emsp;<p class="reply-icon"></p>
                            <span>닉네임</span>
                        </div>
                        <div id="modify-delete-reply">
                            <a href="#">수정</a> <a href="#">삭제</a> <a href="#">답글</a>
                        </div>
                    </div>
                    <div>
                        <p class="reply-content-style reply-icon-style">&emsp;&emsp;댓글 내용</p>
                    </div>
                </div>
                
                <div class="reply-area-style end-border-reply">
                    <div class="comment-reply-style">
                        <div class="reply-nicname-area-style">
                            <span id="no-reply-margin">닉네임</span>
                        </div>
                        <div id="modify-delete-reply">
                            <a href="#">수정</a> <a href="#">삭제</a> <a href="#">답글</a>
                        </div>
                    </div>
                    
                    <div>
                        <p class="reply-content-style">댓글 내용 댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용댓글 내용</p>
                    </div>
                    
                    <div id="comment-area" class="display-comment">
                        <p class="reply-icon"></p>
                        <textarea id="comment-content" placeholder="작성할 댓글을 입력하세요.">
                        </textarea>
                        
                        <button id="btn-reply">댓글 달기</button>
                    </div>
                </div>

                <div id="comment-area">
                    <textarea id="comment-content" placeholder="작성할 댓글을 입력하세요.">
                    </textarea>
                    
                    <button id="btn-reply">댓글 달기</button>
                </div>
            </div>

            <div class="btn-frame">
                <button class="btn-style">취소</button>
                <button class="btn-style">등록</button>
            </div>
        </div>
    </div>
</body>
</html>