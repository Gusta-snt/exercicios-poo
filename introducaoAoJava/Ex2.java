/*
	Aluno: Gustavo Ferrera dos Santos
	Matrícula: 202201628
*/

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] numeros = new double[10];
		int i;

		System.out.printf("Digite %d números:\n", numeros.length);
		for(i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextDouble();
		}
		double media = calcula_media(numeros);

		System.out.printf("A média é: %,.2f\n", media);

		scanner.close();
	}

	public static double calcula_media(double numeros[]) {
		int i;
		double media, soma = 0;
		for(i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		media = soma / numeros.length;
		return media;
	}

}
