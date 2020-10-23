package visao;

import java.util.Scanner;
import modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		int id, idSetor, salario, rg, opcaoFuncionario, aumento, opcaoMenu;
		boolean continuar=false;
		String opcao;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		Funcionario[] funcionarios = new Funcionario[5];
		
		for (int i=0;i<funcionarios.length;i++) {
			System.out.println("Insira o ID do " +(i+1)+ "° funcionário");
			id = scan.nextInt();
			System.out.println("Insira o ID do Setor do " +(i+1)+ "° funcionário");
			idSetor = scan.nextInt();
			System.out.println("Insira o salário do " +(i+1)+ "° funcionário");
			salario = scan.nextInt();
			System.out.println("Insira o RG do " +(i+1)+ "° funcionário");
			rg = scan.nextInt();
						
			funcionarios[i] = new Funcionario(id, idSetor, salario, rg, true);
			
		}

		do {
			System.out.println("Bem vindo ao menu, digite uma opção: \n[Desligar = 1 | Bonificar = 2 | Checar situação = 3]");
			opcaoMenu = scan.nextInt();
			
			switch(opcaoMenu) {
			case 1:
				System.out.println("Qual funcionário você quer desligar? [1-5]");
				opcaoFuncionario = scan.nextInt();
				funcionarios[opcaoFuncionario].demite();
				break;
			
			case 2:
				System.out.println("Qual funcionário você quer bonificar? [1-5]");
				opcaoFuncionario = scan.nextInt();
				System.out.println("Insira a quantia do aumento: ");
				aumento = scan.nextInt();
				funcionarios[opcaoFuncionario].bonificar(aumento);;
				break;
				
			case 3:
				System.out.println("Qual funcionário você quer checar? [1-5]");
				opcaoFuncionario = scan.nextInt();
				System.out.println("ID: "+funcionarios[opcaoFuncionario].getId());
				System.out.println("ID do Setor: "+funcionarios[opcaoFuncionario].getIdSetor());
				System.out.println("Salario: R$"+funcionarios[opcaoFuncionario].getSalario());
				System.out.println("RG: "+funcionarios[opcaoFuncionario].getRg());
				System.out.println("Vinculado a empresa? "+funcionarios[opcaoFuncionario].getEmpregado());				
				break;
			}			
			
			System.out.println("Deseja continuar no menu? [S/N]");
			opcao = scan.next();
			
			if (opcao.equalsIgnoreCase("S")) {
				continuar = true;
			}else if(opcao.equalsIgnoreCase("N")) {
				continuar=false;
			}
		}while(continuar);
		
		
		scan.close();
	}
}
