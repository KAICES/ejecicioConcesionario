<%-- 
    Document   : index
    Created on : 5/03/2018, 11:25:09 AM
    Author     : cesar.ramirez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Taller</title>
    </head>
    <body>
        <h1>TALLER SERVLET</h1>
        <form action="ServletConcesionario" method="POST">
            Nombre:<br>
            <input type ="text" name="nombre"></input><br>
            <br>
            Marca/Modelo<br><br>
            <select name="marca" >
            	<option >Seleccione Marca/Modelo</option>
                <option value="1">Mercedes-Benz / C350 </option>
                <option value="2">Audi / A4</option>
                <option value="3">VolksWagen / Jetta GT </option>
                <option value="4">Renault / Sandero </option>
                <option value="5">Chevrolet / Sail </option><br>           
            </select> <br><br>
            Numero de cuotas: <br><br>
            <input type ="text" name="cuotas" ></input><br><br>
            Couta inicial: <br><br>
            $<input type ="text" name="cuotaInicial" ></input>
            <br>            
            <br>
            <input type="submit" />            
        </form>
    </body>
</html>
