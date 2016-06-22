import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean sair = false;
		int controle;
		
		Empresa empresa = new Empresa("NoBox",1234);
		Funcionario wed = new Funcionario("Wedeueis", 366, "ativo", "Vis�o", 3250.00f);
		Funcionario ca = new Funcionario("Camila", 427, "ativo", "Programa��o", 3250.00f);
		Funcionario ivn = new Funcionario("Ivan", 123, "ativo", "C.E.O.", 5500.00f);
		Funcionario mcs = new Funcionario("Marcos", 321, "ativo", "Departamento Pessoal", 4000.00f);
		Funcionario jao = new Funcionario("Jo�o", 231, "ativo", "Gerente de Hardware", 4750.00f);
		Funcionario nat = new Funcionario("Nat�lia", 132, "inativo", "Intelig�ncia Artificial", 3250.00f);
		
		empresa.adicionarFuncionario(wed);
		empresa.adicionarFuncionario(ca);
		empresa.adicionarFuncionario(ivn);
		empresa.adicionarFuncionario(mcs);
		empresa.adicionarFuncionario(jao);
		empresa.adicionarFuncionario(nat);
		
		
		while(!sair){
			Scanner scan = new Scanner(System.in);
			System.out.println("Escolha uma op��o.");
			System.out.println("1 - Listar todos os funcion�rios.");
			System.out.println("2 - Listar funcion�rios ativos.");
			System.out.println("3 - Buscar por cpf.");
			System.out.println("4 - Buscar por setor.");
			System.out.println("5 - Sair.");
			controle = scan.nextInt();
			switch(controle){
				case 1:
					empresa.listarTodos();
					break;
				case 2:
					empresa.listarAtivos();
					break;
				case 3:
					int cpf;
					System.out.print("Insira o cpf que deseja buscar(3 digitos): ");
					cpf = scan.nextInt();
					System.out.println();
					empresa.buscarCPF(cpf);
					break;
				case 4:
					String setor;
					System.out.print("Insira o setor que deseja buscar: ");
					setor = scan.next();
					System.out.println();
					empresa.buscarPorSetor(setor);
					break;		
				case 5:
					sair = true;
					scan.close();
					System.out.println("Obrigado!");
					break;
				default:
					System.out.println("Escolha uma op��o v�lida!");

			}
		}

	}

}
