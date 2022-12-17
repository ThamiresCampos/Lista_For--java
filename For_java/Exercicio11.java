package For_java;

public class Exercicio11 {

	public static void main(String[] args) {

		int fatorial = 1;

		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 1) {

				fatorial = i * fatorial + (i - 1);
				System.out.println("O fatorial dos números ímpares na faixa de 1 a 10 é : " + fatorial);

			}

		}

	}
}
