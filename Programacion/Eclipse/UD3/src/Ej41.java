import java.util.Scanner;

public class Ej41 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, canvio = 0;
		boolean completo = true;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Dame numero 1 ");
			num1 = s.nextInt();
			System.out.println("DAme numero 2 ");
			num2 = s.nextInt();
			if (num1 == num2) {
				System.out.println("El los numeros tinene que ser diferntes");
			}
			;

		} while (num1 == num2);
		if (num2 < num1) {
			canvio = num2;
			num2 = num1;
			num1 = canvio;

		}
		;
		while (completo) {
			System.out.print(num1);
			System.out.print("-");
			num1 = num1 + 7;
			if (num1 >= num2) {
				System.out.print(num2);
				completo = false;
			}
			;
		}
		;
	}

}
