(function() {
	var app = angular.module('sierraLab', []);

	app.controller('BreedController', ['$scope', '$http', function($scope, $http) {

		var init = function() {
			$http.get('/sierralab/breed').success(function(data) {
				$scope.breeds = data;
			});
		}();

		$scope.save = function() {
			var breedJson = breedToJson($scope.breed);
			$http.post("/sierralab/breed", breedJson).success(function(data) {
				$scope.breeds.unshift(data);
			});
		};
		
		$scope.remove = function(breed) {
			var id = breed.id;
			$http['delete']("/sierralab/breed/" + id).success(function() {
				var index = $scope.breeds.indexOf(breed);
				$scope.breeds.splice(index, 1);
			});
		};

		var breedToJson = function(breed) {
			return angular.toJson({
				breed : breed
			});
		};
	}]);

})();
