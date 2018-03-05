/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.aqrSw.ejercicioServlets.tallerTres.servlets;

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
        
//        double creditoCar[][] = new double[coutas+1][3]; 
//        
//        
//        for ( int i= 0 ; i < creditoCar.length; i++ ){
//                     
//                     creditoCar[i][0]= i +1 ; 
//                     
//                     
//                     if ( i == 0){
//                         saldos = saldoInicial;                        
//                         creditoCar[i][1] = valorAuto; 
//                         creditoCar[i][2] = creditoCar[i][1] - coutaInicial;
//                     }
//                     
//                     else{                        
//                         creditoCar[i][1] = creditoCar[i-1][2];  
//                         creditoCar[i][2]= creditoCar[i][1] - vlrCuota ;
//                     }                     
//                     
//                    
//                     
//             
//        }
//        
//        String Salida = "Elementos de la Matriz\n";
//                 for(int k=0;k<creditoCar.length;k++) {
//                    for(int l=0;l<creditoCar[l].length;l++)
//                            Salida+=creditoCar[k][l]+" ";
//                            Salida+="\n";
//            }
//        JOptionPane.showMessageDialog(null,Salida,"MATRIZ DE VALORES",JOptionPane.INFORMATION_MESSAGE);
//        
//        
//     }
//    
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletConcesionario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletConcesionario at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
    
//        int coutas ;
//        double coutaInicial ;
//        double valorAuto;
//
//        double saldoInicial;
//        double vlrCuota;
//        double saldos;
//        double saldoAct;
//        double valor;      
//        
//        
//        coutas = Integer.parseInt(JOptionPane.showInputDialog(null, "numero de cuotas"));
//        valorAuto = Double.parseDouble(JOptionPane.showInputDialog(null, "valor del carro"));
//        coutaInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "valor de la cuota inicial"));
//        
//        saldoInicial = valorAuto - coutaInicial;        
//        vlrCuota =  saldoInicial / coutas ;
//        saldoAct =  vlrCuota * coutas ;
//        saldos = saldoAct - vlrCuota;
//    
    
    
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
