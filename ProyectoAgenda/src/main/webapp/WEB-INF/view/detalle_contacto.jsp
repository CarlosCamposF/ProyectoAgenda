<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="format-detection" content="telephone=no" />
    <link rel="icon" href="<c:url value="resources/images/favicon.ico"/>" type="image/x-icon">
    <title>HOME</title>

    <!-- Bootstrap -->
    <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Links -->
    <link rel="stylesheet" href="<c:url value="resources/css/camera.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/css/search.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/css/google-map.css"/>">
    <link rel="stylesheet" href="<c:url value="resources/css/main.css"/>">


    <!--JS-->
    <script src="<c:url value="resources/js/jquery.js"/>"></script>
    <script src="<c:url value="resources/js/jquery-migrate-1.2.1.min.js"/>"></script>
    <script src="<c:url value="resources/js/rd-smoothscroll.min.js"/>"></script>


    <!--[if lt IE 9]>
    <div style=' clear: both; text-align:center; position: relative;'>
        <a href="http://windows.microsoft.com/en-US/internet-explorer/..">
            <img src="images/ie8-panel/warning_bar_0000_us.jpg" border="0" height="42" width="820"
                 alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today."/>
        </a>
    </div>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
    <script src="<c:url value="resources/js/device.min.js"/>"></script>
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
                                    <a href="./">INICIO</a>
                                </li>
                                <li class="dropdown">
                                    <a href="index-2.html">CONTACTOS<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">Mostrar todos</a>
                                        </li>
                                        <li>
                                            <a href="#">Nuevo Contacto</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </nav>
                    <form class="search-form" action="ServletBusqueda" method="POST" accept-charset="utf-8">
                        <label class="search-form_label">
                            <input class="search-form_input" type="text" name="s" autocomplete="off" placeholder="" />
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

            <section class="well well1 well1_ins1">
                <div class="borde_ficha">
                    <div class="ficha">
                        <div class="caja_izquierda">
                            <div class="numero_empleado">
                                <div class="texto_numero_empleado">
                                    <p>

                                        DATOS DE CONTACTO

                                    </p>

                                </div>




                            </div>


                            <div class="imagen_empleado">
                                <div class="img_imagen_empleado">
                                    <img src="<c:url value="resources/images/imagen1.jpg"/>">



                                </div>
                            </div>

                            <div class="informacion_empresa">
                                <div class="texto_informacion_empresa">
                                    <p>
                                        INFORMACIÓN DE EMPRESA
                                    </p>
                                </div>

                                <div class="texto_adicional_informacion_empresa">
                                    <br>
                                    <p>
                                        <strong>
                    
                    Departamento : 
                </strong>Informatica
                                    </p>
                                    <br>
                                    <p>
                                        <strong>Categoria :</strong>${categoria.nombre}
                                    </p>
                                    <br>
                                    <p>
                                        <strong>Codigo de empleado : </strong>088037
                                    </p>
                                    <br>
                                    <p>
                                        <strong>Salario : </strong>${empleado.salario}
                                    </p>
                                    <br>

                                    <strong>
             Fecha de alta :     
             </strong>12-01-1989
                                    <p>

                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="informacion_personal">
                            <div class="texto_informacion_personal">
                                <p>

                                    INFORMACION PERSONAL
                                </p>
                            </div>
                            <div class="texto_adicional_informacion_personal">
                                <br>
                                <p><strong>Nombre : </strong>${persona.nombre}</p>
                            
                                <br>
                                <p><strong>Primer apellido : </strong>${persona.apellido1}</p>
                                <br>
                                <p><strong>Segundo apellido : </strong>${persona.apellido2}</p>
                                <br>
                                <p><strong>D.N.I. : </strong>${persona.dni}</p>
                                <br>
                                <p><strong>Fecha de nacimiento : </strong>${persona.fechaNacimiento}</p>
                                <br>
                                <p><strong>Direccion : </strong>C/Falsa 123</p>
                                <br>
                                <p><strong>Provincia : </strong>Madrid</p>
                                <br>
                                <p><strong>Localidad : </strong>Madrid</p>
                                <br>
                                <p><strong>Telefono : </strong>654666456</p>
                                <br>
                            </div>


                        </div>
                        <div class="clearfix">

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
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img7.jpg"/>" alt="">
                                </a>
                            </li>
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img8.jpg"/>" alt="">
                                </a>
                            </li>
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img9.jpg"/>" alt="">
                                </a>
                            </li>
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img10.jpg"/>" alt="">
                                </a>
                            </li>
                        </ul>

                        <ul class="flex-list">
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img11.jpg"/>" alt="">
                                </a>
                            </li>
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img12.jpg"/>" alt="">
                                </a>
                            </li>
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img13.jpg"/>" alt="">
                                </a>
                            </li>
                            <li class="col-lg-3 col-sm-3 col-xs-6">
                                <a href="#">
                                    <img src="<c:url value="resources/images/page-1_img14.jpg"/>" alt="">
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
                        Business Company &#169; <span id="copyright-year"></span>
                        <a href="index-5.html">Privacy Policy</a> More <a rel="nofollow" href="http://www.templatemonster.com/category/business-web-templates/" target="_blank">Business Website Templates at TemplateMonster.com</a>
                    </p>
                </div>
            </section>
        </footer>



        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="<c:url value="resources/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="resources/js/tm-scripts.js"/>"></script>
        <!-- </script> -->

    </div>
</body>

</html>