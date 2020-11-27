
public class Tempo {
	public static void main(String[] args) {
		int provaTotGiorno = calcolaSecondi(1, 0, 0, 0);
		System.out.println("totale sec: " + provaTotGiorno);
		gghmsDaSec(provaTotGiorno);

		int provaNumInventati = calcolaSecondi(3, 5, 34, 10);
		System.out.println("totale sec: " + provaNumInventati);
		gghmsDaSec(provaNumInventati);
	}
	
	public static int calcolaSecondi(int gg, int h, int m, int s) {
		int totSec = 0;
		int totSecInGG = 86400;
		int totSecInH = 3600;
		int totSecInM = 60;
		
		totSec = gg * totSecInGG + h * totSecInH + m * totSecInM + s;
		return totSec;
	}
	
	public static void gghmsDaSec(int secondi) {
		int gg = 0, h = 0, m = 0, s = 0, resto = 0;
		int totSecInGG = 86400;
		int totSecInH = 3600;
		int totSecInM = 60;

		gg = secondi / totSecInGG;
		resto = secondi % totSecInGG;
		h = resto / totSecInH;
		resto = resto % totSecInH; //resto %= totSecInH
		m = resto / totSecInM;
		s = resto % totSecInM;
		
		System.out.println("gg: " + gg + " h: " + h + " m: " + m + " s:" + s);
	}
}
