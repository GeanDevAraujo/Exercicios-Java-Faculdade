/*
 * Criador : Geanderson
 * Vers�o : 1.0
 * Objetivo : Cria 2 matr�zes distintas,uma para notas e outra para matr�culas e printa-as,
 * seguindo com a nota atribu�da a cada matr�cula.
 */
package ExerFacul;
import java.util.Scanner;
public class Exerc1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//vetor para matr�cula
		int [] matriculaAlunos = new int [4];
		//vetor para notas
		double [] notaAlunos = new double [4];
		int i;
		//String que ir� receber valores das matr�culas e notas para ser printado depois
		String registro = "";
		for( i =0; i < matriculaAlunos.length;i ++ ) {	
			System.out.println("Digite o n�mero da matr�cula :");
			matriculaAlunos[i] = scan.nextInt();

		}
		for(int j =0; j < matriculaAlunos.length;j ++ ) {
			System.out.println("Digite a nota do aluno da matr�cula "+matriculaAlunos[j]+":");
			notaAlunos[j]= scan.nextDouble();
			//String recebendo valores e caracteres
			registro += "Matr�cula: "+matriculaAlunos[j]+" | "+" Nota: "+notaAlunos[j]+"\n";

		}
		System.out.println();
		//String sendo printado
		System.out.println(registro);
		scan.close();
	}

}




