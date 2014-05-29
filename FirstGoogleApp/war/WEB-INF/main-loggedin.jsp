<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title></title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<style>
body {
	padding-top: 50px;
	padding-bottom: 20px;
}
</style>
<link rel="stylesheet" href="css/main.css">

<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
	<!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/home" style="letter-spacing: 2px">PROJECT
					COLLABO<img class="navbar-logo" src="img/logo.PNG" alt="" />
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li id="menu-toggle"><a href="/home">Home</a></li>
					<li id="menu-toggle"><a href="/profile">My Profile</a></li>
					<li id="menu-toggle"><a href="/project">Projects</a></li>
					<li id="menu-toggle"><a href="#">Stories</a></li>
					<li id="menu-toggle"><a href="#">Forums</a></li>
					<li id="menu-toggle"><a href="#">Events</a></li>
					<li><a href="logout">Log out</a></li>
				</ul>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</div>

	<div id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li><a href="/home">Home</a></li>
				<li><a href="/profile">My Profile</a></li>
				<li><a href="/project">Projects</a></li>
				<li><a href="#">Stories</a></li>
				<li><a href="#">Forums</a></li>
				<li><a href="#">Events</a></li>
			</ul>
		</div>

		<!-- Page content -->
		<div id="page-content-wrapper">

			<!-- Keep all page content within the page-content inset div! -->
			<div class="page-content inset">
				<div class="row">
					<div class="col-xs-4 col-sm-4 col-md-4">
						<div class="thumbnail">
							<img src="/img/event.png" alt="..." />
							<div class="caption" style="text-align: center">
								<p><a href="#">Create/Join an event</a></p>
							</div>
						</div>
					</div>
					<div class="col-xs-4 col-sm-4 col-md-4">
						<div class="thumbnail">
							<img src="/img/project.png" alt="..." />
							<div class="caption" style="text-align: center">
								<p><a href="/project">Create/Join a project</a></p>
							</div>
						</div>
					</div>
					<div class="col-xs-4 col-sm-4 col-md-4">
						<div class="thumbnail">
							<img src="/img/success.png" alt="..." />
							<div class="caption" style="text-align: center">
								<p><a href="#">Watch a success story</a></p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- /container -->


	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.js"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>
