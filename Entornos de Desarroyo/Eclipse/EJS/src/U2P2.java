
public class U2P2 {

	public static void main(String[] args) {
		int codigo = 15; 
        int contadorEspecial = 0; 
        for (int i = 1; i <= 2000; i++) { 
            if (i % 4 == 0 && i % 6 != 0) { 
                codigo += 3; 
            } else if (i % 11 == 0) { 
                codigo -= 5; 
                contadorEspecial++; // <-- PONER BREAKPOINT AQUÍ 
            } else { 
                codigo += 1; 
            } 
        } 

        System.out.println("Código final: " + codigo); 

     

	}

}
