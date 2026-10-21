import java.util.Scanner;

public class R217 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 1;
		while (num != 0) {
			num = s.nextInt();
			if (num != 0) {
				if ((num % 2) == 0) {
					System.out.println("DERECHA");
				} else {
					System.out.println("IZQUIERDA");
				}
				;
			}
			;
		}
		;
	};
}