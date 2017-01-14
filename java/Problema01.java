/*
 * Faça um algoritmo que imprima uma tabela
 * com os valores de x e x²
 * para todos os valores de x
 * tais que 1 ≤ x ≤ 30
 */

class Problema01 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 30) {
			System.out.println(i + " " + i*i);
			i = i + 1;	
		}
	}
}