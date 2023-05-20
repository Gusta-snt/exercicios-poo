/*
	Aluno: Gustavo Ferrera dos Santos
	Matrícula: 202201628
*/

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite três números: ");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();

		System.out.printf("A média é: %,.2f\n", calcula_media(num1, num2, num3));

		scanner.close();
	}

	public static double calcula_media(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}

}
