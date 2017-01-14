/*
 * Faça um algoritmo que leia vários pares
 * de números e imprima a soma de cada par
 */

import java.util.Scanner;

class Problema02SolucaoA {
	public static void main(String ... args) {
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();
		while (a != 0 || b != 0) {
			System.out.println(a+b);
			a = entrada.nextInt();
			b = entrada.nextInt();
		}
	}
}
