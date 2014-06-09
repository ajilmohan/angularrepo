<html data-ng-app="FoursquareApp">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
    <title>Explore Foursquare</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/cerulean.min.css" rel="stylesheet" />
    <link href="css/toaster.css" rel="stylesheet" />
    <link href="css/loading-bar.min.css" rel="stylesheet" />
    <link href="css/site.css" rel="stylesheet" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="shortcut icon" href="favicon.ico" />
</head>
<body>


	
    <div id="page">
        <header class="container">
            <div class="navbar navbar-default" id="menu">
                <div class="navbar-header">
                    <button class="btn btn-success navbar-toggle"></button>
                    <div id="logo">
                        <h4>Explore Foursquare</h4>
                    </div>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#/explore">Explore</a></li>
                        <li><a href="#/places">My Places</a></li>
                        <li><a href="#/about">About</a></li>
                    </ul>
                </div>
            </div>
        </header>
        <section class="container" id="body">
            <div data-ng-view=""></div>
        </section>
 
        <hr />
 
        <footer class="container">
            Created by Taiseer Joudeh. Twitter: <a href="http://twitter.com/tjoudeh" target="_blank">@tjoudeh</a>
 
            Taiseer Joudeh Blog: <a href="http://www.bitoftech.net" target="_blank">bitoftech.net</a>
        </footer>
    </div>
</body>
</html>
<!-- 3rd party libraries -->
<script type="text/javascript" src="scripts/angular.min.js"></script>
<script type="text/javascript" src="scripts/angular-route.min.js"></script>
<script type="text/javascript" src="scripts/angular-resource.min.js"></script>
<script type="text/javascript" src="scripts/angular-animate.min.js"></script>
<script type="text/javascript" src="scripts/ui-bootstrap.min.js"></script>
<script type="text/javascript" src="scripts/ui-bootstrap-tpls.min.js"></script>
<script type="text/javascript" src="scripts/toaster.js"></script>
<script type="text/javascript" src="scripts/loading-bar.min.js"></script>
<!-- Load app main script -->
<script type="text/javascript" src="app/app.js"></script>
<!-- Load controllers -->
<script type="text/javascript" src="app/controllers/placesExplorerController.js"></script>
<script type="text/javascript" src="app/controllers/placesPhotosController.js"></script>
<script type="text/javascript" src="app/controllers/userContextController.js"></script>
<script type="text/javascript" src="app/controllers/myPlacesController.js"></script>

<!-- Load services -->
<script type="text/javascript" src="app/services/placesExplorerService.js"></script>
<script type="text/javascript" src="app/services/placesPhotosService.js"></script>
<script type="text/javascript" src="app/services/placesDataService.js"></script>
<!-- Load filters -->
<script type="text/javascript" src="app/filters/placeNameCategoryFilter.js"></script>
