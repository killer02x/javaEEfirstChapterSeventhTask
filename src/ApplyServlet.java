import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(value = "/func")

public class ApplyServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String club = request.getParameter("club");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int TransPrice = Integer.parseInt(request.getParameter("transfer"));
        Fotballer footballer = new Fotballer();
        ArrayList<Fotballer> fotballers = DBManager.getAllFootballers();
        long count = 0;
        for (Fotballer x:fotballers){
            if(x!=null){
                count++;
            }
            else {
                count=1;
            }
        }
        footballer.setId(count);
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setClub(club);
        footballer.setSalary(salary);
        footballer.setTransferPrice(TransPrice);
        DBManager.addFootballer(footballer);
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class='container w-25  p-10 my-10' style='margin:5px 500px;border:1px solid lightgray;'>");
        for (Fotballer x:fotballers){
            out.print("<h2 style='color:green;'>"+x.getName()+" "+x.getSurname()+"</h2>");
            out.print("<h4 style='color:blue;'>"+"Club: "+x.getClub()+"</h4>");
            out.print("<h4 style='color:red;'>"+"Salary: "+x.getSalary()+" "+"EUR</h4>");
            out.print("<h4 style='color:red;'>"+"Transfer Price: "+x.getTransferPrice()+" "+"EUR</h4>");
            out.print("</br></br>");
        }
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }


    @Override
    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        System.out.println("This is Apply page");


    }

}