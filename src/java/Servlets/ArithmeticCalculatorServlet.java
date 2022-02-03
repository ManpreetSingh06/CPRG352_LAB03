package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "---";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_num = request.getParameter("first_no");
        String second_num = request.getParameter("second_no");
        String oprbtn = request.getParameter("operation");
        request.setAttribute("first_Num", first_num);
        request.setAttribute("second_Num", second_num);

        try {
            if (first_num == null || first_num.equals("") || second_num == null || second_num.equals("")) {
                String message = "Invalid";
                request.setAttribute("message", message);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;

            } else if (oprbtn.equals("+")) {
                int num1 = Integer.parseInt(first_num);
                int num2 = Integer.parseInt(second_num);
                int num3 = num1 + num2;
                System.out.println(num3);
                String message = "" + num3;
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;

            }
            else if (oprbtn.equals("-")) {
                int num1 = Integer.parseInt(first_num);
                int num2 = Integer.parseInt(second_num);
                int num3 = num1 - num2;
                System.out.println(num3);
                String message = "" + num3;
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;

            }
           else if (oprbtn.equals("*")) {
                int num1 = Integer.parseInt(first_num);
                int num2 = Integer.parseInt(second_num);
                int num3 = num1 * num2;
                System.out.println(num3);
                String message = "" + num3;
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;

            }
           else if (oprbtn.equals("%")) {
                int num1 = Integer.parseInt(first_num);
                int num2 = Integer.parseInt(second_num);
                int num3 = num1 % num2;
                System.out.println(num3);
                String message = "" + num3;
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;

            }
        } catch (NumberFormatException e) {
            String message = "Invalid";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

}
