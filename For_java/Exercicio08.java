package For_java;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor da base: ");
		int base = sc.nextInt();
		System.out.println();

		System.out.println("Insira o valor do expoente: ");
		int expoente = sc.nextInt();
		System.out.println();

		int resultado = 1;

		for (int i = 1; i <= expoente; i++) {

			resultado = base * resultado;

			System.out.println(resultado + " ^ " + expoente + " = " + resultado);

		}

		sc.close();
	}
}
