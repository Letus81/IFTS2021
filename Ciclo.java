
public class Ciclo {
	public static void main(String[] args) {
		//commento su singola linea
		/*
		 Commento su linea multipla
		 Commento su una linea
		 commento sulla seconda linea
		 commento sulla terza linea
		 */
		
		int i = 0;
		int q = 50;
		
		//stampare 2 volte ciao
		while(i < q){
			System.out.println("Ciao while");
			i++; //i = i + 1
		}

		
		for(i = 0; i < q; i++)
			System.out.println("Ciao for");
		
		i = 0;
		do {
			System.out.println("Ciao do-while");
			i++;
		}while(i < q);
		
		System.out.println("stampo qualcosa");
		
	}
}
