package tema2;
import java.util.Scanner;
public class Ejerciciopenasoriana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iTotal=0, iMax=Integer.MIN_VALUE, iMin=Integer.MAX_VALUE;
		int iDiaMax=0, iDiaMin=0, iRecaudado=0;
		System.out.print("Introduce la recaudación de Martes a Domingo");
		for (int i=2; i<=7; i++) {
			System.out.print("\nLa recaudación del "+diaSemana(i)+":");
			iRecaudado=sc.nextInt();
			if (iRecaudado >= iMax) {
				iMax=iRecaudado;
				iDiaMax=i;
			}
			else if (iRecaudado < iMin){
				iMin=iRecaudado;
				iDiaMin=i;

			}
		}
		System.out.print("El mejor día fue el: "+diaSemana(iDiaMax)+" con "+iMax+"€ , el peor fue el "+diaSemana(iDiaMin)+" con "+iMin+"€");
	}
	private static String diaSemana(int i) {
		String sSol="";
		switch(i) {
		case 1 ->
			sSol  = "Lunes";
		case 2 ->
			sSol  = "Martes";
		case 3 ->
			sSol  = "Miercoles";
		case 4 ->
			sSol  = "Jueves";
		case 5 ->
			sSol  = "Viernes";
		case 6 ->
			sSol  = "Sabado";
		case 7 ->
			sSol  = "Domingo";
		default -> 
			sSol = "Ese día no es válido";
			
		}
		return sSol;
	}
	
}
