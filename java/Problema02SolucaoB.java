/*
 * Faça um algoritmo que leia vários pares
 * de números e imprima a soma de cada par
 */

import java.util.Scanner;

class Problema02SolucaoB {
	public static void main(String ... args) {
		Scanner entrada = new Scanner(System.in);

		int cont = 1;
		while (cont <= 30) {
			int a = entrada.nextInt();
			int b = entrada.nextInt();
			System.out.println(a+b);
			cont = cont + 1;
		}
	}
}
