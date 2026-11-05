
public class NotaFinal {
	public static void main(String[] args) {

		int aciertos = 17;

		int totalPreguntas = 20;

		int puntosExtra = 1;

		// El alumno espera sacar un (17/20)*10 + 1 = 9.5

		double nota = (aciertos / totalPreguntas) * 10.0 + puntosExtra;

		System.out.println("Tu nota final es: " + nota); // ¡Imprime 1.0!

	}

}
