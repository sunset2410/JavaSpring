<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" style="margin-top:0px">
    <div class="container">
      <img src="${pageContext.request.contextPath}/images/commons/logo_642_642.jpg" width="50" height="50" margin="10px">
      <a class="navbar-brand" style="margin-left: 10px; color: red" href="#">Công ty TNHH Hoàng Minh</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" style="color:red;" href='<c:url value ="/trang-chu" />' >Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" style="color:red;" href='<c:url value ="/web-about"/>' >About</a>            
          </li>
          <li class="nav-item">
            <a class="nav-link" style="color:red;" href='<c:url value ="/web-contact" />' >Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>