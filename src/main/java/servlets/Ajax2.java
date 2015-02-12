package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Ajax2 extends HttpServlet {

	private static final String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<CATALOG>\n"
			+ "<usuario id=\"1\">\n"
			+ "<provincia>Alicante</provincia>\n"
			+ "<ciudad>Petrer</ciudad>\n"
			+ "<direccion>C/Mayor</direccion>\n"
			+ "</usuario>\n"
			+ "<usuario id=\"2\">\n"
			+ "<provincia>Valencia</provincia>\n"
			+ "<ciudad>Xirivella</ciudad>\n"
			+ "<direccion>C/Mayor 2</direccion>\n"
			+ "</usuario>\n"
			+ "<usuario id=\"3\">\n"
			+ "<provincia>Castellon</provincia>\n"
			+ "<ciudad>Morella</ciudad>\n"
			+ "<direccion>C/Mayor 3</direccion>\n"
			+ "</usuario>\n"
			+ "</CATALOG>";


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html; charset=ISO-8859-15");
		final ServletOutputStream os = response.getOutputStream();
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		os.write(XML.getBytes(Charset.forName("UTF-8")), 0, XML.length());
		os.flush();
		os.close();
	}
}
