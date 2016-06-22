package br.edu.ufabc.prograd.testes;
import br.edu.ufabc.prograd.modelo.Aluno;

public class CriaAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Jack");
		aluno.setEmail("jack@gmail.com");
		aluno.setEndereco("Av. dos Estados,5001");
		aluno.setId((long) 3);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getEndereco());
		System.out.println(aluno.getId());
		
		Aluno[] alunos = new Aluno[4];
		for(int i = 0; i < 4; i++ )
			alunos[i] = new Aluno();
			
		alunos[0].setNome("Pedro");
		alunos[0].setEmail("pedro@gmail.com");
		alunos[0].setEndereco("Rua das Flores, 13");
		alunos[0].setId( (long) 4);
		
		alunos[1].setNome("Ana");
		alunos[1].setEmail("ana@gmail.com");
		alunos[1].setEndereco("Rua das Flores, 13");
		alunos[1].setId( (long) 1);
		
		alunos[2].setNome("Carlos");
		alunos[2].setEmail("carlos@gmail.com");
		alunos[2].setEndereco("Rua Padre Afonso, 27");
		alunos[2].setId( (long) 2);
		
		alunos[3].setNome("Vanessa");
		alunos[3].setEmail("vanessa@gmail.com");
		alunos[3].setEndereco("Av. Paulista, 212");
		alunos[3].setId( (long) 5);
			
		
		System.out.println();
		for(int i = 0; i < 4; i++ ) {
			System.out.println(alunos[i].getNome());
			System.out.println(alunos[i].getEmail());
			System.out.println(alunos[i].getEndereco());
			System.out.println(alunos[i].getId());
			System.out.println();
		}
		
	}
}
