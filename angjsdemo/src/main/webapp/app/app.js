/**
 * 
 */

var app = angular.module('FoursquareApp', ['ngRoute', 'ngResource', 'ui.bootstrap', 'toaster', 'chieffancypants.loadingBar']);
app.config(function ($routeProvider) {
 
    $routeProvider.when("/explore", {
        controller: "placesExplorerController",
        templateUrl: "app/views/placesresults.html"
    });
   
    
    $routeProvider.when("/places", {
        controller: "myPlacesController",
        templateUrl: "app/views/myplaces.html"
    });
    
    $routeProvider.otherwise({ redirectTo: "/explore" });
 
});