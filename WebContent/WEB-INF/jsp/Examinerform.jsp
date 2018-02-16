<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Examiner Form</title>
</head>
<body>
		<h1>Add New Employee</h1>  
       <form method="post" action="/IntermediateResults/Save">    
        <table >    
         <tr>    
          <td>Hall Ticket No : </td>   
          <td><input type = "text" name = "hallTicketNo" placeholder ="Enter Hall Ticket Number" required /></td>  
         </tr>    
         <tr>    
          <td>First Name :</td>    
          <td><input type = "text" name = "firstName"/></td>  
         </tr>   
         <tr>    
          <td>Last Name :</td>    
          <td><input type = "text" name = "lastName" /></td>  
         </tr> 
         <tr>    
          <td>Full Name :</td>    
          <td><input type = "text" name = "fullName" /></td>  
         </tr> 
         <tr>    
          <td>Maths :</td>    
          <td><input type = "text" name = "maths" /></td>  
         </tr> 
         <tr>    
          <td>Physics :</td>    
          <td><input type = "text" name = "physics" /></td>  
         </tr> 
         <tr>    
          <td>Chemistry:</td>    
          <td><input type = "text" name = "chemistry" /></td>  
         </tr> 
         <tr>    
          <td>Total :</td>    
          <td><input type = "text" name = "lastName" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form>    

</body>
</html>