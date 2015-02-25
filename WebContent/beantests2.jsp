<html>
    
<body>
	    
	<h1>Simple Bean Usage</h1>
	
	<%  pageContext.setAttribute("account", new jsp.tests.Account(1, "Bobby", 1000.0)); %>
	
		Account Name is :     
		<jsp:useBean id="account" class="jsp.tests.Account">
		</jsp:useBean>            
			<jsp:setProperty
				name="account" property="name" param="name" />     
	<%=account.getName()%>
	    
</body>
</html>