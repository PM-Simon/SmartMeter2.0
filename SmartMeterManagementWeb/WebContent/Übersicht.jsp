<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.*,de.tub.as.smm.models.SmartMeter"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartMeter Übersicht</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/Übersicht.css">


</head>

<body>
	<button>SmartMeter hinzufügen</button>
	<div id="main">
		<h1>Gesamtübersicht</h1>
		<div>
			<a href="DE_02469237.html"> <img src="img/smartMeter.jpg">
				<h4>Kennung:DE 02469237</h4>
			</a>
		</div>
		<div>
			<a href="CC_29748571.html"> <img src="img/smartMeter.jpg" />
				<h4>Kennung: CC 29748571</h4>
			</a>
		</div>
		<%
			@SuppressWarnings("unchecked")
			List<SmartMeter> smList = (List<SmartMeter>) request.getAttribute("kennung");
			if (smList != null) {
				for (SmartMeter sm : smList) {
		%>
		<a href="<%=sm.getKennung()%>"> <img src="img/smartMeter.jpg">
			<h4><%=sm%></h4>
		</a>
		<%
			}
			}
		%>

	</div>

	<div class="container">


		<button id="addSM" type="button" class="btn btn-info" data-toggle="modal"
			data-target="#myModal">Smart Meter hinzufügen</button>


		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog ">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">SmartMeter hinzufügen</h4>
					</div>
					<div class="modal-body">
						<form action="submit">
							<ul>
								<!--  Kennung  -->
								<li><label for="kennung" class="col-sm-8">Kennung</label>
									<div class="col-sm-4">
										<input id="kennung" placeholder="AA 11111111" />
									</div></li>
								<!--  Zulässige Maximale Belastung  -->
								<li><label for="maxBelastung" class="col-sm-8">Belastung</label>
									<div class="col-sm-4">
										<input id="maxBelastung" placeholder="50-100" />
									</div></li>
							
						</form>

					</div>
					<div class="modal-footer">
					<div>
						<button type="button" class="btn btn-default col-sm-4" >Abbrechen</button>
						<button type="submit" class="btn btn-default col-sm-4">Hinzufügen</button>
					</div>
					</div>
				</ul>	
				</div>

			</div>
		</div>

	</div>




</body>
</html>