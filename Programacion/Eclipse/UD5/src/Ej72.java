
public class Ej72 {
	public static void main(String[] args) {
		System.out.println(earea51("Estoy en el poligono industrial del Area51"));
	}

	public static String earea51(String x) {
		int num = 0;
		boolean paso = true;
		String cripto = "";
		num = x.indexOf("area51");
		for (int i = 0; i < x.length(); i++) {
			if (i <= num - 1 || i >= num + 6) {
				cripto += String.valueOf(x.charAt(i));
			} else if (paso) {
				cripto += "murcia";
				paso = false;
			}
			;
		}
		return cripto;
	}
}
