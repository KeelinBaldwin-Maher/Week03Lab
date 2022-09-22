/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Calculates the users next age based on their input
 * 
 * @author ety
 */
public class AgeCalculatorServlet extends HttpServlet {

    // Show agecalculator.jsp 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int age = 0;
        
        // Retrive parameters   
        try {
            age = Integer.parseInt(request.getParameter("age"));
        }
        catch (RuntimeException ex) {
            String wrongInput = request.getParameter("age");
            
            // Send error message and retain user input
            request.setAttribute("age", wrongInput);
            request.setAttribute("wrongInputMessage", "<br>" + 
                    "You must give your current age.");
            
            // Send back to form
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
        }
        
        // Send current age + 1 and message
        request.setAttribute("nextAgeMessage", "<br>" +
                   "Your next birthday will be " + (age +1));
        
        // Send back to form
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
    }

}
