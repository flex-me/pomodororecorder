import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

public class RecordTask extends HttpServlet {

	public static ArrayList<String> items = new ArrayList<String>();

    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException {
        //ServletOutputStream out = response.getOutputStream();
        PrintWriter out = response.getWriter();
	
	String item = "Current Time: " + request.getParameter("currentTime") + ", Duration: " + request.getParameter("duration") + " minutes, Task: [" + request.getParameter("task") + "]";

	items.add(item);
	System.out.println(item );
        //out.println("BBBB");

    }
}