import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// Variables
		Scanner s = new Scanner(System.in);
		String Nombre = "", NIF = "", Domicilio = "", Concepto = "", Concepto2 = "", Concepto3 = "", Concepto4 = "",
				Concepto5 = "";

		int Cant = 0, Cant2 = 0, Cant3 = 0, Cant4 = 0, Cant5 = 0;

		double Descuento = 0, Precio = 0, Precio2 = 0, Precio3 = 0, Precio4 = 0, Precio5 = 0, Total = 0;

		// DAtos
		System.out.println("Introduzca Nombre:");
		Nombre = s.nextLine();

		System.out.println("Introduzca NIf:");
		NIF = s.nextLine();

		System.out.println("Introduzca Domicilio:");
		Domicilio =  s.nextLine();
		 

		// productos

		System.out.println("\tIntroduzca Descuento");
		Descuento = s.nextDouble();
		s.nextLine();
		System.out.println("\tProducto 1");
		System.out.println("Introduzca Nombre");
		Concepto = s.nextLine();
		
		System.out.println("Introduzca Precio");

		Precio = s.nextDouble();
		
		System.out.println("Introduzca Cantidad");
		Cant = s.nextInt();
		s.nextLine();

		System.out.println("\tProducto 2");
		System.out.println("Introduzca Nombre");
		Concepto2 = s.nextLine();

		System.out.println("Introduzca Precio");
		Precio2 = s.nextDouble();
		
		System.out.println("Introduzca Cantidad");
		Cant2 = s.nextInt();
		s.nextLine();

		System.out.println("\tProducto 3");
		System.out.println("Introduzca Nombre");
		Concepto3 = s.nextLine();
		
		System.out.println("Introduzca Precio");
		Precio3 = s.nextDouble();
		
		System.out.println("Introduzca Cantidad");
		Cant3 = s.nextInt();
		s.nextLine();

		System.out.println("\t Producto 4");
		System.out.println("Introduzca Nombre");
		Concepto4 = s.nextLine();

		System.out.println("Introduzca Precio");
		Precio4 = s.nextDouble();

		System.out.println("Introduzca Cantidad");
		Cant4 = s.nextInt();
		s.nextLine();

		System.out.println("\tProducto 5");
		System.out.println("Introduzca Nombre");
		Concepto5 = s.nextLine();
	
		System.out.println("Introduzca Precio");
		Precio5 = s.nextDouble();
	
		System.out.println("Introduzca Cantidad");
		Cant5 = s.nextInt();
		s.nextLine();
		Total = Precio+Precio2+Precio3+Precio4+Precio5;


		System.out.println("Clinete: " + Nombre + "\t NIF:" + NIF);
		System.out.println("Domicilio:" + Domicilio);
		System.out.println("--------------------------------------------------------");
		System.out.println("Cantidad\tConcepto-Referencia\tPrecio\tImporte");
		System.out.println(Cant  + "\t\t" + Concepto  + "\t\t\t" + Precio  + "€\t" + (Cant  * Precio)  + "€ ");
		System.out.println(Cant2 + "\t\t" + Concepto2 + "\t\t\t" + Precio2 + "€\t" + (Cant2 * Precio2) + "€ ");
		System.out.println(Cant3 + "\t\t" + Concepto3 + "\t\t\t" + Precio3 + "€\t" + (Cant3 * Precio3) + "€ ");
		System.out.println(Cant4 + "\t\t" + Concepto4 + "\t\t\t" + Precio4 + "€\t" + (Cant4 * Precio4) + "€ ");
		System.out.println(Cant5 + "\t\t" + Concepto5 + "\t\t\t" + Precio5 + "€\t" + (Cant5 * Precio5) + "€ ");
		System.out.println("\t\t TotalBruto: "+Total+"€ Desvuento "+Descuento+"% Total"+(Total-(Total*Descuento/100))+"€ ");
	}
}
