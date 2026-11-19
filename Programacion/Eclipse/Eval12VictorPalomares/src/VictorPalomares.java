import java.util.Scanner;

public class VictorPalomares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int precioPostre = 5, suplementoAguacate = 3;
		int[] pedido = new int[2];
		int cantidadPlatos = 0, totalPedido = 0;
		String nombrePlato = "";
		boolean esta = false;

		System.out.println("Bienvenido a VEGGIE-BAR!\n");
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
					esta = false;
					break;
				} else {
					System.out.println("Ojo este plato no contiene verduras! ");
				}
			} while (true);
			esta = false;
		}

		System.out.println("\nPASO2 : POSTRES");
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
			postresPrecio[i] = precioPostre;
			if (esta) {
				postresPrecio[i] += suplementoAguacate;
			}
			System.out.println("Se ha dado de alta el plato " + postres[i] + " que cuesta " + postresPrecio[i] + "€");
			esta = false;

		}

		System.out.println("\nPASO 3 : Se a dado de alta el siguiente menu ...\n");
		System.out.println("PRIMEROS PALTOS");
		for (int i = 0; i < primerosPlatos.length; i++) {
			System.out.println((i + 1) + " : " + primerosPlatos[i] + " .... " + primerosPlatosPrecio[i] + "€");
		}
		System.out.println("\nPOSTRES");
		for (int i = 0; i < postres.length; i++) {
			System.out.println((i + 1) + " : " + postres[i] + " .... " + postresPrecio[i] + "€");
		}

		System.out.println("\nPASO 4 : HACER UN PEDIDO");
		do {
			System.out.println("Introduzca nombre de primer plato:");
			nombrePlato = s.nextLine();
			for (int i = 0; i < primerosPlatos.length; i++) {
				if (primerosPlatos[i].equalsIgnoreCase(nombrePlato)) {
					pedido[0] = i;
					esta = true;
				}
			}
			if (esta) {
				esta = false;
				break;
			} else {
				System.out.println("Ese plato no esta en el menu ...");
			}
			esta = false;
		} while (true);
		do {
			System.out.println("Introduzca nombre del postre :");
			nombrePlato = s.nextLine();
			for (int i = 0; i < postres.length; i++) {
				if (postres[i].equalsIgnoreCase(nombrePlato)) {
					pedido[1] = i;
					esta = true;
				}
			}
			if (esta) {
				esta = false;
				break;
			} else {
				System.out.println("Ese postre no esta en el menu ...");
			}
			esta = false;
		} while (true);
		System.out.println("Primer plato: "+primerosPlatos[pedido[0]]+" .... "+primerosPlatosPrecio[pedido[0]]+"€");
		System.out.println("Poste: "+postres[pedido[1]]+" .... "+postresPrecio[pedido[1]]+"€");
		System.out.println("TOTAL: "+(postresPrecio[pedido[1]]+primerosPlatosPrecio[pedido[0]]));
		System.out.println("Gracias por venir a VEGGIE-BAR !");

	}

}
