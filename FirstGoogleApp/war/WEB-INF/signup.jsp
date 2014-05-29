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
<link rel="stylesheet" href="css/bootstrapValidator.min.css">
<link rel="stylesheet" href="css/main.css">
<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/bootstrapValidator.min.js"></script>
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
				<a class="navbar-brand" href="home"
					style="letter-spacing: 2px">PROJECT COLLABO<img
					class="navbar-logo" src="img/logo.PNG" alt="" />
				</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Sign up</a></li>
					<li><a href="login">Log in</a></li>
				</ul>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</div>

	<div class="container-fluid">

		<div class="signup-form">
			<h2>Sign up</h2>
			<hr>
			<form class="form-horizontal bv-form" id="newform" name="newform" action="signup" method="post">
				<div class="form-group">
					<div class="col-sm-6">
                  		<input type="text" class="form-control" name="firstName" placeholder="First name" />
	              	</div>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="lastName" placeholder="Last name" />
                    </div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="email" class="form-control" name="email"
							placeholder="Email">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" class="form-control" name="password"
							placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" class="form-control" name="confirmPassword"
							placeholder="Re-enter password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-custom">
							<b>Sign up</b>
						</button>
					</div>
				</div>
			</form>
			<hr>
			<p>
				Have an account? <a style="color: #2E97FF" href="login"><b>Log
						in</b></a>
		</div>
		<hr>
		<footer>
			<p>&copy; ProjectCollabo 2014</p>
		</footer>
		
	</div>
	<!-- /container -->


	<script type="text/javascript">
	$(document).ready(function() {
	    $('#newform').bootstrapValidator({
	        message: 'This value is not valid',
	        feedbackIcons: {
	            valid: 'glyphicon glyphicon-ok',
	            invalid: 'glyphicon glyphicon-remove',
	            validating: 'glyphicon glyphicon-refresh'
	        },
	        fields: {
	            firstName: {
	                validators: {
	                    notEmpty: {
	                        message: 'The first name is required and cannot be empty'
	                    },
	                    regexp: {
	                    	regexp: /^[a-zA-Z]+$/,
	                    	message: 'Your name can only consist of alphabetical characters'
	                    }
	        			
	                }
	            },
	            lastName: {
	                validators: {
	                    notEmpty: {
	                        message: 'The last name is required and cannot be empty'
	                    },
	                    regexp: {
	                    	regexp: /^[a-zA-Z]+$/,
	                    	message: 'Your name can only consist of alphabetical characters'
	                    }
	                }
	            },
	            email: {
	                validators: {
	                    emailAddress: {
	                        message: 'The input is not a valid email address'
	                    },
	                    notEmpty: {
	                        message: 'Your email is required and cannot be empty'
	                    }
	                }
	            },
	            password: {
	                validators: {
	                    notEmpty: {
	                        message: 'The password is required and cannot be empty'
	                    },
	                    different: {
	                        field: 'email',
	                        message: 'The password cannot be the same as your email'
	                    },
	                    stringLength: {
	                    	min: 6,
	                    	max: 20,
	                    	message: 'The password must be between 6-20 characters long'
	                    },
	                    identical: {
	                    	field: 'confirmPassword',
	                    	message: 'The passwords do not match'
	                    }
	                }
	            },
	            confirmPassword: {
	                validators: {
	                    identical: {
	                        field: 'password',
	                        message: 'The passwords do not match'
	                    }
	                }
	            }
	        }
	    });
	});
	</script>


</body>
</html>
