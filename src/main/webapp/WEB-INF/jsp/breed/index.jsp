<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="sierraLab">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sierra Labs - Breeds</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="https://code.angularjs.org/1.3.9/angular.min.js"></script>
<script src="../js/breed_controller.js"></script>

</head>
<body ng-controller="BreedController as controller">
		<div class="container">
			<h3>Breeds</h3>
			<form class="form">
				Name:
				<input type="text" ng-model="breed.name"/>
				<button ng-click="save()" class="btn btn-success">Save</button>
			</form>
			
			<table class="table table-striped" style="width : 40%">
                <thead>
                    <tr>
                        <th>Name</th>
                    </tr>
                </thead>
                <tbody>
                    <tr ng-repeat="breed in breeds | orderBy: breed.name">
                        <td>{{breed.name}}</td>
                        <td>
                        	<button ng-click="remove(breed)" class="btn btn-danger">Remove</button>
                        </td>
                    </tr>
                </tbody>
            </table>
		</div>
		
</body>
</html>