import java.util.Scanner;

public class EsempiMetodi {

	public static void main(String[] args) {
		saluto(); //posso invocare più volte i metodi, che siano di classe o di istanza
		saluto(); //metodi di classe, statico
		EsempiMetodi.saluto(); 
		//un metodo di classe può esser invocato con NomeClasse.nomeMetodo(...)
		
		//creo istanza della classe ArrayManipulator per usare il metodo di istanza
		EsempiMetodi nomevar = new EsempiMetodi();
		//invoco il metodo di istanza salutoProva tramite l'oggetto nomevar 
		nomevar.salutoProva();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome:");
		String n = input.nextLine();
		salutoConNome(n); //n parametro attuale
		//salutoConNome("Antonio"); //"Antonio" parametro attuale
		
		//in java, parametri che siano attuali o formali, utilizzano una 
		//notazione posizionale (dipende dalla posizione)
		double area1 = areaRettangolo(4.7, 3.6); //sto invocando/richiamando il metodo
		double area2 = areaRettangolo(3.1, 3.6);
		
		//esempi di invocazione dei metodi usando il loro overload
		//overload del metodo somma, sono stati definiti 6 metodi differenti con lo stesso nome: somma
		int s1 = somma(1, 3);
		
		int[] array = {10, 3, 7, 20, 6, 3};
		int s4 = somma(array);
		
		int[] ar2 = {1, 3};
		int tot = somma(ar2);
		
		//DA SPIEGARE
		float f1 = (float)5.1; 
		
		//double somma(int p1, float p2, double p3)
		double s5 = somma(4, f1, 5.2); //14.3
		System.out.println("s5 = " + s5);
		//double somma(float p2, int p1, double p3)
		double s6 = somma(f1, 4, 5.2); //14.3
		System.out.println("s6 = " + s6);

		//metodo di classe o static ed il prototipo è il seguente
		//public static double sqrt(double x);
		double radice = Math.sqrt(4.0); //2
		System.out.println("radice " + radice);

		//esempio di invocazione dei metodi di istanza
		//prova è una istanza di classe/oggetto
		String prova = "ciao";
		prova.length(); //length è un metodo di istanza, quindi nel prototipo NON DEVE esser presete la parola static 
		
		//ogni metodo di istanza esegue le operazioni sull'istanza stessa
		String prova1 = "altra stringa";
		prova1.length();		
	}

	//sto dichiarando/definendo un metodo
	public static double areaRettangolo(double base,double altezza){
		double area = base * altezza;
		return area;
	}
	
	//overload
	public static int areaRettangolo(int base, int altezza) {
		return base*altezza;		
	}
	
	public static int somma(int p1, int p2) {
		return p1 + p2;
	}
	
	public static double somma(int p1, float p2, double p3) {
		System.out.println("Prima somma");		
		System.out.println("somma(int p1, float p2, double p3)");
		return p1 + p2 + p3;
	}
	
	public static double somma(float p2, int p1, double p3) {
		System.out.println("Seconda somma");		
		System.out.println("somma(float p2, int p1, double p3)");
		return p1 + p2 + p3;
	}
	
	public static int somma(int p1, int p2, int p3, int p4) {
		return p1 + p2 + p3 + p4;
	}

	public static int somma(int[] p) { //p = {3, 4, 1}
		int ris = 0;
		
		for(int i =0; i< p.length; i++)
			ris += p[i]; //ris = ris + p[i];
		
		return ris;
	}
	
	public static double somma(double[] p) {
		return 0.0;
	}

	public static void saluto() {
		System.out.println("Ciao");
		System.out.println("come");
		System.out.println("stai?");
	}

	//ATTENZIONE non posso duplicare metodi con la stessa
	//FIRMA
	//public static void saluto() {	
	//}
	
	//nome parametro formale di tipo Stringa
	public static void salutoConNome(String nome) {
		System.out.println("Ciao " + nome);
	}
	
	//metodo di istanza/ NON STATICO infatti la parola static non è presente
	void salutoProva() {
		System.out.println("salutoProva");
	}
	
	void spiegazione(String argo) {
		
	}
	
	//ATTENZIONE ERRORE DA NON FARE
	//ATTENZIONE ERRORE DA NON FARE
	//ATTENZIONE ERRORE DA NON FARE
	//ATTENZIONE ERRORE DA NON FARE
	//ATTENZIONE ERRORE DA NON FARE
	//void metodo1() {
	//	void metodo2() { //ASSOLUTAMENTE NOOOOO i metodi vanno definiti all'esterno dei metodi
			//un metodo si dichiara, si implementa e si chiude
			//una volta dichiarato si può invocare più volte da un determenato metodo
			
	//	}
	//}
	
}
