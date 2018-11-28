<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</script>
<script src="js/jquery-1.11.0.min.js"></script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/css.css" rel='stylesheet' type='text/css' />
<link
	href='http://fonts.googleapis.com/css?family=Arimo:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<!-- jquery script -->
<script>
$(document).ready(function(){               
    $("#b").click(function(){
        $(".cont").show();
    });
});
</script>
</head>
<body>
	<div id="home" class="header">
		<div class="top-header">
			<div class="container">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>
				</div>
				<!--start-top-nav-->
				<div class="top-nav">
					<ul>
						<li class="active"><a class="play-icon popup-with-zoom-anim"
							href="#small-dialog">Logout</a></li>
						<!-- <li><a class="play-icon popup-with-zoom-anim" href="#small-dialog1">Sign up</a></li> -->
					</ul>
				</div>

				<div class="clearfix"></div>

			</div>
		</div>
		<!---pop-up-box---->
		<script type="text/javascript" src="js/modernizr.custom.min.js"></script>
		<link href="css/popup-box.css" rel="stylesheet" type="text/css"
			media="all" />
		<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
		<!---//pop-up-box---->
		<div id="small-dialog" class="mfp-hide">
			<div class="login">
				<h3>Log In</h3>
				<h4>Already a Member</h4>
				<input type="text" value="Email" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Email';}" /> <input
					type="password" value="Password" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Password';}" /> <input
					type="submit" value="Login" />
			</div>
		</div>

		<div class="navgation">
			<div class="menu">
				<a class="toggleMenu" href="#"><img src="images/menu-icon.png"
					alt="" /> </a>
				<ul class="navbar-nav" id="nav">
					<li class="nav-item active">Profile</li>
					<li calss="nav-item active">Bidding</li>
				</ul>

				<!----start-top-nav-script---->
				<script type="text/javascript" src="js/responsive-nav.js"></script>
				<script type="text/javascript">
							jQuery(document).ready(function($) {
								$(".scroll").click(function(event){		
									event.preventDefault();
									$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
								});
							});
							</script>
				<!----//End-top-nav-script---->
			</div>

			<div class="clearfix"></div>
		</div>
	</div>
	<div class="row">
	<div style="display:flex; justify-content:center;align-items:center;">
	<pre>
	
	
		<h4>${crop.getcName() } was sold with the highest bid at Rs.
		${crop.getcSellPrice() }</h4>
	</pre>
	</div>
	</div>
</body>
</html>