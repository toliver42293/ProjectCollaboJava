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
<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<link rel="stylesheet" href="css/main.css">
<script src="js/main.js"></script>
<style>
body {
	padding-top: 50px;
	padding-bottom: 20px;
}
</style>
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
					<div class="col-md-12">
						<ul id="tabs" class="nav nav-tabs">
							<li class="active"><a href="#overview" data-toggle="tab">Overview</a></li>
							<li><a href="#schedule" data-toggle="tab">Schedule</a></li>
							<li><a href="#members" data-toggle="tab">Members</a></li>
							<li><a href="#forums" data-toggle="tab">Forums</a></li>
							<li><a href="#files" data-toggle="tab">Files</a></li>
							<li><a href="#funding" data-toggle="tab">Funding</a></li>
							<li><a href="#development" data-toggle="tab">Development</a></li>
							<li><a href="#adminPanel" data-toggle="tab">Admin Panel</a></li>
							<li><a href="#updates" data-toggle="tab">Updates</a></li>
						</ul>
					</div>
				</div>
				
				<div class="tab-content"> <!-- tab-content -->
					<div class="row tab-pane active fade in" id="overview"> <!-- overview tab -->
						<div class="row">
							<div class="col-md-6">
								<a href="#" class="thumbnail" style="max-width: 313px"> <img
									src="/img/userDefault.png">
								</a>
							</div>
							<div class="col-md-6">
								<h1>Project Title</h1>
								<h4>Mission Statement:</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Nunc vitae hendrerit odio. Integer eget sagittis eros. Interdum
									et malesuada fames ac ante ipsum primis in faucibus.</p>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<h4>Description:</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Nunc vitae hendrerit odio. Integer eget sagittis eros. Interdum
									et malesuada fames ac ante ipsum primis in faucibus.
									Pellentesque dapibus lacinia cursus. Nunc imperdiet imperdiet
									est sed egestas. Nulla tincidunt auctor nibh, pellentesque
									gravida quam pharetra et. Nulla magna mauris, ultrices eget dui
									vitae, sollicitudin blandit lacus. Fusce hendrerit diam a
									libero ultricies, id iaculis augue egestas. Morbi convallis
									metus et dapibus ultrices. Nulla vel est sapien. Donec id nisi
									ac mauris scelerisque facilisis. Curabitur tempus pulvinar
									tortor eget volutpat. Aenean et adipiscing tellus. Cras eget
									sodales ligula. Cum sociis natoque penatibus et magnis dis
									parturient montes, nascetur ridiculus mus. Aliquam et pharetra
									enim. Fusce vulputate sem nec elit adipiscing mattis. Mauris eu
									purus a velit gravida faucibus. In id varius lectus, vel
									tincidunt purus. Sed imperdiet aliquam enim eget tempus.
									Integer egestas nisl sit amet urna hendrerit fringilla.</p>
							</div>
						</div>
					</div> <!-- /overview tab -->
					<div class="tab-pane fade" id="schedule"> <!-- schedule tab -->
						
					</div> <!-- /schedule tab -->
				</div> <!-- /tab-content -->
				
			</div>
		</div>

	</div>
	<!-- /container -->

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
</body>
</html>
