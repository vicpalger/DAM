import java.util.Random;

public class Ej67 {
	public static void main(String[] args) {
		Random r = new Random();
		int token = 0, intentos = 0;
		while (token != 1) {
			intentos++;
			token =( (int) (r.nextDouble() * 1500000 + 1));
			System.out.println(intentos);
		}
	}
}
