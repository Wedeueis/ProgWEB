package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConversorUnidades extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out = resp.getWriter();
			
		 Double valor = Double.parseDouble(req.getParameter("metros"));
		 String unidadeDeEntrada = req.getParameter("unidadeDeEntrada");
		 String unidadeDeSaida = req.getParameter("unidadeDeSaida");
		 Double saida = 0.0;
		 
		 if(unidadeDeEntrada.equals("metros")){
			 if(unidadeDeSaida.equals("milhas")){  
				 saida = valor/1603.3;
			 }else if(unidadeDeSaida.equals("quilômetros")){
				 saida = valor/1000.0;
			 }else if(unidadeDeSaida.equals("polegadas")){
				 saida = valor/0.0254;
			 }else if(unidadeDeSaida.equals("pés")){
				 saida = valor/0.3048;
			 }else if(unidadeDeSaida.equals("jardas")){
				 saida = valor/0.9144;
			 }else{
				 saida = valor;
			 }
		 }else if(unidadeDeEntrada.equals("quilômetros")){
			 if(unidadeDeSaida.equals("milhas")){
				 saida = valor/1.61;
			 }else if(unidadeDeSaida.equals("metros")){
				 saida = valor/0.003;
			 }else if(unidadeDeSaida.equals("polegadas")){
				 saida = valor/(2.54*Math.pow(10.0,-5.0));
			 }else if(unidadeDeSaida.equals("pés")){
				 saida = valor/(3.05*Math.pow(10.0,-4.0));
			 }else if(unidadeDeSaida.equals("jardas")){
				 saida = valor/(9.14*Math.pow(10.0,-4.0));
			 }else{
				 saida = valor;
			 }
		 }else if(unidadeDeEntrada.equals("polegadas")){
			 if(unidadeDeSaida.equals("milhas")){
				 saida = valor/63360.0;
			 }else if(unidadeDeSaida.equals("quilômetros")){
				 saida = valor/39370.08;
			 }else if(unidadeDeSaida.equals("metros")){
				 saida = valor/39.37;
			 }else if(unidadeDeSaida.equals("pés")){
				 saida = valor/12.0;
			 }else if(unidadeDeSaida.equals("jardas")){
				 saida = valor/36.0;
			 }else{
				 saida = valor;
			 }
		 }else if(unidadeDeEntrada.equals("pés")){
			 if(unidadeDeSaida.equals("milhas")){
				 saida = valor/5280.0;
			 }else if(unidadeDeSaida.equals("quilômetros")){
				 saida = valor/3280.84;
			 }else if(unidadeDeSaida.equals("polegadas")){
				 saida = valor/0.08;
			 }else if(unidadeDeSaida.equals("metros")){
				 saida = valor/3.28;
			 }else if(unidadeDeSaida.equals("jardas")){
				 saida = valor/3.0;
			 }else{
				 saida = valor;
			 }
		 }else if(unidadeDeEntrada.equals("jardas")){
			 if(unidadeDeSaida.equals("milhas")){
				 saida = valor/1760.0;
			 }else if(unidadeDeSaida.equals("quilômetros")){
				 saida = valor/1093.61;
			 }else if(unidadeDeSaida.equals("polegadas")){
				 saida = valor/0.03;
			 }else if(unidadeDeSaida.equals("pés")){
				 saida = valor/0.33;
			 }else if(unidadeDeSaida.equals("metros")){
				 saida = valor/1.09;
			 }else{
				 saida = valor;
			 }
		 }else if(unidadeDeEntrada.equals("milhas")){
			 if(unidadeDeSaida.equals("metros")){
				 saida = valor/(6.21*Math.pow(10.0,-4.0));
			 }else if(unidadeDeSaida.equals("quilômetros")){
				 saida = valor/0.62;
			 }else if(unidadeDeSaida.equals("polegadas")){
				 saida = valor/(1.58*Math.pow(10.0,-5.0));
			 }else if(unidadeDeSaida.equals("pés")){
				 saida = valor/(1.89*Math.pow(10.0,-4.0));
			 }else if(unidadeDeSaida.equals("jardas")){
				 saida = valor/(5.68*Math.pow(10.0,-4.0));
			 }else{
				 saida = valor;
			 }
		 }
		 
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>Conversão de Medidas</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h1>Conversão de medidas</h1>");
		 out.println("<h2>Valor digitado: " + valor + " " + unidadeDeEntrada + 
				 ", corresponde a: " + saida + " " + unidadeDeSaida + "</h2>");
		 out.println("</body>");
		 out.println("</html>");
	}
}
