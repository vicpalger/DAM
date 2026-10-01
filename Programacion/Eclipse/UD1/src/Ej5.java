
public class Ej5 {

	public static void main(String[] args) {
		double resultadoA = 0 ;
		double resultadoB = 0 ;
		int a = 2 ;
		int b = 3 ;
		int c = 1 ;
		int valor  = ((b*b)-(4*a*c)) ;
		double raiz = Math.sqrt(valor);
		resultadoA = (-b - raiz)/(2*a);
		resultadoB = (-b + raiz)/(2*a);
		System.out.println("El Resultado A = "+resultadoA);
		System.out.println("El Resultado B = "+resultadoB);
	}

}
