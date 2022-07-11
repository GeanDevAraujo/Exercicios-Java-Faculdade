package exercises;
import java.util.LinkedList;
import java.util.Scanner;
public class DynamicLinearStructures {

	public static void main(String[] args) {
		LinkedList passageiros = new LinkedList();
		LinkedList funcionarios = new LinkedList();
		LinkedList concatenacao = new LinkedList();

		Scanner scan = new Scanner(System.in);
		int escolha;
		do {
	System.out.println(
			"1. Criar lista de passageiros"+ "\n"
	
			+"2. Implementar lista de funcion�rios"+ "\n"

			+"3. Contratar um funcion�rio"+ "\n"

			+"4. Verifica��o se funcion�rio pertence � lista."+ "\n"

			+"5. Juntar as listas"+ "\n"
			
			+"6. Contar n�mero de elementos da lista"+ "\n"
);
	escolha = scan.nextInt();
	switch(escolha) {
		case 1:
			System.out.println("Digite o nome");
passageiros.add(scan.next());
System.out.println(passageiros);
			
			break;
		case 2:
			int tamanho;
			System.out.println("Qual o tamanho da lista de funcion�rio?");
			tamanho = scan.nextInt();
			for(int i =0; i<tamanho;i++){
				System.out.println("Digite o nome do funcion�rio:");
				funcionarios.add(scan.next());
			}
			System.out.println(funcionarios);
			break;
		case 3:
			System.out.println("Digite o nome do funcion�rio:");
			funcionarios.add(scan.next());
			System.out.println(funcionarios);
			break;
		case 4:
			System.out.println("Digite o nome que deseja verificar:");
			System.out.println(funcionarios.contains(scan.next())); 
			
			break;
		case 5:
			System.out.println("Juntando as listas:");
concatenacao.addAll(funcionarios);
concatenacao.addAll(passageiros);
System.out.println(concatenacao);
break;
		case 6:
			System.out.println("Funcionarios tem " +funcionarios.size()+" elementos.");
			System.out.println("Passageiros tem "+passageiros.size()+ "elementos.");
			break;
		case 7:
			System.out.println("Programa encerrado.");
			break;
			default:
				System.out.println("Escolha uma op��o v�lida!");
				break;
				}
	
	}while(escolha!=7);
	}

}
