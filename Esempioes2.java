package lezione2Adecco;

import java.util.Scanner;

public class Esempioes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
				Scanner key = new Scanner(System.in);
				
				System.out.println("inserisci una stringa");
				
				String parolaUtente = key.nextLine();
				
				System.out.println("hai scritto " + parolaUtente);
				
				
				int range = parolaUtente.length() -1 ;
				
				
				System.out.println("il tuo range va da 0 a  " + range);
				System.out.println("il tuo range va da 0 a  " +  (parolaUtente.length() -1 ));

				
				System.out.println("inserisci un numero");
				
				int numeroUtente = key.nextInt();
				
				char myChar = parolaUtente.charAt(numeroUtente);
				System.out.println("hai selezionato " + myChar);
				System.out.println("hai selezionato " + parolaUtente.charAt(numeroUtente));

				
				
				
				key.close();
			

	}

}


