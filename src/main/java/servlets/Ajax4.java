package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Ajax4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> paramenterMap = new HashMap<String, String>();

        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            paramenterMap.put(paramName, request.getParameter(paramName));
        }

        response.setContentType("application/json; charset=ISO-8859-15");
        final ServletOutputStream os = response.getOutputStream();
        String JSONresp = objectMapper.writeValueAsString(paramenterMap);
        os.write(JSONresp.toString().getBytes(), 0, JSONresp.length());
        os.flush();
        os.close();
    }
}
