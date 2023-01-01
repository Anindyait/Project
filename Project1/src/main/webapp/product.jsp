<!doctype html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <script src="https://code.jquery.com/jquery-3.3.1.js"
			integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
			crossorigin="anonymous">
	</script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><%= request.getAttribute("title") %></title>
    <link rel="icon" href="Pics/panda.png">
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="Bootstrap/CSS/style1.css">

    <script>
		$(function () {
			$("#header").load("header.jsp");
			$("#footer").load("footer.html");
		});
	</script>

</head>
<body>

    <!-- <?php $IPATH = $_SERVER["DOCUMENT_ROOT"]."/php/"; include($IPATH, "headernav.html"); ?> -->


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
    
    <div class="container-fluid">
    <div id="header"></div>
   	<div class="header-adjustment"></div>
   	
        <div class="cardnew fit" style="margin: 0 auto;">
            <div class="container px-4">
                <div class="row justify-content-center" >
                    <div class="col-lg mx-auto">
                        <div style="width: 93%; margin: 0px auto;" id="ProductCarousel" class="carousel slide" data-bs-ride="carousel">
                            <div class="carousel-indicators">
                                <button type="button" data-bs-target="#ProductCarousel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                                <button type="button" data-bs-target="#ProductCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
                                
                            </div>
                            <div class="carousel-inner round" >
                                <div class="carousel-item active" >
                                    <img src="Pics/<%= request.getAttribute("img1") %>.jpg" class="d-block w-100 img-size" alt="...">
                                </div>
                                <div class="carousel-item">
                                    <img src="Pics/<%= request.getAttribute("img2") %>.jpg" class="d-block w-100 img-size" alt="...">
                                </div>
                              
                            </div>

                            <button class="carousel-control-prev" type="button" data-bs-target="#ProductCarousel" data-bs-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Previous</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#ProductCarousel" data-bs-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Next</span>
                            </button>
                        </div>
                        
                    </div>
                    <div class="col-lg">


                        <div class="text">
                            
                            <!--Title-->
                                                                         <!-- to be replaced by java -->
                            <div class="Title" style="margin: 0px auto"><%= request.getAttribute("title") %></div>
                            
                            <!--Price-->
                            <div class="Price">&#8377;<%= request.getAttribute("price") %><sup>.00</sup></div>

                            <!--size selectors-->
                            <div class="size-selector-container">
                            											<!-- disable size if not available through servlet -->
                                <input type="radio" class="btn-check" <%= request.getAttribute("disabled_xs") %> name="btnradio" id="btnradio_xs" autocomplete="off">
                                <label class="btn btn-outline-dark size-selector" for="btnradio_xs">XS</label>
                            
                                <input type="radio" class="btn-check" <%= request.getAttribute("disabled_s") %> name="btnradio" id="btnradio_s" autocomplete="off">
                                <label class="btn btn-outline-dark size-selector" for="btnradio_s">S</label>
                            
                                <input type="radio" class="btn-check" <%= request.getAttribute("disabled_m") %> name="btnradio" id="btnradio_m" autocomplete="off">
                                <label class="btn btn-outline-dark size-selector" for="btnradio_m">M</label>

                                <input type="radio" class="btn-check" <%= request.getAttribute("disabled_l") %> name="btnradio" id="btnradio_l" autocomplete="off">
                                <label class="btn btn-outline-dark size-selector" for="btnradio_l">L</label>

                                <input type="radio" class="btn-check" <%= request.getAttribute("disabled_xl") %> name="btnradio" id="btnradio_xl" autocomplete="off">
                                <label class="btn btn-outline-dark size-selector" for="btnradio_xl">XL</label>
                            </div>

                            <!--Description-->
                            <div class="desc overflow-auto">
                                <!-- to be replaced by java -->
                                <div class="Description"><%= request.getAttribute("desc") %></div>
                            </div>
                            <div class="row justify-content-center button-grid ">
                                <div class="col-4">
                                    <input type="button" value="Buy" class="btn btn-warning Buy" />
                                </div>
                                <div class="col-4">
                                    <input type="button" value="Add to Cart" class="btn btn-outline-primary AddtoCart" />
                                </div>
                            </div>
                        </div>

                     </div>
                </div>
            </div>
        </div>
        <br>
        <div class="cardnew">
            <div class="text">
                <h1>More made-up stuff about this non-existent product!</h1>
                <br>
                <div class="Description opacity-75">*69mg of cocaine.**</div>
                <div class="Description opacity-75">**even more fucking cocaine.</div>

            </div>
        </div>
    </div>
<div id="footer"></div>
</body>
</html>