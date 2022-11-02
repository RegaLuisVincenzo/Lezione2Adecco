package lezione2Adecco;

import java.util.Scanner;

public class IfEElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			Scanner key=new Scanner(System.in);
			System.out.println("inserisci 2 numeri ");
			
			int numero1, numero2 ;
			numero1=key.nextInt();
			numero2=key.nextInt();
			System.out.println("hai scritto " +numero1+" "+ numero2);
			
			// if indica che "SE" non che una cosa c'è l'altra  
			if(numero1>numero2) {
				System.out.println("sono nel blocco if");
				System.out.println(numero1);
			} else {
				System.out.println("sono nel blocco else");
				System.out.println(numero2);
			}//else va a indicare l'altra scelta  
			
			System.out.println("FINE");
			key.close();
			
			Scanner life=new Scanner(System.in);
			System.out.println("inserisci 4 numeri");
			
			String parola1 , parola2, parola3, parola4;
			
			parola1=life.nextLine();
			parola2=life.nextLine();
			parola3=life.nextLine();
			parola4=life.nextLine();
			
			int n1= parola1.length(),n2= parola2.length(), n3=parola3.length(), n4=parola4.length();
			

	}

}
