
public class Funcionario {
	
	Funcionario(String nome,Integer cpf,String status, 
				String setor,Float salarioMensal ){
		this.nome = nome;
		this.cpf = cpf;
		this.status = status;
		this.setor = setor;
		this.salarioMensal = salarioMensal;
	}
	
	private String nome;
	private Integer cpf;
	private String status;
	private String setor;
	private Float salarioMensal;
	
	//metodos getters para todos os atributos
	public String getNome() {
		return nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public String getStatus() {
		return status;
	}
	public String getSetor() {
		return setor;
	}
	public Float getSalarioMensal() {
		return salarioMensal;
	}
	
	//Calcul0a o salario anual(equivalente a 12 meses)
	Float salarioAnual(){
		return (this.salarioMensal * 12);
	}
}
