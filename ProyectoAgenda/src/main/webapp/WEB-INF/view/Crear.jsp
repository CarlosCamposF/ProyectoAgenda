<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="format-detection" content="telephone=no"/>
    <link rel="icon" href="images/favicon.ico" type="image/x-icon">
    <title>HOME</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Links -->
    <link rel="stylesheet" href="css/camera.css">
    <link rel="stylesheet" href="css/search.css">
    <link rel="stylesheet" href="css/google-map.css">
    <link rel="stylesheet" href="css/main2.css">


    <!--JS-->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-migrate-1.2.1.min.js"></script>
    <script src="js/rd-smoothscroll.min.js"></script>


    <!--[if lt IE 9]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/..">
            <img src="images/ie8-panel/warning_bar_0000_us.jpg" border="0" height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
    <script src='js/device.min.js'></script>
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
            <a data-type='rd-navbar-brand'  href="index.jsp">Agenda<small>interactiva</small></a>
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
                <li class="">
                  <a href="index.jsp">INICIO</a>
                </li>
                <li class="dropdown">
                  <a>CONTACTOS<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                  <ul class="dropdown-menu">
                    <li>
                      <a href="#">Mostrar todos</a>
                    </li>
                    <li>
                      <a href="Crear.html">Nuevo Contacto</a>                      
                    </li>  
                  </ul>  
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

    <main>        

      <section>
        
         <div align="center">
           <form>
              <h2>Crear<small> nuevo contacto</small></h2>
              <section id="form1">    
                   
              <h4><span class="glyphicon glyphicon-user"></span> Personal</h4>
                  Nombre:<br>
                  <input type="text" required><br>
                  Primer Apellido:<br>
                  <input type="text" required><br>
                  Segundo apellido:<br>
                  <input type="text"><br>
                  DNI:<br>
                  <input type="text"><br>
                  Fecha de nacimiento:<br>
                  <input type="text"><br>
                  Dirección:<br>
                  <input type="text" required><br>
                  Provincia:<br>
                  <input type="text" required><br>
                  Localidad:<br>
                  <input type="text" required><br>
                  Código postal:<br>
                  <input type="text" required><br>
                  Teléfono:<br>
                  <input type="text"><br>
               </section> 
              <section id="form2">
              <h4><span class="glyphicon glyphicon-file"></span> Empresa</h4>
                  Departamento:<br>
                  <select name="departamento">
                  <option value="">RRHH</option>
                  <option value="">Informática</option>
                  <option value="">Logística</option>
                  <option value="">Dirección</option>
                  </select><br>
                  Categoría:<br>
                  <select name="categoria">
                  <option value="">Programador</option>
                  <option value="">Analísta</option>
                  <option value="">Técnico RRHH</option>
                  <option value="">Secretaria</option>
                  <option value="">Recepcionista</option>
                  <option value="">Master del Universo</option>
                  </select><br>
                  Código de empleado:<br>
                  <input type="text" required><br>
                  Salario:<br>
                  <input type="text">€<br>
                  Fecha de alta:<br>
                  <input type="text"><br>
              </section>
                 
              
               <section id="form3">
            <b><input id="boton" type="submit" value="Crear Contacto" ></b>
              </section> 
           </form>
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
                <a href="#">
                  <img src="images/page-1_img7.jpg" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img8.jpg" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img9.jpg" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img10.jpg" alt="">
                </a>  
              </li>
            </ul>

            <ul class="flex-list">
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img11.jpg" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img12.jpg" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img13.jpg" alt="">
                </a>  
              </li>
              <li class="col-lg-3 col-sm-3 col-xs-6">
                <a href="#">
                  <img src="images/page-1_img14.jpg" alt="">
                </a>  
              </li>
            </ul>
          </div>  
          
        </div>
      </section>

    </main>

    <!--========================================================
                            FOOTER
  =========================================================-->
  <footer class="top-border">
    <section class="well1">
      <div class="container"> 
            <p class="rights">
              Business Company  &#169; <span id="copyright-year"></span>
              <a>Privacy Policy</a>
              More <a rel="nofollow" href="http://www.templatemonster.com/category/business-web-templates/" target="_blank">Business Website Templates at TemplateMonster.com</a>
            </p>          
      </div> 
    </section>    
  </footer>
  


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->         
    <script src="js/bootstrap.min.js"></script>
    <script src="js/tm-scripts.js"></script>    
  <!-- </script> -->

      </div>
  </body>
</html>
