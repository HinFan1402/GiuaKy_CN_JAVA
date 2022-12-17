<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!-- Navigation -->
<nav  class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div  class="container">
        <div  class="navbar-header pull-left">
            <a href='<c:url value="/trang-chu"/>' class="navbar-brand">
                <small>
                    <i class="fa fa-leaf"></i>
                    Trang tin tức
                </small>
            </a>
        </div>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href='<c:url value="/trang-chu?reload=loading"/>'>Trang chủ
                <span class="sr-only">(current)</span>
              </a>
            </li>  
           <c:if test="${not empty USERMODEL}">
              <li class="nav-item">
                <a class="nav-link" href='#'>Wellcome, ${USERMODEL.fullName}</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Đăng xuất</a>
              </li>
            </c:if>
            <c:if test="${empty USERMODEL}">
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/dang-nhap?action=login"/>'>Đăng nhập</a>
              </li>
            </c:if>
            <c:if test="${empty USERMODEL}">
              <li class="nav-item">
                <a class="nav-link" href='<c:url value="/dang-nhap?action=register"/>'>Đăng ký</a>
              </li>
            </c:if>
            
          </ul>
        </div>
      </div>
</nav>