/*
 * Criador : Geanderson
 * Versão : 1.0
 * Objetivo : Cria uma matriz. Recebe valor nas posições, mostra valor inteiro e a soma
 * total dos valores aplicados na matriz.
 */
package ExerFacul;
import java.util.Scanner;
public class Exerc3 {

	public static void main(String[] args) {
		int [][]valores = new int[3][3];
		String matriz = "";
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		for(int i =0; i< valores.length; i++) {
			matriz += "\n";
			for(int j =0; j< valores[i].length; j++) {
				System.out.println("Entre com o valor da linha "+(i+1)+" na coluna "+(j+1));
				valores [i][j]= scan.nextInt();
				soma += valores [i][j];
				matriz += valores [i][j] + "|";
			}
		}
		System.out.print("Vetor:");
		System.out.println(matriz);
		System.out.print("Valor da soma: "+soma);

		scan.close();
	}

}
