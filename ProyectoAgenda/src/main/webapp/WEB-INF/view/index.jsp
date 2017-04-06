<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="format-detection" content="telephone=no"/>
    <link rel="icon" href="<c:url value="resources/images/favicon.ico"/>" type="<c:url value="resources/image/x-icon"/> " >
    <title>HOME</title>

    <!-- Bootstrap
    <spring:url value="/resources/css/custom.css" var="estilos3" />
		<link href="${estilos3}" rel="stylesheet" /> -->
    <link href="<spring:url value="resources/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Links -->
    <link rel="stylesheet" href="<spring:url value="resources/css/camera.css"/>" >
    <link rel="stylesheet" href="<spring:url value="resources/css/search.css"/>" >
    <link rel="stylesheet" href="<spring:url value="resources/css/google-map.css" /> " > 


    <!--JS-->
    <script src="<spring:url value="/resources/js/jquery.js" /> " ></script>
    <script src="<spring:url value="/resources/js/jquery-migrate-1.2.1.min.js" /> " ></script>
    <script src="<spring:url value="/resources/js/rd-smoothscroll.min.js" /> " ></script>


    <!--[if lt IE 9]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/..">
            <img src="<c:url value="images/ie8-panel/warning_bar_0000_us.jpg"/> " border="0" height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <script src="<spring:url value="/resources/js/html5shiv.js"/> " ></script>
    <![endif]-->
    <script src="<spring:url value="/resources/js/device.min.js"/> " ></script>
  </head>
  <body>
  <div class="page">
  <!--========================================================
                            HEADER
  =========================================================-->
    <header>  
      <div class="container top-sect">
        <div class="navbar-header">
          <h1 class="navbar-brand">
            <a data-type='rd-navbar-brand'  href="./">Agenda<small>interactiva</small></a>
          </h1>
          <a class="search-form_toggle" href="#"></a>
        </div>

        <div class="help-box text-right">
          <p>¿Necesitas ayuda?</p>
          <a href="#">800-2345-6789</a>
        </div>
      </div>


      <div id="stuck_container" class="stuck_container">
        <div class="container">   
        <nav class="navbar navbar-default navbar-static-top pull-left">            

            <div class="">  
              <ul class="nav navbar-nav sf-menu" data-type="navbar">
                <li class="active">
                  <a href="/">INICIO</a>
                </li>
                <li class="dropdown">
                  <a href="listado">LISTAR CONTACTOS<span class="glyphicon glyphicon-menu-down" aria-hidden="true" ></span></a>
                  </li>
                  
                </ul>                         
            </div>
        </nav>   
        <form class="search-form" action="ServletBusqueda" method="POST" accept-charset="utf-8">
          <label class="search-form_label">
            <input class="search-form_input" type="text" name="s" autocomplete="off" placeholder=""/>
            <span class="search-form_liveout"></span>
          </label>
          <button class="search-form_submit fa-search" type="submit"></button>
        </form>
             
        </div>

      </div>  
    </header>

  <!--========================================================
                            CONTENT
  =========================================================-->

    <div id="main">        

      <section class="well well1 well1_ins1">
        <div class="camera_container">
          <div id="camera" class="camera_wrap">
           <div data-src="<spring:url value="resources/images/page-1_slide1p.jpg"/> "> 
            <!--<div style='background-image: url(<c:url value="resources/images/page-1_slide1p.jpg"/>) '>   -->
              <div class="camera_caption fadeIn">
                <div class="jumbotron jumbotron1">
                  <em>
                    CONTACTOS
                  </em>
                  <div class="wrap">
                    <p>
                      Explora tu lista de contactos.
                    </p>
                    <a href="#" class="btn-link fa-angle-right"></a>
                  </div>  
                </div>
              </div>
            </div>
         </div>
        </div>
        </section>
  
      <section class="well well2">
        <div class="container">
          <h2>
            Nuestros 
            <small>
              clientes
            </small>
          </h2>

          <div class="row offs1">
            <ul class="flex-list">
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img7.jpg"/> " alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img8.jpg"/> " alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img9.jpg"/> " alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img10.jpg"/> " alt="">
                </a>  
              </li>
            </ul>

            <ul class="flex-list">
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img11.jpg"/> " alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img12.jpg"/> " alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img13.jpg"/> " alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a>
                  <img src="<spring:url value="resources/images/page-1_img14.jpg"/> " alt="">
                </a>  
              </li>
            </ul>
          </div>  
          
        </div>
      </section>

    </div>

    <!--========================================================
                            FOOTER
  =========================================================-->
  <footer class="top-border">
    <section class="well1">
      <div class="container"> 
            <p class="rights">
              Business Company  &#169; <span id="copyright-year"></span>
              <a href="#">Privacy Policy</a>
              More <a rel="nofollow" href="http://www.templatemonster.com/category/business-web-templates/" target="_blank">Business Website Templates at TemplateMonster.com</a>
            </p>          
      </div> 
    </section>    
  </footer>
  


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->         
    <script src="<spring:url value="resources/js/bootstrap.min.js"/> " ></script>
    <script src="<spring:url value="resources/js/tm-scripts.js"/> " ></script>    
  <!-- </script> -->

      </div>
  </body>
</html>

