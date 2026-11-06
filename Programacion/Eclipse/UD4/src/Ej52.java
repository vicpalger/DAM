import java.util.Random;

public class Ej52 {

	public static void main(String[] args) {
		Random r = new Random();
		int num1 = 0, num2 = 0, cont = 1;
		System.out.println("Vamos a tirar dados:");
		do {
			num1 = (int)(r.nextDouble()*6 +1);
			num2 = (int)(r.nextDouble()*6 +1);
			System.out.println("En la tiradsa "+ cont + " ha salido "+num1 +" y el "+ num2);
			cont ++;
		} while (num1 != num2);
		System.out.println("Al fin an salido iguales !!");
		
	}

}
