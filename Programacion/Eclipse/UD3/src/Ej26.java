import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		final double gasto_envio = 3.25, coste_bordado = 2.50, coste_m2 = 0.01;
		double total = 0, altura = 0, anchura = 0, m2 = 0;
		boolean bordado = false;
		char respuesta = ' ';
		String concepto = "Sin bordado: \t\t0,0€";

		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Introduzca la altura deeseada(cm):");
			altura = s.nextDouble();
			System.out.println("Introduzca la anchura deeseada(cm):");
			anchura = s.nextDouble();
			if (altura <= 0 || anchura <= 0)
				System.out.println("Medidas incorrectas (<= 0 )");

		} while (altura <= 0 || anchura <= 0);
		s.nextLine();
		m2 = altura * anchura;
		do {
			System.out.println("Desea usted el escudo bordado (s/n)");
			respuesta = s.nextLine().charAt(0);
			System.out.println(respuesta == 's');
			if (respuesta == 's' || respuesta == 'S') {
				bordado = true;
				concepto = "Con Bordado\t\t" + coste_bordado + "€";
			}
		} while (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N');
		total = (m2 * coste_m2) + gasto_envio;
		if (bordado)
			total = total + coste_bordado;

		System.out.println("Gracias. Aqui tienes el desglosde de su compra ");
		System.out.println("Bandera de " + m2 + "cm2\t" + (m2 * coste_m2) + "€");
		System.out.println(concepto);
		System.out.println("Gastos de envio:\t" + gasto_envio + "€");
		System.out.println("Total:\t\t\t" + total + "€");
		System.out.println("");

	}
}
