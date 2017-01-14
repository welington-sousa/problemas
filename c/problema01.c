/*
 * Faça um algoritmo que imprima uma tabela
 * com os valores de x e x²
 * para todos os valores de x
 * tais que 1 ≤ x ≤ 30
 */

# include <stdio.h>

int main() {

	int i = 1;
	while (i <= 30) {
		printf("%u ", i);
		printf("%u\n", i*i);
		i = i + 1;
	}
}