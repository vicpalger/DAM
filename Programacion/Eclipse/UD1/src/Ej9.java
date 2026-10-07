
public class Ej9 {

	public static void main(String[] args) {
		int num_ninos   =  50 ;
		int num_ninas   =  50 ;
		int num_total   =  num_ninos +num_ninas;
		double porcentaje1 =  ((double)num_ninas / num_total )*100;
		double porcentaje2 =  ((double)num_ninos / num_total )*100;
		
		
		
		System.out.print("Tenemos matriculados " +num_ninos +" niños y "+ num_ninas +" niñas. En total, tenemos mariculados "+num_total
				+ " alumnos,siendo un "+ porcentaje1 + " perteneciente a los niños y "+ porcentaje2 +" perteneciente a las niñas");
		

	}

}
