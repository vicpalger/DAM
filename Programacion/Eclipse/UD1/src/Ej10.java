
public class Ej10 {

	public static void main(String[] args) {
		double centimetros = 1200;
		double gramos = 1000000;
		double metros = centimetros / 100;
		double Kg = gramos / 1000;
		double IMC = Kg / Math.pow(metros, 2);
		System.out.print("Tu IMC es " + IMC + ".");
	}

}
