<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<!-- IE 호환 모드 지원 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<!-- 모바일 웹브라우져 대응 -->
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>맥딜리버리-메뉴</title>
<!-- Bootstrap css 로딩 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> -->
<link rel="stylesheet" href="css/bootstrap.css"/>
</head>

<body>
<!-- Bootstrap 의 jquery 플러그인 기능 쓰기 위해
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script> 
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script> -->
<script src="js/jquery-3.2.1.js"></script>
<script src="js/bootstrap.js"></script>	

<!-- ================================================================================================================================================== -->
<div class="root">
 <div class="container">
 
 
 <div class="header">
 
  <div class="row top-menu">          
   <div class="col-6 text-left language-selector">
    <ul class="list-inline">
     <li class="list-inline-item selected">
      <a class="list-inline-item-target" href="#">한국어</a> 
     </li> 
     <li class="list-inline-item">
      <a class="list-inline-item-target" href="#">English</a> 
     </li>       
    </ul>
   </div>
   
   <div class="col-6 text-right quick-account">
    <ul class="list-inline">
     <li class="list-inline-item">
      <a class="list-inline-item-target" href="#">로그인</a>
     </li>
     <li class="list-inline-item">
      <a class="list-inline-item-target" href="#">주문 조회</a> 
     </li> 
    </ul>
   </div> 
  </div> <!-- /top-menu -->
  
  <div class="header-navbar navbar-default" role="navigation">
   <div class="navigation-first">
    <a class="navbar-brand" href="home.jsp">홈</a>
   </div>
   
   <div class="navigation-main">
    <ul class="navbar-nav">
     <li class="menu-item">
      <a class="menu-item-target" href="menu.jsp">메뉴</a>
     </li>
     <li class="menu-item">
      <a class="menu-item-target" href="#">마이페이지</a>
     </li>     
     <li class="menu-item dropdown open">
      <a class="menu-item-target dropdown-toggle" href data-toggle="dropdown" aria-expanded="false">기타정보</a>
       <ul class="dropdown-menu">
        <li class="dropdown-menu-item">
         <a class="dropdown-menu-item-target" href="#">이용약관</a>
        </li>
        <li class="dropdown-menu-item">
         <a class="dropdown-menu-item-target" href="#">개인정보 취급방침</a>
        </li>
        <li class="dropdown-menu-item">
         <a class="dropdown-menu-item-target" href="#">자주 묻는 질문</a>
        </li>
        <li class="dropdown-menu-item">
         <a class="dropdown-menu-item-target" href="#">과일 칠러 판매 제외 매장</a>
        </li>
        <li class="dropdown-menu-item">
         <a class="dropdown-menu-item-target" href="#">원산지 표지판</a>
        </li>
        <li class="dropdown-menu-item">
         <a class="dropdown-menu-item-target" href="#">모바일 웹</a>
        </li>                                        
       </ul>
     </li>
    </ul>
   </div>
  </div> <!-- /header-navbar -->
  
 </div> <!-- /header -->
 
 <div class="row main">
  <div class="col-2 sidebar" data-sticky="true">
   <div class="food-menu">
    <ul class="primary-menu">
     <li class="primary-menu-item selected">
      <a class="primary-menu-item-target" href="?daypartId=1">
       <span>일반 메뉴</span>
       <i class="fa fa-angle-right"></i>
      </a>
      <ul class="day-menu">
       <li class="day-menu-item selected">
        <a class="day-menu-item-target" href="?daypartId=1&catId=10">
         <i class="fa fa-circle"></i>
          <span>추천 메뉴</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=1&catId=11">
         <i class="fa fa-circle"></i>
          <span>버거 & 세트</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=1&catId=12">
         <i class="fa fa-circle"></i>
          <span>스낵 & 사이드</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=1&catId=13">
         <i class="fa fa-circle"></i>
          <span>음료</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=1&catId=14">
         <i class="fa fa-circle"></i>
          <span>디저트</span>
        </a>
       </li> 
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=1&catId=15">
         <i class="fa fa-circle"></i>
          <span>해피밀®</span>
        </a>
       </li>                                      
      </ul>
     </li>
     <li class="primary-menu-item">
      <a class="primary-menu-item-target" href="?daypartId=2">
       <span>아침 메뉴</span>
       <i class="fa fa-angle-right"></i>
      </a> 
      <ul class="day-menu">
       <li class="day-menu-item selected">
        <a class="day-menu-item-target" href="?daypartId=2&catId=10">
         <i class="fa fa-circle"></i>
          <span>추천 메뉴</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=2&catId=11">
         <i class="fa fa-circle"></i>
          <span>맥모닝 & 세트</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=2&catId=12">
         <i class="fa fa-circle"></i>
          <span>스낵 & 사이드</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=2&catId=13">
         <i class="fa fa-circle"></i>
          <span>음료</span>
        </a>
       </li>
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=2&catId=14">
         <i class="fa fa-circle"></i>
          <span>디저트</span>
        </a>
       </li> 
       <li class="day-menu-item">
        <a class="day-menu-item-target" href="?daypartId=2&catId=15">
         <i class="fa fa-circle"></i>
          <span>해피밀®</span>
        </a>
       </li>                                      
      </ul>           
     </li>
    </ul>
   </div>
  </div> <!-- /sidebar -->
   
  <div class="col-10 pull-right">
   <ol class="breadcrumb type-sans">
    <li>
     <a href="menu.jsp">메뉴</a>
    </li>
    <li class="active">
          각 메뉴 이름
    </li>
   </ol>
   
   <div class="contents">
    <div class="row">
     <div class="col-8">
     </div>
     
     <div class="col-2">
      <a class="orderlink" href="#signin" data-target="#signin" data-toggle="modal">
       <img class="img-block" src="images/how-mcdelivery-works-portrait.png">
      </a>
     </div>
    </div>
   </div>
  </div> 
  
 </div> <!-- main -->
 
 <!-- modal (#signin) -->
 <div class="modal fade" id="signin">
  <div class="modal-dialog">
   <div class="modal-content">
    <div class="modal-header">
     <button class="modal-close" data-dismiss="modal">X</button>
     <h4 class="modal-title">로고사진</h4>
    </div>
    <div class="modal-body">
     <p>주문을 하시려면 로그인하시기 바랍니다.</p>
     <form>
      <div class="form-group">
       <input type="text" class="form-control" id="inputId" placeholder="아이디">
       <input type="password" class="form-control" id="inputPw" placeholder="비밀번호">
      </div> 
      <button type="submit" class="btn btn-primary">로그인</button>
      <p class="forgot-password">
       <a class="action-link" href="forgotPw.jsp">비밀번호 찾기</a>
      </p>
      <hr class="fading-divider">
      <p class="guest">
       <a class="action-link" href="guest.jsp">신규 회원</a> 
      </p>
     </form> 
    </div>
   </div>
  </div>
 </div>





 <div class="footer">
  
  <div class="row bottom-menu">
   <div class="col-4 menu">
    <h3 class="list-group-title">메뉴</h3>
     <ul class="list-unstyled">
      <li class="menu-item">
       <a class="menu-item-target" href="#">추천 메뉴</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">버거 & 세트</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">스낵 & 사이드</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">음료</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">디저트</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">해피밀®</a>
      </li>                              
     </ul>
   </div>
   <div class="col-4 info">
    <h3 class="list-group-title">기타정보</h3>
     <ul class="list-unstyled">
      <li class="menu-item">
       <a class="menu-item-target" href="#">이용약관</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">개인정보 취급방침</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">자주 묻는 질문</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">과일 칠러 판매 제외 매장</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">원산지 표시판</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">모바일 웹</a>
      </li>                              
     </ul>
   </div>
   <div class="col-4 follow">
    <h3 class="list-group-title">팔로우</h3>
     <ul class="list-unstyled">
      <li class="menu-item">
       <a class="menu-item-target" href="#">페이스북</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">인스타그램</a>
      </li>
      <li class="menu-item">
       <a class="menu-item-target" href="#">유튜브</a>
      </li>                              
     </ul>
   </div>      
  </div> <!-- /bottom-menu -->
  
  <div class="bottom-info">
   <div class="content">
    <div class="text-center">
         한국맥도날드(유) | 대표자: 조주연 | 서울특별시 종로구 종로1 교보 생명 빌딩 13층 | 전화번호: 070-7018-4500 | 사업자등록번호: 101-81-26409 | 호스팅서비스 제공자: ㈜이노컴퍼니 <br> <br>
         공정위 사업자 링크 정보 : <a href="www.mcdonalds.co.kr" target="_blank">한국맥도날드(유)</a>
    </div>
    <div class="text-center text-ucase">Copyright © 2014 All Rights Reserved By McDonald's™</div>
    <div class="text-center text-ucase">골든 아치 로고와 "i'm lovin' it"은 맥도날드 고유의 상표입니다.</div>
   </div>
  </div> <!-- /bottom-info -->
  
 </div> <!-- /footer -->
 
 </div> <!-- /container -->
</div> <!-- /root -->



<!-- ================================================================================================================================================== -->
<script>
$(document).ready(function() {
	$(".orderlink").shown.bs.modal(function() {
		 $("#signin").modal("toggle");	
	 });
})

</script>


</body>
</html>    