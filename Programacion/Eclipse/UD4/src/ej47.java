
public class ej47 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int total = 0, cont = 1;
		for (int i = 0; i < num.length; i++) {
			num[i] = cont;
			total += cont;
			if (cont < 10)
				System.out.print("  " + cont + " ");
			else
				System.out.print(" " + cont + " ");
			if (cont % 10 == 0)
				System.out.println("");
			;
			cont++;
		}
		System.out.println("La media es "+ total/num.length );
	}

}
