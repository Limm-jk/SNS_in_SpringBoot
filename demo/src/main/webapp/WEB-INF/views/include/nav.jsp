<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 표준 라이브러리 태그 --%>

<nav class="navigation">
    <a href="/image/feed">
      <img src="/images/logo.png" />
    </a>
    <input type="text" placeholder="Search">
    <div class="navigation__links">
      <a href="/test/explore" class="navigation__link">
          <i class="fa fa-compass"></i>
      </a>
      <a href="#" class="navigation__link follow_popup">
          <i class="fa fa-heart-o"></i>
      </a>
      <a href="/test/profile" class="navigation__link">
          <i class="fa fa-user-o"></i>
      </a>
    </div>
</nav>

<!-- Modal 시작 -->
<div id="modal">
  <div id="follow_popup_list">

    <div class="follow_popup_item"> 
      <img src="/images/avatar.jpg" alt="내사진">
      <p><a href="#">나</a></p>
      <button class="following_btn">팔로잉</button>	
    </div>

    <div class="follow_popup_item"> 
      <img src="/images/avatar.jpg" alt="남의사진">
      <p><a href="#">남</a></p>
      <button class="follower_btn">팔로워</button>	
    </div>

    <div class="follow_popup_close">
      <button type="button">닫기</button>
    </div>
  </div>
  
</div>
<!-- Modal 끝 -->