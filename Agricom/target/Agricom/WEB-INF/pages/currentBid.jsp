<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<title>Current Bid</title>

	<!-- <script type="text/javascript">
		
		
		function fetchData(){
    $(".data-contacts-js tbody").empty(); // this will remove all <tr>.
$.get("getLatestBiddingDetails", function(data) {
                        $.each(data, function(i, contact) {
                            $(".data-contacts-js").append(
                                "<tr><td>" + contact.custId + "</td>" +
                                "<td>" + contact.custName + "</td>" +
                                "<td>" + contact.custMobile + "</td>" +
                                "<td>" + contact.custEmail + "</td>" +
                                "<td>" + contact.custAddress + "</td>" +
                                "<td>" + contact.Date + "</td>" +
                                "<td>" + contact.Time + "</td></tr>"
                                );
                        });
                    });
}
	</script> -->

</head>
<body>
	<div id="row" style="display:flex; justify-content:center; align-items:center; width:550px;">
	<div class="col-md-12">
		<form action="placeBid">
			<input type="submit" value="Reload"><br><br>
		</form>
	</div>
	</div>



	<form action="submitBid/{bidAmount}">
		<input type="number" name="bidAmount"><br>
		<input type="submit" value="Bid">
	</form>

</body>
</html>