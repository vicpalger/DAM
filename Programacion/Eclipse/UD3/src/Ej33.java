import java.util.function.Function;

public class Ej33 {

	public static void main(String[] args) {
		int num = 90, secuencia = 0;
		for (int i = 1; i <= num; i++) {
			secuencia = i;
			while (secuencia <= num) {
				System.out.println("Par " + i + "," + secuencia + " : " + i + " + " + secuencia + " + 2 * " + i + " * "
						+ secuencia + " = " + (i + secuencia + 2 * i * secuencia));
				secuencia++;

			}
			;
		}
		;
	}

}
