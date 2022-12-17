package For_java;

public class Exercicio09 {

	public static void main(String[] args) {

		int resultado = 0;
		int anterior = 1;
		int primeiro = 0;

		for (int i = 1; i <= 15; i++) {

			resultado = primeiro + anterior;

			System.out.println(resultado);

			primeiro = anterior;
			anterior = resultado;

		}

	}
}
