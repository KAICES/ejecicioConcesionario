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
 * @author cesar.ramirez
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
        
        
        float saldoInicial;
        float vlrCuota;
        float saldoAct;
        float saldos;
        
        saldoInicial = miForm.getValor() - miForm.getCoutaInicial();        
        vlrCuota =  saldoInicial / miForm.getCoutas() ;
        saldoAct =  vlrCuota * miForm.getCoutas() ;
        saldos = saldoAct - vlrCuota;
        
        
        
        float creditoCar[][] = new float[miForm.getCoutas()+1][3]; 
        
        
        for ( int i= 0 ; i < creditoCar.length; i++ ){
                     
                     creditoCar[i][0]= i +1 ; 
                     
                     
                     if ( i == 0){
                         saldos = saldoInicial;                        
                         creditoCar[i][1] = miForm.getValor(); 
                         creditoCar[i][2] = creditoCar[i][1] - miForm.getCoutaInicial();
                     }
                     
                     else{                        
                         creditoCar[i][1] = creditoCar[i-1][2];  
                         creditoCar[i][2]= creditoCar[i][1] - vlrCuota ;
                     }                                 
                     
             
        }
        
//        String escribirCar[][] = new String[miForm.getCoutas()+1][3];
//        
//        
//        for ( int j= 0 ; j < escribirCar.length; j++ ){
//        
//                    escribirCar[j][0] =  String.valueOf(creditoCar[j][0]);
//                    escribirCar[j][1] =  String.valueOf(creditoCar[j][1]);
//                    escribirCar[j][2] =  String.valueOf(creditoCar[j][2]);           
//            
//        }
        
        
        String Salida = "Elementos de la Matriz\n";
                 for(int k=0;k<creditoCar.length;k++) {
                    for(int l=0;l<creditoCar[l].length;l++)
                            Salida+= creditoCar[k][l]+" ";
                            Salida+="\n";
            }
  //      JOptionPane.showMessageDialog(null,Salida,"MATRIZ DE VALORES",JOptionPane.INFORMATION_MESSAGE);
        
        
     
    
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletConcesionario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletConcesionario at <br><br>" + Salida + "</h1>");
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
            float coutaInicial = Float.parseFloat(request.getParameter("cuotaInicial"));   
       
             float valor ;
            
            
            
            switch (marca) {

            case 1:
                    
                valor = 250000000;   
               
                break;
			
            case 2:

                valor = 150000000;   
               
                break;
			
            case 3:

                valor = 60000000;   
               
                break;
            
            case 4:

                valor = 30000000;   
               
                break;
                
            case 5:

                valor = 25000000;   
               
                break;    
                
                
                
               default:

                    valor = 0 ;

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
