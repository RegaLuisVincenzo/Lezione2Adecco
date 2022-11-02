package lezione2Adecco;

import java.util.Scanner;
public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key= new Scanner(System.in);
		System.out.println("inseriri numero");
		int minuti = key.nextInt();
		
		if(minuti > 0){
			int second=(minuti*60);
			System.out.println("MINUTI "+minuti+" "+"secondi"+second);
		
		}
		else {
			System.out.println("errore");
			
		}
			
			key.close();
	}

}
