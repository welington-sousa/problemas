/*
 * Faça um algoritmo que leia um único número do
 * teclado e imprima apenas se ele for positivo
 */

import java.util.Scanner;

class Problema03 {
	public static void main(String ... args) {
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		if (a > 0)
			System.out.println(a);
	}
}