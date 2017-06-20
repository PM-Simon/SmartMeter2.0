<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Smart Meter</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="main">
		<a href="Übersicht,jsp" class="glyphicon glyphicon-triangle-left">
			Zurück</a>
		<h1>Detailansicht</h1>
		<br>

		<!-- Image of the smartMeter -->
		<img id="smartMeterPic" src="img/smartMeter.jpg"></img>

		<!-- Info Box with the dates -->
		<div id="info">
			<h4>Gerätekennung</h4>
			<input type="text" class="form-control" readonly="readonly"
				value="DE 02469237"> <br>
			<h4>Zulässige maximale Belastung</h4>
			<input type="text" class="form-control" readonly="readonly"
				value="70"> <br>
			<h4>Spannung</h4>
			
			<br>
			<h4>Stromstärke</h4>

			

		</div>

		<!-- table to list user input -->
		<div id="ablesen">
			<table class="table table-striped" id="tabelle">
				<thead>
					<tr>
						<th>Nutzerkennung</th>
						<th>Verbrauchswert (kWh)</th>
						<th>Time</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>

			<!-- form for user input -->
			<form id="formID" action="" onsubmit="return submitEintrag();"
				method="POST">
				Nutzerkennung <input type="text" class="form-control"
					id="Nuterkennung"><br> Verbrauchswert <input
					type="text" class="form-control" id="verbrauchswert"><br>
				<br> <input type="button" class="btn btn-success"
					onclick="submitEintrag()" value="Absenden">
			</form>
		</div>
	</div>


</body>
</html>