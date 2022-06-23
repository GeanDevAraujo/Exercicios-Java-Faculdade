/*
 * Criador : Geanderson
 * Vers�o : 1.0
 * Objetivo : Cria um vetor. Compara os valores presentes dentro dele e apresenta qual � o maior.
 * Al�m disso apresenta a m�dia.
 */
package ExerFacul;

public class Exerc2 {

	public static void main(String[] args) {
		//vetor com valores j� colocados
		int []vetor = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
		//vari�vel que recebe o maior valor do vetor
		int receba = 0;
		//vari�vel 
		double media =0;
		for(int i = 0; i < vetor.length; i ++) {
			media += vetor[i];
			if (receba < vetor[i]) {
				receba = vetor[i];
			}
		}
		//m�dia dos valores
		media /= vetor.length;
		System.out.println(receba+" � o valor maior do vetor!");
		System.out.println(media+" � o valor da m�dia vetor!");


	}

}
