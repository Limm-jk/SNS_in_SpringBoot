<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<%@include file="../include/head.jsp"%>
<body>
  <nav class="navigation">
    <a href="feed.html">
      <img src="images/logo.png" />
    </a>
    <input type="text" placeholder="Search">
    <div class="navigation__links">
      <a href="explore.html" class="navigation__link">
          <i class="fa fa-compass"></i>
      </a>
      <a href="#" class="navigation__link">
          <i class="fa fa-heart-o"></i>
      </a>
      <a href="profile.html" class="navigation__link">
          <i class="fa fa-user-o"></i>
      </a>
    </div>
  </nav>


  <main id="edit-profile">
    <div class="edit-profile__container u-default-box">
      
      <header class="edit-profile__header">
        <div class="fucker-container">
          <img src="images/avatar.jpg" />
        </div>
        <!-- master comments -->
        <h1 class="edit-profile__username">serranoarevalo</h1>
      </header>

      <form class="edit-profile__form">
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="name">Name</label>
          <input id="name" type="text" value="Nicolás Serrano Arévalo">
        </div>
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="username">Username</label>
          <input id="username" type="text">
        </div>
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="website">Website</label>
          <input id="website" type="url">
        </div>
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="bio">Bio</label>
          <textarea id="bio"></textarea>
        </div>
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="email">Email</label>
          <input id="email" type="email">
        </div>
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="phone-number">Phone Number</label>
          <input id="phone-number" type="text">
        </div>
        <div class="edit-profile__row">
          <label class="edit-profile__label" for="gender">Gender</label>
          <select  id="gender">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="cant-remember" selected>Can't remember</option>
          </select>
        </div>
        <div class="edit-profile__row">
          <span></span>
          <input type="submit">
        </div>
      </form>

    </div>
  </main>
    <%@include file="../include/footer.jsp"%>
</body>
</html>