import java.util.Scanner;

public class Ej40 {

	public static void main(String[] args) {
		double num = 0, total = 0;
		int cant = 0;
		Scanner s = new Scanner(System.in);
		while (num >= 0) {
			System.out.println("Dame nota ;");
			num = s.nextDouble();
			if (num >= 0) {
				total = total+num;
				cant++;
			}
			;
		}
		;
		total = total / cant;
		System.out.println("La media es " + total);
	}

}
