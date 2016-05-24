<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title><tiles:insertAttribute name="title" ignore="true" /></title>  

    <!-- Bootstrap core CSS -->
    <link href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    
</head>  
<body>  
        <div><tiles:insertAttribute name="header" /></div>  
        <div><tiles:insertAttribute name="body" /></div>  
        <div style="clear:both"><tiles:insertAttribute name="footer" /></div>  
        
		<!-- Bootstrap core JavaScript
		================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="webjars/jquery/2.1.4/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
</body>  
</html>  