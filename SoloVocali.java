import java.util.Scanner;

public class SoloVocali {
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase: ");
		String frase = input.nextLine();
		
		System.out.println(estraiVocali(frase));
		
		System.out.println("Lunghezza parole che cominciano con Maiuscola");
		System.out.println(lungParoleMaiusc());*/
		menu();
	}
	
	public static String estraiVocali(String frase) {
		String soloVoc = "";
		
		for(int i = 0; i < frase.length(); i++) {
			char ch = frase.charAt(i);
			
			if (ch == 'a' || ch == 'e' ||
				ch == 'i' || ch == 'o' || ch == 'u')
				soloVoc += ch;
		}
		
		return soloVoc;
	}

	
	//"Albero" 6, "foglia", "Radici" 6 + 6 = 12, "Ramo" 12 + 4 = 16 (e poi "" per finire)
	
	//stampa inserire una nuova parola
	//si memorizza la nuova parola in var di tipo stringa -> Albero
	//se utente ha inserito invio (lunghezza pari a ZERO)
	//  - allora si esce dal ciclo BREAK
	//se il primo carattere della stringa è maiuscola (ch>='A' && ch <='Z')
	// - allora vado a memorizzare la lunghezza str.lenght();

	//stampa inserire una nuova parola
	//si memorizza la nuova parola in var di tipo stringa -> foglia
	//se utente ha inserito invio
	// -  allora si esce dal ciclo
	//se il primo carattere della stringa è maiuscola
	// - allora vado a memorizzare la lunghezza
		
	//stampa inserire una nuova parola
	//si memorizza la nuova parola in var di tipo stringa -> Radici
	//se utente ha inserito invio
	// - allora si esce dal ciclo
	//se il primo carattere della stringa è maiuscola
	// - allora vado a memorizzare la lunghezza
	
	//stampa inserire una nuova parola
	//si memorizza la nuova parola in var di tipo stringa -> Ramo
	//se utente ha inserito invio
	// - allora si esce dal ciclo
	//se il primo carattere della stringa è maiuscola
	// - allora vado a memorizzare la lunghezza
	
	//stampa inserire una nuova parola
	//si memorizza la nuova parola in var di tipo stringa -> INVIO
	//se utente ha inserito invio
	// - allora si esce dal ciclo
	//se il primo carattere della stringa è maiuscola
	// - allora vado a memorizzare la lunghezza
		
	
	public static int lungParoleMaiusc() {
		Scanner in = new Scanner(System.in);
		String parola;
		int lung = 0;
		
		do {
			System.out.println("Inserisci parola:");
			parola = in.nextLine(); //Prova 5
			
			if (parola.length() == 0)
				break;
			
			if (parola.charAt(0) >= 'A' && parola.charAt(0) <= 'Z')
				lung += parola.length();
			
		}while(parola.length() > 0);
		
		in.close();
		
		return lung;
	}
	
	public static void menu() {
		Scanner in = new Scanner(System.in);
		int scelta = 0;
		
		do {
			System.out.println("Scegliere tra le seguenti opzioni ");
			System.out.println("1) login");
			System.out.println("2) saldo");
			System.out.println("3) prelievo ");
			System.out.println("4) bonifico ");
			System.out.println("0) uscire ");
			System.out.print("scelta: ");
			scelta = in.nextInt();

			System.out.println("Hai scelto di fare ");
			switch(scelta) {
			case 1:
				System.out.println("login");
				break;
			case 2:
				System.out.println("saldo");
				break;
			case 3:
				System.out.println("prelievo");
				break;
			case 4:
				System.out.println("bonifico");
				break;
			default:
				System.out.println("Ahoooo stai attento");
				
			}
		}while(scelta > 0/* && scelta <= 4*/);
		
		

	}
}

