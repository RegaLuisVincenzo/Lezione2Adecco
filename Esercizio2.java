package lezione2Adecco;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * creare un programma che prenda la tastira una stringa
		 * 
		 * stampa un video la stringa e gli index possibile
		 * 
		 * e poi prende un numero intero sempre da tastiera e stampa a video ill carattere la posizione 
		 * di quel numero 
		 * 
		 */
		
		//1-crea un programma che prenda la tastiera in un stringa
		Scanner video= new Scanner(System.in);
		System.out.println("INSERISCI VIDEO");
		
		//2-stampa un video la stringa e gli index possibile
		String text= video.nextLine();
		System.out.println("hai scritto "+text);
		
		//prendi un numero intero della tastiera 
		int range = text.length()-1; 
		System.out.println("il tuo rang va da 0 a"+range);
		// stampa a video il carattere di quei numeri
		System.out.println("il tuo range va da 0 a"+(text.length()-1));
		
		System.out.println("inserisci i numeri");
		
		int numero = video.nextInt();
		
		text.charAt(numero);
		System.out.println("hai selezionato"+text);
		System.out.println("hai selezionat"+text);
		
		//char myChar = text.charAt(numero);
		//System.out.println("hai selezionato " + myChar);
		//System.out.println("hai selezionato " + text.charAt(numero));

		video.close();
	}

}
