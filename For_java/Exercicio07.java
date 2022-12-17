package For_java;

public class Exercicio07 {

	public static void main(String[] args) {
		
		 int resultado = 0;

			
			for(int i = 0; i <= 15; i++) {
			
			resultado = i * 3;

			if(resultado == 0) {
			resultado = resultado + 1;
		}

			System.out.println("3 ^ " + i + " = " +resultado);


		}

	}

}
