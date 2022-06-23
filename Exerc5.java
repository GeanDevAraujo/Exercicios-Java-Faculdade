/*
 * Criador : Geanderson
 * Vers�o : 1.0
 * Objetivo : Gera uma matriz com n�meros aleat�rios e printa na tela.
 * Ocorre um tratamento da vari�vel String. Apenas n�meros pares s�o atribu�dos.
 */
package ExerFacul;
import java.util.Random;
public class Exerc5 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int [][] matriz = new int [5][5];
		String recebe = "";
		int gera ;

		for(int i = 0; i < matriz.length; i++) {
			recebe += "\n";
			for(int j = 0; j < matriz[i].length; j++) {
				do {
					gera = aleatorio.nextInt(100);
					//passa apenas n�meros pares
					if ( gera % 2 == 0) {
						matriz[i][j]= gera;
					}
				}while(gera % 2 == 1);
				/*tratamento de valores atribu�dos(n�meros abaixo de 10 recebem
				0 � esquerda)*/
				if (matriz[i][j] >= 10) {
					recebe += matriz[i][j] + "|";
				}	else {
					recebe += "0"+matriz[i][j] + "|";
				}
			}
		}
		System.out.println (recebe);
	}

}
