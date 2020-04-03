package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*@author Camilo*/

public class calcservlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String ans = request.getParameter("ans");
            String[] ts;
            double a=0;
            double b=0;
            
            int signoLocS=0;
            int signoLocR=0;
            int signoLocM=0;
            int signoLocD=0;
            signoLocS=ans.indexOf("+");
            signoLocR=ans.indexOf("-");
            signoLocM=ans.indexOf("*");
            signoLocD=ans.indexOf("/");
            
            char signoChar;
            String signo="";
            
            if(signoLocS > 0){
                signoChar=ans.charAt(signoLocS);
                signo=""+signoChar;
                if(signo.equals("+")){
                    ts = ans.split("\\+");
                    a=Integer.parseInt(ts[0]);
                    b=Integer.parseInt(ts[1]);
                    /*     REVISION ENTRADA
                    out.println("<h1> ->" + a + "</h1>");
                    out.println("<h1> ->" + b + "</h1>");
                    out.println("<h1> ->" + signo + "</h1>");*/
                    out.println("<h1>Resultado = " + addition(a,b) + "</h1>");
                }
            }
            
            if(signoLocR > 0){
                signoChar=ans.charAt(signoLocR);
                signo=""+signoChar;
                if(signo.equals("-")){
                    ts = ans.split("-");
                    a=Integer.parseInt(ts[0]);
                    b=Integer.parseInt(ts[1]);
                    out.println("<h1>Resultado = " + resta(a,b) + "</h1>");
                }
            }
            
            if(signoLocM > 0){
                signoChar=ans.charAt(signoLocM);
                signo=""+signoChar;
                if(signo.equals("*")){
                    ts = ans.split("\\*");
                    a=Integer.parseInt(ts[0]);
                    b=Integer.parseInt(ts[1]);
                    out.println("<h1>Resultado = " + mult(a,b) + "</h1>");
                }
            }
            
            if(signoLocD > 0){
                signoChar=ans.charAt(signoLocD);
                signo=""+signoChar;
                if(signo.equals("/")){
                    ts = ans.split("\\/");
                    a=Integer.parseInt(ts[0]);
                    b=Integer.parseInt(ts[1]);
                    out.println("<h1>Resultado = " + div(a,b) + "</h1>");
                }
            }
            //out.println("<h1>TESTING "+ calcbean.addition(a, b) +"</h1>");
            //out.println("<h1>Resultado = " + signo + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    }
    public double addition(double b, double a) {return a+b;}
    public double resta(double b, double a) {return (a-b)*(-1);}
    public double mult(double b, double a) {return a*b;}
    public double div(double b, double a) {return a/b;}
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
