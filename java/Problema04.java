/*
 * Faça um algoritmo que leia um único número do
 * teclado e imprima apenas se ele for positivo
 * se não for imprimir a mensagem "número inválido"
 */

import java.util.Scanner;

class Problema04 {
	public static void main(String ... args) {
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		if (a > 0)
			System.out.println(a);
		else
			System.out.println("Número inválido");
	}
}