<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"> 
<jsp:directive.page contentType="text/html" />
<h1>Hello</h1>
<jsp:scriptlet>
//you should use i&lt;5
for(int i=0; i<5; i++) 
{ 
	out.println("World"); 
} 
</jsp:scriptlet> 
<jsp:text>!!!</jsp:text> 
</jsp:root>