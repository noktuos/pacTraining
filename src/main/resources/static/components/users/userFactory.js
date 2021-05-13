'use strict'
app.factory('User',['$http', function($http){
    return{
        getAll: function(){
            return $http.get('/user/getAll');
        } ,
        getJosue: function(){
            return $http.get('/user/getJosue');
        },
        save: function(){
            return $http.get('/user/save',user);
        }
    }
}]);