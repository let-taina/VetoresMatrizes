package vetoresematrizes;

import java.util.Scanner;

public class VetoresExercicio1 {

	public static void main(String[] args) {
		/* Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
		 * construa um algoritmo que consiga pesquisar dados no vetor, 
		 * onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
		 * Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.
		 */
		
		int vetorNumeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
				
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o número que deseja buscar: ");
		
		int numeroBuscado = leia.nextInt();
		
		int posicao = -1;
		
		for (int i=0; i <vetorNumeros.length; i++) {
			if (vetorNumeros [i] == numeroBuscado) {
			posicao = i;
			break;
		}
		}
				
		if (posicao != -1) {
			System.out.println("O número " + numeroBuscado + " foi econtrado na posição " +posicao + ".");
		}else {
			System.out.println("Número não encontrado. Programa finalizado.");
		}
		
		leia.close();
		}
}
 