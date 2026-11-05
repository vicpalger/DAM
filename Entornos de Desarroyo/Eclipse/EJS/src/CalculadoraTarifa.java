
public class CalculadoraTarifa {
	public static void main(String[] args) {

		int tipoCliente = 2; // 1: Básico, 2: Plata, 3: Oro

		double cuotaBase = 50.0;

		double recargo = 0.0;

		// Error 1: Fíjate bien en el final de esta línea

		if (tipoCliente == 3)
			;
		{

			recargo = 5.0;

		}

		// Error 2: Seguimiento de casos

		switch (tipoCliente) {

		case 1:

			cuotaBase = cuotaBase * 1.10;

			break;

		case 2:

			cuotaBase = cuotaBase * 0.90; // 10% de descuento

		case 3:

			cuotaBase = cuotaBase * 0.80; // 20% de descuento

			break;

		default:

			cuotaBase = 100.0;

		}

		double total = cuotaBase + recargo;

		System.out.println("Total a cobrar: " + total); // Esperábamos 45.0, pero sale 41.0
	}
}
