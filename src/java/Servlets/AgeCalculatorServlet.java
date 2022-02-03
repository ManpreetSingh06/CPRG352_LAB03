package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int val;
        String Age = request.getParameter("age");
          
        int count=0;
        if( Age == null || Age.equals("")){
            String message = "You must give your current age";
            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
        
        
        try {
        val = Integer.parseInt(Age);
        val++;
        String message="Your age next birthday will be ";
            String m=message+val;
            request.setAttribute("message", m);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    } catch (NumberFormatException e) {
        String message="You must enter a number ";
        request.setAttribute("message", message);
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        
    }

        
       

    }

}
