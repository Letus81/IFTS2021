
public class Stringa {

	public static void main(String [] args) {
		String nome = "Antonio";
		char ch = nome.charAt(5);

		System.out.println(ch);
		
		int lung = nome.length();
		
		System.out.println("Quanto è lunga la stringa Antonio?");
		System.out.println(lung);
		

		System.out.println("Eseguo la stmapa dei singoli caratteri usando");
		System.out.println("do-while");
		int i = 0;
		do {
			char c = nome.charAt(i);
			System.out.println(c);
			i++;
		}while(i < lung);
		
		System.out.println("while");
		i = 0;
		while(i < lung) {
			char c = nome.charAt(i);
			System.out.println(c);
			i++;
		}
		
		System.out.println("for");
		for(i = 0; i < lung; i++){
			char c = nome.charAt(i);
			System.out.println(c);
		}
	}
}
