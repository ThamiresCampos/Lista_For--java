package For_java;

public class Exercicio10 {

	public static void main(String[] args) {

		int celsius = 10;

		for (int i = 1; i <= 10; i++) {

			int Fah = ((9 * celsius) + 160) / 5;

			celsius = celsius + 10;

			System.out.println(celsius + " ºC" + " = " + Fah + " ºF");
		}

	}
}
