<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<title>AGRICOM</title>
<meta name="viewport" content="width=device-width, initial-scale=1">	
<script type="application/x-javascript"> 
addEventListener("load", function() 
{ setTimeout(hideURLbar, 0); }, false); 
function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<script src="js/jquery-1.11.0.min.js"></script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Arimo:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
</head>
<body>
	<!--start-header-->
			<div id="home" class="header">
					<div class="top-header">
						<div class="container">
							<div class="logo">
								<a href="index.html"><img src="images/logo.png" alt=""></a>  
							</div>
							<!--start-top-nav-->
							 <div class="top-nav">
								<ul>
								<li class="active"><a class="play-icon popup-with-zoom-anim" href="#small-dialog">Log in</a></li>
								<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog1">Sign up</a></li>	
								</ul>
							</div>
							
<div class="clearfix"> </div>
							
						</div>
				</div>
			<!---pop-up-box---->
					  <script type="text/javascript" src="js/modernizr.custom.min.js"></script>    
					<link href="css/popup-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!---//pop-up-box---->
				<div id="small-dialog" class="mfp-hide">
						<div class="login">
							<h3>Log In</h3>
							<h4>Already a Member</h4>
							<input type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" />
							<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"/>
							<input type="submit" value="Login" />
						</div>
					</div>
					<div id="small-dialog1" class="mfp-hide">
						<div class="signup">
							<h3>Sign Up</h3>
							<!--<h4>Enter Your Details Here</h4>
							<input type="text" value="First Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'First Name';}" />
							<input type="text" value="Second Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Second Name';}" />
							<input type="text" class="email"value="Enter Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Email';}"  />
							<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"/>
							<input type="submit"  value="SignUp"/>-->
							<form class="form" method="post" action="farmerReg">
								<button type="submit" class="btn btn-primary btn-block">Farmer</button><br>
							</form>
							<form class="form" method="post" action="traderReg">
								<button type="submit" class="btn btn-primary btn-block">Trader</button>
							</form>
						</div>
					</div>	
				 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>					
		<!--End-header-->
		<div class="navgation">
					<div class="menu">
                         <a class="toggleMenu" href="#"><img src="images/menu-icon.png" alt="" /> </a>
							<ul class="nav" id="nav">
							<li><a href="index.html">Home</a></li>
							<li><a href="about.html">About Us</a></li>
							
						
							<li><a href="contact.html">Contact</a></li>
							
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
					
					<div class="clearfix"> </div>
		</div>
	</div>
		<div class="container card form_container" style="display: flex; justify-content: center; align-items: center;">
			<form class="form" action="submitFarmer" method=post style="padding-top:40px;">
			  <div class="form-row" style="width:550px">
				<h4>Enter Details</h4>
			  	<div class="form-group col-md-12">
			    	<br><label for="name">Name</label>
			    	<input type="text" class="form-control" name="inputName" placeholder="Enter your name" required>
			  	</div>
			    <div class="form-group col-md-12">
			      <label for="inputEmail4">Email</label>
			      <input type="email" class="form-control" name="inputEmail" placeholder="example@example.com" required>
			    </div>
			    <div class="form-group col-md-12">
			      <label for="inputMobile">Mobile</label>
			      <input type="tel" class="form-control" name="inputMobile" placeholder="XXXXXXXXXX" required>
			    </div>
			    <div class="form-group col-md-12">
			      <label for="inputPassword4">Password</label>
			      <input type="password" class="form-control" name="inputPassword" placeholder="Password" required>
			    </div>
			    <div class="form-group col-md-12">
			      <label for="inputPassword4">Confirm Password</label>
			      <input type="password" class="form-control" name="inputPassword" placeholder="Password" required><br>
			    </div>
			    <h4>Address Details</h4>
			    <div class="form-group col-md-12">
			    <label for="inputAddress">Address</label>
			    <input type="text" class="form-control" name="inputAddress" placeholder="1234 Main St" >
			    </div>
			  </div>

			  <div class="form-row" style="width:550px;">
			    <div class="form-group col-md-5">
			      <label for="inputCity">City</label>
			      <input type="text" class="form-control" name="inputCity" placeholder="City" >
			    </div>			    
			    <div class="form-group col-md-5">
			      <label for="inputState">State</label>
			      <select name="inputState" class="form-control">
			        <option selected>State</option>
			        <option>Maharashtra</option>
			        <option>Tamil Nadu</option>
			        <option>Karnataka</option>
			      </select>
			    </div>
			    <div class="form-group col-md-2">
			      <label for="inputZip">Zip</label>
			      <input type="text" class="form-control" name="inputZip">
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputArea">Area</label>
			    <input type="text" class="form-control" name="inputArea" placeholder="Area in hectares" >
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputAddress">Address</label>
			    <input type="text" class="form-control" name="inputLAddress" placeholder="Address" >
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputZip">Zip</label>
			    <input type="text" class="form-control" name="inputLZip">
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputAccNo">Account No.</label>
			    <input type="text" class="form-control" name="inputAccNo" placeholder="XXXXXXXXXXXX" >
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputIFSC">IFSC Code</label>
			    <input type="text" class="form-control" name="inputIFSC" placeholder="XXXXXXXXXXX" >
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputAadhaar">Aadhaar</label>
			    <input type="file" class="form-control" name="inputAadhaar" accept="application/pdf" placeholder="XXXXXXXXXXXX" >
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputPAN">PAN</label>
			    <input type="file" class="form-control" name="inputPAN" accept="application/pdf" placeholder="XXXXXXXXXXXX" >
			    </div>
			    <div class="form-group col-md-12">
			    <label for="inputCertificate">Certificate</label>
			    <input type="file" class="form-control" name="inputCertificate" accept="application/pdf" placeholder="XXXXXXXXXXXX" ><br>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="form-check">
			      <p>Already a user? Skip to <a class="login_ref" href="login.html" id="checkuser">Login</a></p>
			      
			      <!-- <label class="form-check-label" for="gridCheck">
			        Check me out
			      </label> -->
			    </div>
			  </div>
			  <button type="submit" class="btn btn-primary">Sign in</button>
			</form>	
		</div>
</body>
</html>