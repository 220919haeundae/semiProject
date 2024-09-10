<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
	<style>
    html, body {
        width: 100%;
        height: 100%;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        border: red 1px solid;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100%;
        width: 100%;
    }
    .container * {
        margin: 3px 0; /* 요소 간격 조정 */
    }

    .login-form-area {
        border: lightgray 2px solid;
        border-radius: 15px;

        display: flex;
        justify-content: center;
        align-items: center;

        width: 300px;
        height: 300px;
        padding: 20px; /* 여백 추가 */
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 그림자 효과 추가 */
        background-color: white; /* 배경색 추가 */
    }

    table {
        width: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    button {
        padding: 10px;
        border: none;
        border-radius: 15px;
        background-color: black;
        color: white;
    }
    button:hover {
        cursor: pointer;
    }

    input {
        padding: 0px 10px 0px 10px;
        border: lightgray 2px solid;
        height: 35px;
        border-radius: 15px;
        }

    #btn-login {
        width: 100px;
    }

</style>
</head>
<body>
<% String contextPath = request.getContextPath(); %>
    <div class="container">
        <div class="login-form-area">
            <form id="login-form" action="<%= contextPath %>/login.me" method="post">
                <table align="center" >
                    <tr>
                        <td>아이디</td>
                    </tr>
                    <tr>
                        <td>
                            <input id="input-id" type="text" name="userId" required>
                        </td>
                    </tr>

                    <tr>
                        <td>비밀번호</td>
                    </tr>

                    <tr>
                        <td colspan="2">
                            <input class="input-items" type="password" name="userPw" minlength="8" required>
                        </td>
                    </tr>
                </table>
                <div align="center">
                    <button type="submit" id="btn-login">로그인</button>
                </div>
                <br>
                <div align="center">
                    <button type="submit" id="btn-findId" onclick="">아이디 찾기</button>
                    <button type="submit" id="btn-findPw" onclick="">비밀번호 찾기</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>