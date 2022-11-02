package lezione2Adecco;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key= new Scanner(System.in);
		System.out.println("INSERISCI 2 STRINGHE");
		
		String casa, macchina;
		casa=key.nextLine();
		macchina=key.nextLine();
		int numero1= casa.length();
		int numero2= macchina.length();
		
		
		if(numero1>numero2) {
			System.out.println("sono nel blocco piccolo");
			System.out.println(casa);
		} 
		else {
			System.out.println("sono nel blocco grande");
			System.out.println(macchina);
		}
		
		key.close();
		
	}

}
