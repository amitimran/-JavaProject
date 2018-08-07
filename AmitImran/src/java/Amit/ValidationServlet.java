/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amit;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Administrator
 */
@WebServlet(name="ValidationServlet", urlPatterns={"/ValidationServlet"})
public class ValidationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        java.sql.Connection con = SQL.getConnection();
        
        try {
        Statement stmt = con.createStatement();
        String query;
        String user=request.getParameter("uid");
        String password=request.getParameter("pwd");
        String role=request.getParameter("r1");
        if(user.equals("posofficer"))
            query = "select * from pos where userid='"+user+"' and pass ='"+password+"'";
        else
            query = "select * from newuser where userid='"+user+"' and pass ='"+password+"'";
        System.out.println("Role : "+role);
        
            ResultSet rs = stmt.executeQuery(query);
        if (rs.next() && role.equals("posofficers"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("User", user);

            RequestDispatcher dispatch = request.getRequestDispatcher("WelcomePosOfficers.jsp");

	     dispatch.forward(request, response);


        }
        else if ((rs.next()) || (role.equals("user")))
        {
         HttpSession session = request.getSession();
        session.setAttribute("User", user);

         RequestDispatcher dispatch = request.getRequestDispatcher("WelcomeCustomer.jsp");

	     dispatch.forward(request, response);
            }
   else
     {
       out.println("<html>");
          out.println("<head>");
          out.println("<title>Invalid Login Page</title>");
           out.println("</head>");
           out.println("<body style=\"background-image: url(images/tem.jpg)\" width=\"100%\" height=\"100%\">");
          out.println("<table border='0' bgcolor='' align='top' width='100%' style='height:100px'");
          out.println("<tr>");
          out.println("<td bgcolor='' align='center'");
           out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+5' color='yellow'>Sound & Stage Entertainment</font>");
           out.println("</td>");
           out.println("</tr>");
           out.println("</table>");
          out.println("<font style='font-family: 'Arial Rounded MT Bold;' size='+4' color='red'>Invalid User Credentials!!");

     }
        }
    
 catch(Exception exp){}

         finally {
            out.close();
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
