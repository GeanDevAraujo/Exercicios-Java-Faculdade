/*
 * Criador : Geanderson
 * Versão : 1.0
 * Objetivo : Cria um vetor. Compara os valores presentes dentro dele e apresenta qual é o maior.
 * Além disso apresenta a média.
 */
package ExerFacul;

public class Exerc2 {

	public static void main(String[] args) {
		//vetor com valores já colocados
		int []vetor = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
		//variável que recebe o maior valor do vetor
		int receba = 0;
		//variável 
		double media =0;
		for(int i = 0; i < vetor.length; i ++) {
			media += vetor[i];
			if (receba < vetor[i]) {
				receba = vetor[i];
			}
		}
		//média dos valores
		media /= vetor.length;
		System.out.println(receba+" é o valor maior do vetor!");
		System.out.println(media+" é o valor da média vetor!");


	}

}
