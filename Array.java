import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int i;
		
		//tipo nome = val;
		int etaAntonio = 39;
		int etaFranc = 12;
		int etaPeppino = 34;
		
		int[] eta = new int[4];
		eta[0] = 34;
		eta[1] = 56;
		eta[2] = 82;
		eta[3] = 22;
		
		System.out.println("Stampa dei valori senza ciclo");

		System.out.println(eta[0]);
		System.out.println(eta[1]);
		System.out.println(eta[2]);

		System.out.println("Stampa dei valori con ciclo for");

		for(i =0; i < eta.length; i++)
			System.out.println(eta[i]);
		
		
		int[] prova = {4, 5, 6, 9, 10};
		//int[] prova = new int[5];
		//prova[0] = 4;
		//prova[1] = 5;
		//prova[2] = 6;
		//prova[3] = 9;
		//prova[4] = 10;
		
		
		
		
		//ho dichiarato un vettore di interi di 3 postazioni
		int[] insnum = new int[3];
		//dichiaro lo scanner per consentire inserimento dati da tastiera
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci i valori numerici per array 10elem");
		//ciclo iterativo che consente per tutti gli elementi vettore di eseguire
		for(i = 0; i < insnum.length; i++) {
			System.out.println("Inserisci il numero di pos " + (i+1));
			//inserimento del numero da tastiera
			//e memorizzarlo all'interno della cella del mio vettore
			//di posizione i (dove i cambia ad ogni iterazione)
			insnum[i] = input.nextInt();
		}
		
		//ciclo iterativo che consente di stampare tutti 
		//gli elementi memorizzati all'interno dell'array
		//salvati nel ciclo precedente
		for(i=0; i < insnum.length; i++)
			System.out.println(insnum[i]);
	
		for(i = 0; i < 3; i++)
			System.out.println("AAAAA");
		
		System.out.println(i); //2 0 1 3
		

		//ciclo per contare da 5 a 12
		for(i = 5; i <= 12; i++)
			System.out.println(i);
		System.out.println("contro all'indietro");
		//contare dal 12 al 7
		for(i=12; i>=7; i--)
			System.out.println(i);
		
	}

}
