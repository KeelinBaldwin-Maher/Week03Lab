package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the result text
        request.setAttribute("result", "---");
        
        // Send back to form
        getServletContext().getRequestDispatcher("/WEB-INF/aritmeticcalculator.jsp").
                forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user inputs
        String inputFirstNumber = request.getParameter("firstNumber");
        String inputSecondNumber = request.getParameter("secondNumber");
        
        // Retain user input
        request.setAttribute("firstNumber", inputFirstNumber);
        request.setAttribute("secondNumber", inputSecondNumber);
  
       int firstNumber = 0;
       int secondNumber = 0;
       
       // Retrieve first and second number user inputs and validate user inputs
       try{
           firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
           secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
           
       } catch(RuntimeException ex) {        
           // Set result text to inform user of their invalid input
           request.setAttribute("result", "invalid");
           
           // Send back to form
           getServletContext().getRequestDispatcher("/WEB-INF/aritmeticcalculator.jsp").
                   forward(request, response);
       }
        // Retrieve aritmetic operator selection
       String submit = request.getParameter("submit");
       
       int result = 0;
       // Perform airthmetiic operation based on user input
       switch(submit) {
           case "+":
               result = firstNumber + secondNumber;
               break;
            case "-":
                result = firstNumber - secondNumber;
               break;
            case "*":
                result = firstNumber * secondNumber;
               break;
            case "%":
                result = firstNumber % secondNumber;
               break;
       }
       
       // Set result text to display result of airthmetic operation
       request.setAttribute("result", result);
       
       // Send back to form
       getServletContext().getRequestDispatcher("/WEB-INF/aritmeticcalculator.jsp").
                forward(request, response);
    }

}
