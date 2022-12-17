package For_java;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Dígite um número: ");
		int numero = sc.nextInt();	 

		
		for (int contadora = 1; contadora <= 10; contadora++) {
		System.out.println(numero + " X " + " i " + " = " + contadora);}

		sc.close();

	}

}
