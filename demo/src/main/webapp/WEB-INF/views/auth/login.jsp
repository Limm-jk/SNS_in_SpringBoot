<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<%@include file="../include/head.jsp"%>
<body>
  <main id="login">
    <div class="login__column">
      <img src="/images/phoneImage.png" />
    </div>
    <div class="login__column">
      <div class="login__box">
        <img src="/images/loginLogo.png" />
        <form action="feed.html" method="get" class="login__form">
          <input type="text" name="username" placeholder="Username" required>
          <input type="password" name="password" placeholder="Password" required>
          <input type="submit" value="Log in">
        </form>
        <span class="login__divider">
          or
        </span>
        <a href="http://facebook.com" class="login__fb-link"><i class="fa fa-facebook-square"></i> Log in with Facebook</a>
        <a href="#" class="login__small-link">Forgot password?</a>
      </div>
      <div class="login__box">
        <span class="login__text">
          Don't have an account? <br />
        </span>
        <a class="login__blue-link" href="#">Sign up</a>
      </div>
      <div class="login__t-box">
        <span class="login__text">
          Get the app.
        </span>
        <div class="login__appstores">
          <img src="/images/ios.png" class="login__appstore" />
          <img src="/images/android.png" class="login__appstore" />
        </div>
      </div>
    </div>
  </main>
  <%@include file="../include/footer.jsp"%>
</body>
</html>