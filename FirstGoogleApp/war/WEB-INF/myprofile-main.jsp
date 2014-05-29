<%@ page import="java.util.ArrayList, java.util.*, java.io.*" %>
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
					<div class="col-md-3">
						<a href="#" class="thumbnail" style="max-width: 313px"> <img src="/img/userDefault.png">
						</a>
						<form action="/storeImage" method="get">
							URL: <input type="text" name="url">
							<input type="text" name="title" value="${email}profilePicture" hidden="true">
							<input type="submit" value="Submit">
						</form>
					</div>
					<div class="col-md-9">
						<ul id="tabs" class="nav nav-tabs">
							<li class="active"><a href="#profile" data-toggle="tab">Profile</a></li>
							<li><a href="#myNetwork" data-toggle="tab" onclick="validateFriends(${user.numFriends}, '${user.friends}')">My Network</a></li>
							<li><a href="#gallery" data-toggle="tab">Gallery</a></li>
							<li><a href="#calendar" data-toggle="tab">Calendar</a></li>
						</ul>
						<h3>${user.name}</h3>
						${image}
					</div>
				</div>
				<div class="tab-content"> <!-- tab-content -->
					<div class="row tab-pane active fade in" id="profile"> <!-- profile tab -->
						<jsp:useBean id="user" class="com.firstgoogleapp.User" scope="session" />
						<div class="col-md-6">
							<div class="well">
								<h3>
									Skill Set <span style="font-size: small"><a href="#">Edit</a></span>
								</h3>
								<ul>
									<li>${user.skillSet}</li>
								</ul>
							</div>
							<div class="well">
								<h3>
									Work Experience <span style="font-size: small"><a
										href="#">Edit</a></span>
								</h3>
								<ul>
									<li>${user.workExperience}</li>
								</ul>
							</div>
							<div class="well">
								<h3>
									Education <span style="font-size: small"><a href="#">Edit</a></span>
								</h3>
								<ul>
									<li>${user.education}</li>
								</ul>
							</div>
	
	
						</div>
						<div class="col-md-6">
							<div class="well">
								<h3>
									About Me 
									<span>
										<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#aboutMeModal">Edit</button>
									</span>
								</h3>
								<p id="aboutMeText">${user.aboutMe}</p>
							</div>
							<div class="well">
								<h3>
									Hobbies 
									<span>
										<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#hobbiesModal">Edit</button>
									</span>
								</h3>
								<p id="hobbiesText">${user.hobbies}</p>
							</div>
							<div class="well">
								<h3>
									Interests 
									<span>
										<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#interestsModal">Edit</button>
									</span>
								</h3>
								<p id="interestsText">${user.interests}</p>
							</div>
						</div>
					</div> <!-- /profile tab -->
					<div class="tab-pane fade" id="myNetwork"> <!-- my network tab -->
						<ul id="networkTabs" class="nav nav-tabs">
							<li class="active"><a href="#name" data-toggle="tab">Name</a></li>
							<li><a href="#profession" data-toggle="tab">Profession</a></li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane fade in active" id="name">
							<div class="row" id="friendsList">
								
							</div>
							</div>
							<div class="tab-pane fade" id="profession">
								Profession
							</div>
						</div>
					</div> <!-- /my network tab -->
					<div class="tab-pane fade" id="gallery"> <!-- gallery tab -->
					
					</div> <!-- /gallery tab -->
					<div class="tab-pane fade" id="calendar"> <!-- calendar tab -->
						
					</div> <!-- /calendar tab -->
				</div> <!-- /tab-content -->
				
				
				<!-- About Me Modal -->
				<div class="modal fade" id="aboutMeModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				        <h4 class="modal-title" id="myModalLabel">About Me</h4>
				      </div>
				      <div class="modal-body">
				      <form id="modalFormAboutMe" name="modalFormAboutMe">
				      <input name="field" type="text" hidden="true" value="aboutMe">
				      </form>
				        <textarea id="modalTextAboutMe" name="modalTextAboutMe" form="modalFormAboutMe" style="width:100%; height:200px">${user.aboutMe}</textarea>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        <button type="button" class="btn btn-primary" onclick="saveModal('aboutMeText')" data-dismiss="modal">Save changes</button>
				      </div>
				    </div>
				  </div>
				</div>
				
				<!-- Hobbies Modal -->
				<div class="modal fade" id="hobbiesModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				        <h4 class="modal-title" id="myModalLabel">Hobbies</h4>
				      </div>
				      <div class="modal-body">
				      <form id="modalFormHobbies" name="modalFormHobbies">
				      <input name="field" type="text" hidden="true" value="hobbies">
				      </form>
				        <textarea id="modalTextHobbies" name="modalTextHobbies" form="modalFormHobbies" style="width:100%; height:200px">${user.hobbies}</textarea>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        <button type="button" class="btn btn-primary" onclick="saveModal('hobbiesText')" data-dismiss="modal">Save changes</button>
				      </div>
				    </div>
				  </div>
				</div>
				
				<!-- Interests Modal -->
				<div class="modal fade" id="interestsModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				        <h4 class="modal-title" id="myModalLabel">Interests</h4>
				      </div>
				      <div class="modal-body">
				      <form id="modalFormInterests" name="modalFormInterests">
				      <input name="field" type="text" hidden="true" value="interests">
				      </form>
				        <textarea id="modalTextInterests" name="modalTextInterests" form="modalFormInterests" style="width:100%; height:200px">${user.interests}</textarea>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        <button type="button" class="btn btn-primary" onclick="saveModal('interestsText')" data-dismiss="modal">Save changes</button>
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
</body>
</html>
