/*
 * Faça um algoritmo que ler 5   
 * números positivos do teclado
 * e imprimi a soma deles
 */

import java.util.Scanner;

class Problema05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int MAX = 5;
		
		int num, soma, i;
		soma = 0;

		num = entrada.nextInt();
		i = 1;
		while (i <= MAX) {
			num = entrada.nextInt();
			soma = soma + num;
		}
	}
}