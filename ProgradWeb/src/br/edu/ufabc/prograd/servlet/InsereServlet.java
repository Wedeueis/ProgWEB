package br.edu.ufabc.prograd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ufabc.prograd.jdbc.AlunoBD;
import br.edu.ufabc.prograd.modelo.Aluno;

@WebServlet("/insere")
public class InsereServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	// obtem parametros do request
	String nome = req.getParameter("nome");
	String email = req.getParameter("email");
	String endereco = req.getParameter("endereco");
	// instancia objeto Aluno
	Aluno aluno = new Aluno();
	aluno.setNome(nome);
	aluno.setEmail(email);
	aluno.setEndereco(endereco);
	AlunoBD bd = new AlunoBD();
	bd.insere(aluno); // salva no BD
	// escreve a pagina que sera enviada como resposta
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Aluno "+aluno.getNome()+ " inserido com sucesso!<h2>");
	out.println("</body>");
	out.println("</html>");
	}
}
