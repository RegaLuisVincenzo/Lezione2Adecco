package lezione2Adecco;

import java.util.Scanner;

public class Esecizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * creare un programma che prende input 
		 * due stringhe utilizzando la tastiera 
		 * 
		 * esiste un metono che si chiama nextline
		 * 
		 * stampare video la grandzza delle due stringhe (caratteri) il primo carattere delle due stringhe 
		 * stranpare a video la stringa tutta in maiuscalo 
		 * 
		 */
		//crea un programma che prende input due stringhe utilizzanod la tastiera 
		Scanner stampante= new Scanner(System.in);
		String  text, text1 ;
	
		System.out.println("inserisci 2 parole");
		
		text = stampante.nextLine();
		text1 = stampante.nextLine();
		
		System.err.println("ok hai scritto "+ text+" "+text1);
		/*
		 * System.out.println(text.trim().length());
		 * System.out.println(text.charAt(0));
		 * 
		 * System.err.println("CARATTERE:"+text+" SONO "+text.length());
		 * System.out.println("PRIMA LETTERA "+text+" è "+ text.charAt(0));
		 * 
		 * System.out.println(text.toUpperCase());
		 * 
		 */
		System.out.println("I caratteri di "+text.toUpperCase()+" sono: "+text.length()+" E la prima lettera è "+text.toUpperCase().charAt(0));
		/*
		 * System.out.println(text1.trim().length());
		 * System.out.println(text1.charAt(0));
		 * 
		 * System.err.println("CARATTERE:"+text1+" SONO "+text1.length());
		 * System.out.println("PRIMA LETTERA "+text1+" è "+ text1.charAt(0));
		 * 
		 * System.out.println(text1.toUpperCase());
		 */
		System.out.println("I caratteri di "+text1.toUpperCase()+" sono: "+text1.length()+" E la prima lettera è "+text1.toUpperCase().charAt(0));

		stampante.close();
		
	}

}
