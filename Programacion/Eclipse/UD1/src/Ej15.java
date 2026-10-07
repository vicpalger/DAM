import java.util.*;

public class Ej15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 1;
		int y = 1;
		System.out.print("Dame dijito x \n");
		x = s.nextInt();
		System.out.print("Dame dijito y \n");
		y = s.nextInt();
		System.out.println("\t\t\t SUMA\tResta\tProducto \t Cociente");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("X=" + x + "Y=" + y + "\t\t\t  " + (x + y) + "\t  " + (x - y) + "\t   " + (x / y) + "\t             " + (x * y));
		System.out.println("--------------------------------------------------------------------");
		
	}

}
