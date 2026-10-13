import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int aaaa = 0, mm = 0, dd = 0, retraccion = 0;
		double salario_bruto = 0, salarion_neto = 0;
		String nombre = "", direccion = "", NIF = "";
		System.out.println("Introduzca Nombre: ");
		nombre = s.nextLine();
		System.out.println("Introduzca Direccion: ");
		direccion = s.nextLine();
		System.out.println("Introduzca NIF: ");
		NIF = s.nextLine();
		System.out.println("Introduzca Fecha de Naciminebto aaaa/mm/dd ");
		aaaa = s.nextInt();
		mm = s.nextInt();
		dd = s.nextInt();
		System.out.println("Introduzca Salario Bruto : ");
		salario_bruto = s.nextDouble();
		System.out.println("Introduzca Retraccion: ");
		retraccion = s.nextInt();
		salarion_neto = salario_bruto - ((salario_bruto*retraccion)/100);
		System.out.println("INFORME TRABAJADOR");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Nombre........................:" + nombre);
		System.out.println("Direccion.....................:" + direccion + "\n");
		System.out.println("NIF...........................:" + NIF);
		System.out.println("Fecha de nacimiento...........:" + dd + "del mes" + mm + "del" + aaaa + "\n");
		System.out.println("Salario Bruto.................:" + salario_bruto);
		System.out.println("Redencion.....................:" + retraccion + "%");
		System.out.println("Salarion Neto.................:"+salarion_neto);

	}

}
