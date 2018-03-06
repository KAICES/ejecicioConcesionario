/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.aqrSw.ejercicioServlets.tallerTres.servlets;

import co.edu.uniminuto.aqrSw.ejercicioServlets.tallerTres.vos.FormularioPersonaVo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @autores
 * Cesar Ramirez == 378938
 * Lizeth Castro == 310894
 */
public class ServletConcesionario extends HttpServlet {
    
    private FormularioPersonaVo miForm;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
        Long valorAuto = Long.parseLong(miForm.getValor());        
        Long saldoInicial = valorAuto - miForm.getCoutaInicial();        
        Long vlrCuota =  saldoInicial / miForm.getCoutas() ;
        Long saldoAct =  vlrCuota * miForm.getCoutas() ;
        Long saldos = saldoAct - vlrCuota;
        
        Long creditoCar[][] = new Long[miForm.getCoutas()+1][3]; 
        
        Integer i = new Integer(0);
        
        for (  i= 0 ; i < creditoCar.length; i++ ){
                     
                    long k = i.longValue();            
                    creditoCar[i][0]= k +1 ;               
                     
                    if ( i == 0){
                         saldos = saldoInicial;                        
                         creditoCar[i][1] = valorAuto; 
                         creditoCar[i][2] = creditoCar[i][1] - miForm.getCoutaInicial();
                    }
                     
                    else{                        
                         creditoCar[i][1] = creditoCar[i-1][2];  
                         creditoCar[i][2]= creditoCar[i][1] - vlrCuota ;
                    }       
        }
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletConcesionario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<style>");
            out.println("#web{");
            out.println("width: 100%;");
            out.println("}");
            out.println("#formulario{");
            out.println("width: 80%;");
            out.println("}");
            out.println("</style>");
            out.println("<body id='web'>");
            out.println("<CENTER>");
            out.println("<div id='formulario'> "); 
            out.println("<form action='ServletConcesionario' method='POST'>");
            out.println("<fieldset> "); 
            out.println("<legend> <h3>SIMULADOR CUOTAS VEHICULO</h3></legend>");
            out.println("Nombre:<br>");
            out.println("<input type ='text' name='nombre'></input><br>");
            out.println("<br>");
            out.println("Vehículo: <br> ");
            out.println("<select name='marca' >");
            out.println("<option >Seleccione Vehiculo...</option>");
            out.println("<option value='1'>Mercedes-Benz / C350 </option>");
            out.println("<option value='2'>Audi / A4</option>");
            out.println("<option value='3'>VolksWagen / Jetta GT </option>");
            out.println("<option value='4'>Renault / Sandero </option>");
            out.println("<option value='5'>Chevrolet / Sail </option><br>  ");
            out.println("</select> <br><br>");
            out.println("Valor cuota Inicial($):<br>");
            out.println("<input type ='text' name='cuotaInicial'></input><br><br>");
            out.println("Numero Cuotas:<br>");
            out.println("<input type ='text' name='cuotas' ></input><br><br>");
            out.println("<input type='submit' value='Calcular'/>");
            out.println("</fieldset>");
            out.println("</form>");
            out.println("</div>");
            out.println("</CENTER>");
            out.println("<br>");
            out.println("<h1>Hola Sr(a) " + miForm.getNombre() + " estos serian los valores por la compra del automovil</h1><br><br>");   
            out.println("<TABLE BORDER>");
            out.println("<TR>");
            out.println("<TD>Cuotas</TD> <TD>Valor</TD> <TD>Saldo</TD>");
            out.println("</TR>");                   
            for(int k=0;k<creditoCar.length;k++) {

                if ( k > 0 ) {
                       out.println("<TR>");
                       out.println("<TD>" + creditoCar[k][0] + "</TD> <TD>$ "+ creditoCar[1][1] + "</TD> <TD>$ "+ creditoCar[k][2] + "</TD>");
                       out.println("</TR>");
                }else{
                       out.println("<TR>");
                       out.println("<TD>" + creditoCar[k][0] + "</TD> <TD>$ "+ creditoCar[k][1] + "</TD> <TD>$ "+ creditoCar[k][2] + "</TD>");
                       out.println("</TR>");

                }

            }
            
            out.println("</TR>");
            out.println("</TABLE>");        
            out.println("</body>");
            out.println("</html>");
        } finally {
            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String nombre = request.getParameter("nombre");
            int marca = Integer.parseInt(request.getParameter("marca"));
            int coutas = Integer.parseInt(request.getParameter("cuotas"));
            Long coutaInicial = Long.parseLong(request.getParameter("cuotaInicial"));   
       
             String valor ;
            
            
            
            switch (marca) {

            case 1:
                    
                valor = "250000000";   
               
                break;
			
            case 2:

                valor = "150000000";   
               
                break;
			
            case 3:

                valor = "60000000";   
               
                break;
            
            case 4:

                valor = "30000000";   
               
                break;
                
            case 5:

                valor = "25000000";   
               
                break;    
                    
            default:

               valor = "0" ;

               break;    

            }           
            
            
        
        miForm = new FormularioPersonaVo (nombre, marca, coutas, coutaInicial , valor );    
            
        processRequest(request, response);  
    
    
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
