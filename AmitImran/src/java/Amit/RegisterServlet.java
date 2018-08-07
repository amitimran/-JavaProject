/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MR SINGH
 */
public class RegisterServlet extends HttpServlet {

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
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("tt1");
        String userId = request.getParameter("tt2");
        String pass = request.getParameter("tt3");
        String address = request.getParameter("tt5");
        String state = request.getParameter("tt6");
        String country = request.getParameter("tt7");
        java.sql.Connection con =  SQL.getConnection();
        PrintWriter out = response.getWriter();
        try
        {
            PreparedStatement ps = con.prepareStatement("insert into newuser values(?,?,?,?,?,?)");
            ps.setString(1, userId);
            ps.setString(2, userName);
            ps.setString(3, pass);
            ps.setString(4, address);
            ps.setString(5, state);
            ps.setString(6, country);
            int count = ps.executeUpdate();
            if(count>0)
                response.getWriter().print("<h1>Registered Successfully</h1>");
        }catch(Exception exp)
        {
            System.out.println("Sql Problem  : "+exp);
        }
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
