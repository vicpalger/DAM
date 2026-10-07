
public class Ej12 {

	public static void main(String[] args) {
		double coste_entrada = 9;
		double coste_palomitas = 6;
		double coste_refresco = coste_palomitas / 2;
		double coste_dulces = Math.pow(coste_refresco, 3);
		double dinero_patricia = coste_entrada + coste_palomitas + coste_refresco + coste_dulces;
		double dinero_elena = coste_entrada + coste_palomitas + coste_refresco + coste_dulces;
		double dinero_oscar = coste_entrada + coste_refresco;
		System.out.print("En total la broma les ha salido por "+ (dinero_patricia+ dinero_elena + dinero_oscar)+" euros.");
	}

}
