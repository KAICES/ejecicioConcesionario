<%-- 
    Document   : index
    Created on : 5/03/2018, 11:25:09 AM
    Author     : cesar.ramirez
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simulador</title>
    </head>
    <style>
        #web{
            width: 100%;
        }
        #formulario{
            width: 80%;

        }
    </style>
    <body id="web">
    <CENTER>

        <div id="formulario">  

            <form action="ServletConcesionario" method="POST">
                <fieldset>  
                    <legend> <h3>SIMULADOR CUOTAS VEHICULO</h3></legend>
                    Nombre:<br>
                    <input type ="text" name="nombre"></input><br>
                    <br>
                  	Vehículo: <br> 
                    <select name="marca" >
                        <option >Seleccione Vehiculo...</option>
                        <option value="1">Mercedes-Benz / C350 </option>
                        <option value="2">Audi / A4</option>
                        <option value="3">VolksWagen / Jetta GT </option>
                        <option value="4">Renault / Sandero </option>
                        <option value="5">Chevrolet / Sail </option><br>  
                    </select> <br><br>

                    Valor cuota Inicial($):<br>
                    <input type ="text" name="cuotaInicial"></input><br><br>

                    Numero Cuotas:<br>
                    <input type ="text" name="cuotas" ></input><br><br>

                    <input type="submit" value="Calcular" />
                </fieldset>
            </form>

        </div>
    </CENTER>
</body>
</html>
