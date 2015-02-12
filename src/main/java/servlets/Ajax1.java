package servlets;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Ajax1 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

        final int id = Integer.parseInt(request.getParameter("id"));

        final StringBuffer resp = new StringBuffer();

        switch (id) {
            case 1:
                resp.append("Alicante");
                break;
            case 2:
                resp.append("Valencia");
                break;
            case 3:
                resp.append("Castellon");
                break;
            default:
                resp.append("Desconocida");
                break;
        }

        response.setContentType("text/html; charset=ISO-8859-15");
        final ServletOutputStream os = response.getOutputStream();
        os.write(resp.toString().getBytes(), 0, resp.length());
        os.flush();
        os.close();
    }
}
