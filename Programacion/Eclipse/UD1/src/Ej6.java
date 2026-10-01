
public class Ej6 {

	public static void main(String[] args) {
		int a = 1; 
		int b = 2;
		int v = 0;
		System.out.println("Al principio del programa, el valor de a es "+a+" y el valor de b es "+b+".");
		v = a;
		a = b;
		b = v;
		System.out.println("Después del intercambio, el valor de a es "+a+" y el valor de b es "+b+".");

	}

}
