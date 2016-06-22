import java.util.ArrayList;

public class Empresa {
	Empresa(String nome,Integer cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	private String nome;
	private Integer cnpj;
	private ArrayList<Funcionario> funcionarios;
	
	public String getNome() {
		return nome;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	void adicionarFuncionario(Funcionario novo){
		funcionarios.add(novo);
	}
	
	void listarTodos(){
		for(Funcionario func : funcionarios){
			System.out.println("Nome: " + func.getNome());
			System.out.println("CPF: " + func.getCpf());
			System.out.println("Situação: " + func.getStatus());
			System.out.println("Setor: " + func.getSetor());
			System.out.println("Salario(mensal): R$" + func.getSalarioMensal());
			System.out.println();
		}
	}
	
	void listarAtivos(){
		for(Funcionario func : funcionarios)
			if(func.getStatus().equals("ativo") ) {
				System.out.println("Nome: " + func.getNome());
				System.out.println("CPF: " + func.getCpf());
				System.out.println("Setor: " + func.getSetor());
				System.out.println("Salario(mensal): R$" + func.getSalarioMensal());
				System.out.println();
			}
	}
	
	void buscarPorSetor(String setor) {
		for(Funcionario func : funcionarios)
			if(func.getSetor().equals(setor) ) {
				System.out.println("Nome: " + func.getNome());
				System.out.println("CPF: " + func.getCpf());
				System.out.println("Situação: " + func.getStatus());
				System.out.println("Salario(mensal): R$" + func.getSalarioMensal());
				System.out.println();
			}
	}
	
	void buscarCPF(int cpf){
		boolean achou = false;
		Funcionario func = null;
		
		for(Funcionario busca : funcionarios)
			if(busca.getCpf() == cpf){
				func = busca;
				achou = true;
			}
		
		if(func != null && achou){
			System.out.println("Nome: " + func.getNome());
			System.out.println("CPF: " + func.getCpf());
			System.out.println("Situação: " + func.getStatus());
			System.out.println("Setor: " + func.getSetor());
			System.out.println("Salario(anual) R$: " + func.salarioAnual());
			System.out.println();

		}else{
			System.out.println("Funcionário não cadastrado.");
			System.out.println();
		}
	}
}
