 /*
 * Criador : Geanderson
 * Versão : 1.0
 * Objetivo : Recebe a nota dos alunos e printa na tela. 5 alunos, cada um com 2 notas.
 */
package ExerFacul;

import java.util.Scanner;
public class Exerc4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String matriz = "";
		double [][] notasAlunos = new double[5][2];
		for(int i =0; i< notasAlunos.length; i++) {
			//Grava a ordem dos alunos(aluno 1,aluno 2...) 
			matriz += "\n"+" NOTAS ALUNO "+(i+1)+" : ";
			for(int j =0; j< notasAlunos[i].length; j++) {
				System.out.println("Entre com a nota do aluno "+(i+1)+" na prova "+(j+1));
				notasAlunos[i][j] = scan.nextDouble();
				//Grava nota dos alunos
				matriz += notasAlunos[i][j]+" | ";
			}
		}
		//printa tudo
		System.out.println(matriz);
		scan.close();
	}
}