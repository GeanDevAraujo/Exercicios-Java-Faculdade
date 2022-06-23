/*
 * Criador : Geanderson
 * Versão : 1.0
 * Objetivo : Cria 2 matrízes distintas,uma para notas e outra para matrículas e printa-as,
 * seguindo com a nota atribuída a cada matrícula.
 */
package ExerFacul;
import java.util.Scanner;
public class Exerc1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vetor para matrícula
		int [] matriculaAlunos = new int [4];
		//vetor para notas
		double [] notaAlunos = new double [4];
		int i;
		//String que irá receber valores das matrículas e notas para ser printado depois
		String registro = "";
		for( i =0; i < matriculaAlunos.length;i ++ ) {	
			System.out.println("Digite o número da matrícula :");
			matriculaAlunos[i] = scan.nextInt();

		}
		for(int j =0; j < matriculaAlunos.length;j ++ ) {
			System.out.println("Digite a nota do aluno da matrícula "+matriculaAlunos[j]+":");
			notaAlunos[j]= scan.nextDouble();
			//String recebendo valores e caracteres
			registro += "Matrícula: "+matriculaAlunos[j]+" | "+" Nota: "+notaAlunos[j]+"\n";

		}
		System.out.println();
		//String sendo printado
		System.out.println(registro);
		scan.close();
	}

}




