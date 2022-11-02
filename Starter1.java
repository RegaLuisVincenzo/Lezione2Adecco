package lezione2Adecco;

public class Starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * DATO PRIMITIVO-è complesso
		 * 
		 * tipi base primitivi
		 * 
		 * byte - short- int- long
		 * 
		 * float double
		 * 
		 * char
		 * 
		 * boolean
		 */
		
		/*
		 * TIPO DI DATO NON PRIMITIVO- è meno complesso
		 * 
		 * Scanner
		 * Scanner keyboard ( i nomi delle variabili vanno sempre in minuscolo)
		 * 
		 * 
		 */
		/*
		 * oggi andiamo a vedere come si vede una stringa  e come si crea( non primitiva)
		 */
		
		/*
		 * Procedura:
		 * 
		 * String myName; ( ha sempre un valore , ma all'inizio viene chiamato "null"
		 * 
		 * stringa vuota - senza caratteri
		 * 
		 * concetto di null è senza valore o adti particolari 
		 * 
		 * ogni stringa conosce i propri caratteri e lunghezza
		 * 
		 * son
		 */
		/*
		 * 
		 * char è un solo carattere 
		 * String più caratteri 
		 */
		
		String myName ="Vincenzo  ";
		String surname ="Vz";
		System.out.println(myName+" "+ surname );
		System.out.println(myName.charAt(0));
		System.out.println(myName.charAt(1));
		System.out.println(myName.charAt(2));
		System.out.println(myName.charAt(3));
		
		System.out.println(myName.trim().length());// con questo codice chiediamo solo di leggere i caratteri de come senza leggere gli spazzi 
		
		System.out.println(myName.length());// questo dichiara anche gli spazzi
		/* andiamo a prednere la prima lettere adel mio nome
		 * 
		 *  charAT(andimao dichiarare la posizione delle stringa da 0 a 99 , anche -1 ) 
		 */
		
		String example="luis";
		String iniziali="ls";
		
		System.out.println(example+" "+iniziali);
		System.out.println(example.trim().length());
		System.out.println(example.charAt(0)+" "+example.charAt(1)+" "+example.charAt(2));
		
		
		/*
		 * nostazione con punto 
		 * 
		 * far si che la stringa riconosce i numeri dei caratteri del nome 
		 * 
		 * "soggetto.nomeAzione"(ogni soggetto ha una azione diversa pertanto si deve descrivere l'azione 
		 * 
		 * lengt è una sequenza di caratteri 
		 * 
		 * trim andiamo a chidere di leggere solo i numeri 
		 */
		
		//possimao creare una nuova variabile e dichiarare che non vogliamo gli spazzi 
		
		String soprannome= "zioorsetto" ;
		String myNameWithNoSpace= soprannome.trim();
		
		System.out.println(myNameWithNoSpace.trim());
		//esempio
		
		String exampleString="ciaociao";
		
		exampleString= exampleString.trim(); 
		
		System.out.println(exampleString.trim());


		}
		
	}

