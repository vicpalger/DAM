import java.util.Scanner;

public class VictorPalomares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int precioPlato = 5, suplementoAguacate = 3;
		int cantidadPlatos = 0, precio = 0;
		String nombrePlato = "";
		boolean esta = false;
		System.out.println("Bienvenido a VEGGIE-BAR!");
		System.out.println("PASO1 : PRIMER PLATO");
		System.out.println("¿Cuantos primeros platos tendrá el menú?");
		cantidadPlatos = s.nextInt();
		s.nextLine();
		String[] primerosPlatos = new String[cantidadPlatos];
		int[] primerosPlatosPrecio = new int[cantidadPlatos];
		for (int i = 0; i < primerosPlatos.length; i++) {
			do {
				System.out.println("Introduzca el plato " + (i + 1) + " de " + primerosPlatos.length);
				nombrePlato = s.nextLine();
				String[] sparo = nombrePlato.split(" ");
				for (int j = 0; j < sparo.length; j++) {
					if (sparo[j].equalsIgnoreCase("verduras")) {
						primerosPlatos[i] = nombrePlato;
						esta = true;
					}
				}
				if (esta) {

					System.out.println("Introduzca el precio para " + primerosPlatos[i] + ":");
					primerosPlatosPrecio[i] = s.nextInt();
					s.nextLine();
					System.out.println("Se ha dado de alta el plato " + primerosPlatos[i] + " que cuesta "
							+ primerosPlatosPrecio[i] + "€");
					break;
				} else {
					System.out.println("Ojo este plato no contiene verduras! ");
				}

			} while (true);
			esta = false;

		}
		System.out.println("PASO2 : POSTRES");
		System.out.println("¿Cuantos postres tendrá el menú?");
		cantidadPlatos = s.nextInt();
		s.nextLine();
		String[] postres = new String[cantidadPlatos];
		int[] postresPrecio = new int[cantidadPlatos];
		for (int i = 0; i < postres.length; i++) {
			System.out.println("Introduzca el plato " + (i + 1) + " de " + postres.length);
			nombrePlato = s.nextLine();
			postres[i] = nombrePlato;
			String[] sparo = nombrePlato.split(" ");
			for (int j = 0; j < sparo.length; j++) {
				if (sparo[j].equalsIgnoreCase("aguacate")) {
					esta = true;
				}
			}
			System.out.println("Introduzca el precio para " + postres[i] + ":");
			postresPrecio[i] = s.nextInt();
			s.nextLine();
			if (esta) {
				postresPrecio[i] += 3;
			}
			System.out.println("Se ha dado de alta el plato " + postres[i] + " que cuesta "
					+ postresPrecio[i] + "€");
			esta = false;

		}
	}

}
