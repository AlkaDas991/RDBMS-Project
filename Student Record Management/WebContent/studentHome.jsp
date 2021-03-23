<%@include file="header.html"%>
<!DOCTYPE html>
<html>
<title>IIIT,BBSR</title>
<body>
	<img src="left.png" align="left" width="150" height="150">
	<center>
		<img src="center.png" width="150" height="150"> <img
			src="right.png" align="right" width="150" height="150">
	</center>
	<div class="w3-container">
		<div class="w3-bar w3-black">
			<button class="w3-bar-item w3-button tablink w3-red"
				onclick="openCity(event,'London')">View My Result</button>
			<button class="w3-bar-item w3-button tablink"
				onclick="openCity(event,'Paris')">Change Password</button>
			<a href="dgiOneView.jsp" class="w3-bar-item w3-button tablink">Logout</a>
		</div>

		<div id="London" class="w3-container city">
			<br>
			<link
				href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
				rel="stylesheet" id="bootstrap-css">
			<script
				src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
			<script
				src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
			<!------ Alright Include the above in your HEAD tag ---------->

			<!doctype html>
			<html lang="en">
<head>
<!--OK Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Fonts -->
<link rel="dns-prefetch" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600"
	rel="stylesheet" type="text/css">



<link rel="icon" href="Favicon.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<main class="my-form">
		<div class="cotainer">
			<div class="row justify-content-center">
				<div class="col-md-8">
					<div class="card">
						<div class="card-header">View My Results</div>
						<div class="card-body">
							<form name="my-form" onsubmit="return validform()"
								action="eachResult.jsp" method="post">
								<div class="form-group row">
									<label for="full_name"
										class="col-md-4 col-form-label text-md-right">Name</label>
									<div class="col-md-6">
										<input type="text" class="form-control" name="name">
									</div>
								</div>
								<div class="form-group row">
									<label for="full_name"
										class="col-md-4 col-form-label text-md-right">Roll No</label>
									<div class="col-md-6">
										<input type="text" class="form-control" name="rollNo">
									</div>
								</div>


								<div class="col-md-6 offset-md-4">
									<button type="submit" class="btn btn-primary">Save</button>
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
		</div>
		<!-- 2rd part -->

		<div id="Paris" class="w3-container city" style="display: none">
			<br>
			<link
				href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
				rel="stylesheet" id="bootstrap-css">
			<script
				src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
			<script
				src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
			<!------ Include the above in your HEAD tag ---------->

			<!doctype html>
			<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Fonts -->
<link rel="dns-prefetch" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600"
	rel="stylesheet" type="text/css">



<link rel="icon" href="Favicon.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>
	<main class="my-form">
		<div class="cotainer">
			<div class="row justify-content-center">
				<div class="col-md-8">
					<div class="card">
						<div class="card-header">Change Password</div>
						<div class="card-body">
							<form name="my-form" onsubmit="return validform()"
								action="changePassword.jsp" method="">
								<div class="form-group row">
									<label for="full_name"
										class="col-md-4 col-form-label text-md-right">RollNo</label>
									<div class="col-md-6">
										<input type="text" class="form-control" name="rollNo">
									</div>
								</div>
								<div class="form-group row">
									<label for="full_name"
										class="col-md-4 col-form-label text-md-right">Current
										Password</label>
									<div class="col-md-6">
										<input type="password" class="form-control" name="currPass">
									</div>
								</div>

								<div class="form-group row">
									<label for="full_name"
										class="col-md-4 col-form-label text-md-right">New
										Password</label>
									<div class="col-md-6">
										<input type="password" class="form-control" name="newPass">
									</div>
								</div>



								<div class="col-md-6 offset-md-4">
									<button type="submit" class="btn btn-primary">Save</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<br>
		</div>

	</main>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
			</html>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<center>
			<h5>Happy Coding!!</h5>
		</center>
</body>
</html>














