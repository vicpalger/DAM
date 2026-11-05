
public class MatrizCoordenadas {

	public static void main(String[] args) {
		int sumaTotal = 0;

		int crucesCriticos = 0;

		for (int fila = 1; fila <= 15; fila++) {

			for (int col = 1; col <= 15; col++) {

				int valorCelda = (fila * 3) - (col * 2);

				sumaTotal += valorCelda;

				if (valorCelda == 0) {

					crucesCriticos++;

					sumaTotal = sumaTotal / 2; // <-- BREAKPOINT A

				}

			}
		}
	}
}
