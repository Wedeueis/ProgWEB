package br.edu.ufabc.prograd.jdbc;
import java.util.List;

import br.edu.ufabc.prograd.modelo.Aluno;

import java.sql. *;
import java.util.ArrayList;

public class AlunoBD {
	private Connection connection;
	public AlunoBD(){
		this.connection = new ConexaoBD().getConexaoBD();
	}
	
	public void insere(Aluno aluno) {
		String sql = "insert into alunos (nome,email,endereco) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta valores
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getEndereco());
			//executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Aluno aluno) {
		String sql = "DELETE FROM alunos WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta valores
			aluno = this.buscaPeloNome(aluno.getNome());
			stmt.setLong(1, aluno.getId());
			//executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Aluno aluno) {
		String sql = "UPDATE alunos SET nome=?, email=?, endereco=? WHERE id=?";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta valores
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getEndereco());
			aluno = this.buscaPeloNome(aluno.getNome());
			stmt.setLong(4, aluno.getId());
			//executa
			stmt.execute();
			stmt.close();
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Aluno> getLista() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement("select * from alunos order by nome");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getLong("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setEndereco(rs.getString("endereco"));
				alunos.add(aluno);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return alunos;
	}
	
	public Aluno buscaPeloNome(String nome) {
		String sql = "Select * from alunos WHERE nome=?";
		Aluno aluno = new Aluno();
		PreparedStatement stmt;
		try{
			stmt = this.connection.prepareStatement(sql);
			//seta valores
			stmt.setString(1, nome);
			//executa
			ResultSet rs = stmt.executeQuery();
			rs.next();
			aluno.setNome(nome);
			aluno.setId(rs.getLong("id"));
			aluno.setEmail(rs.getString("email"));
			aluno.setEndereco(rs.getString("endereco"));
			rs.close();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return aluno;
	}
}
