'user strict'
app.controller('UserController',['User','$scope', function(User, $scope) {
    User.getAll().then(response => {
        $scope.users = response.data;
    });

    User.getJosue().then(response => {
        $scope.chechue = response.data;
    })
}]);