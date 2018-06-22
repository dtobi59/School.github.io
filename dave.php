<!DOCTYPE html>
<html lang="{{ app()->getLocale() }}">
<?php date_default_timezone_set("Africa/Dakar"); ?>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>David in HNG</title>
	<link rel="stylesheet" href="bootstrap.css">
	<style>
		body {
			background: #ebebeb;
		}
		.navbar-default {
            background-color: #FB2E2E;
			border: none;
			border-radius: 0;
		}
		.navbar {
			margin-bottom: 0;
			padding-bottom: 10px 0
		}
		.navbar a{
			font-size: 30px;
			
			display: block;
		
		}
		.navbar-default .navbar-brand {color: #ffffff;}
		.navbar .wrapper {
			padding-top: 10px;
			padding-bottom: 10px;
			
		}
		.btn-primary {
    color: #ff2828;
    background-color: #fff;
    border-color: #f35521;
    font-size: 20px;
    padding-left: 50px;
    padding-right: 50px;
    float: right;
}
		.hero {
			background-image: url('dave.png');
background-repeat: no-repeat;
background-size: cover;
background-position: 11% 43%;
		}
		.hero .wrapper{
			padding: 200px 128px;
		}
		.hero h1{
			
            text-align: center;
            font-size: 80px;
		}
		.hero h3{
			color: #ffffff;
			text-align: center;
		}
		.overlay {
			background: rgba(255, 0, 0, 0.37);
		}
		
		h1 {
			color: #ffffff;
		}
		.time{
			text-align: center;
			background: #ffffff;
			
		}
		.time h1{
			color: #FB2E2E;
			font-size: 100px;
		}
		.time small{
			font-size: 40px;
			color: RGBA(249, 30, 30, 0.49);
		}
		.time .wrapper{
			padding: 55px 70px;
		}
		.footer{
			text-align: center;
			background: #FB2E2E;
		}
		.footer .wrapper{
			padding: 100px 80px;
		}
		.footer h1{
			font-size: 75px;
			color: #ffffff;
		}
	</style>
</head>

<body>
	
		<nav class="navbar navbar-default">
		<div class="wrapper">
			<div class="container">
				<div class="row">
					<div class="col-md-8"> <a class="navbar-brand" href="#">
       DAVID OLA
      </a> </div>
					<div class="col-md-4">
						<div class="btn btn-primary">Contact Me</div>
					</div>
				</div>
			</div>
			</div>
		</nav>
		<div class="hero">
			<div class="overlay">
			     <div class="wrapper">
				<div class="container">
					<h1>I am David Olaboye</h1>
					  <h3>I am A Web Developer From Nigeria</h3> </div>
			</div>
			</div>
		</div>
		<div class="time">
			<div class="container">
			   <div class="wrapper">
				<h1>
			<?php echo date('h:sa') ?>
		</h1> <small>
			<?php echo date('Y,M d') ?>
		</small> </div>
		</div>
		</div>
		<div class="footer">
		
			<div class="container">
			    <div class="wrapper">
				<h1>Big Thanks To GOD</h1> <img src="icon.png" alt="thanks-icon"> 
				<p>Designed By David Olaboye</p></div></div>
		</div>
</body>