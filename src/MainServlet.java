
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(value = "/main")

public class MainServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class='container w-25 p-4 my-4 border'>");


        out.print("<table>");
        out.print("<form action='/func' method='post'>");
        out.print("<tbody>");
        out.print("<tr>");
        out.print("<td>Name:</td><td><input type='text' placeholder='Insert name' name='name'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Surname:</td><td><input type='text' placeholder='Insert surname' name='surname'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Club:</td>" +
                "<td>"+
                "<select name='club'>" +
                "<option>Real Madrid CF</option>" +
                "<option>FC Barcelona</option>" +
                "<option>FC Liverpool</option>" +
                "</select>" +
                "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Salary:</td><td><input type='number' placeholder='Insert salary' name='salary'></td></br>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Transfer Price:</td><td><input type='number' placeholder='Insert Transfer price' name='transfer'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td><button type='submit' class='btn btn-primary'>Add Footballer</button></td>");
        out.print("</tr>");
        out.print("</tbody>"); out.print("</form>");
        out.print("</table>");

        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }

}