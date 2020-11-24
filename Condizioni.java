import java.util.Scanner;

public class Condizioni {
	
	public static void main(String [] args) {		
		int eta = 50;	//-10	
		
		
		//modalità 1
		if (eta >= 0 && eta < 3) {
			if (eta == 0)
				System.out.println("Sei appena nato");

			if (eta == 1)
				System.out.println("Sei un neonato");
			
			if (eta == 2)
				System.out.println("vai asilo nido");
		}
		else { //se non è bambino
			if (eta >= 3  && eta <= 18) //eta è compreso tra 10 e 18
				System.out.println("Sei un ragazzino");
			else if (eta > 18)
				System.out.println("Sei adulto");
			
			else 
				System.out.println("valore non consentito");
			
		}

		//modalità 2
		eta = 4;
		if (eta < 0)
			System.out.println("valore non valido");

		if (eta == 0)
			System.out.println("Sei appena nato");

		if (eta == 1)
			System.out.println("Sei un neonato");
		
		if (eta == 2)
			System.out.println("vai asilo nido");
		
		if (eta >= 3  && eta <= 18) //eta è compreso tra 10 e 18
			System.out.println("Sei un ragazzino");
		
		if (eta > 18)
			System.out.println("Sei adulto");
		
		//modalità 3
		switch(eta) {
		case 0:
			System.out.println("Sei appena nato");
			break;
		case 1:
			System.out.println("Sei un neonato");
			break;
		case 2:
			System.out.println("vai asilo nido");
			
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Sei un ragazzino");
			break;
			
		default:
			System.out.println("Sei adulto");
		}
		
		//modalità 4
		eta = 1;
		if (eta >= 0 && eta < 3) {
			switch(eta) {
			case 0:
				System.out.println("Sei appena nato");
				break;
			case 1:
				System.out.println("Sei un neonato");
				break;
			case 2:
				System.out.println("vai asilo nido");
			}
		}
		else {
			if (eta >= 3  && eta <= 18) //eta è compreso tra 10 e 18
				System.out.println("Sei un ragazzino");
			
			if (eta > 18)
				System.out.println("Sei adulto");
		}
		
	}	

}
