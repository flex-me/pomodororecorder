import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;

public class ShowAll extends HttpServlet {



    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException {
        //ServletOutputStream out = response.getOutputStream();
        PrintWriter out = response.getWriter();
	
	String result = "";

	for(String item : RecordTask.items){
		result += item + "\n";
	}

        out.println(result);

    }
}