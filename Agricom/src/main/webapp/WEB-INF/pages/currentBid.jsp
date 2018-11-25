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
	



	<form action="submitBid">
		<input type="number" name="bidAmount"><br>
		<input type="submit" value="Bid">
	</form>

</body>
</html>