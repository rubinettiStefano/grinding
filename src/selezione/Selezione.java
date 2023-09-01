package selezione;

import java.util.Scanner;

import entity.Persona;

public class Selezione 
{
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		//SELEZIONE -> decidere quali righe eseguire
		
		//IF
		//il più generico e versatile
		
		//Possiamo avere 1 else per IF
		//ma è opzionale
		//Sinonimi di CONDIZIONE: boolean - predicato
		//se il booleano è vero eseguiamo blocco di verità
		//se è falso blocco di falsità
		
		//Possiamo ottenere il valore della condizione:
		
		//Passando direttamente un booleano
		//boolean a = keyboard.nextLine().equals("yes");
		
//		if(a)
//		{
//			//facciamo cose
//		}
		
		//Fare un espressione booleana con OPERATORI BOOLEANI
		//== , !=, >, < , >=, <=           !(inverter)
		
		//>, < , >=, <= SOLO CON I NUMERI 
		//restituisco il risultato di un confronto numerico
		//boolean b =  Integer.parseInt(keyboard.nextLine())>9;
		//== , != sia con numeri che con oggetti
		//== e != FANNO UN CONFRONTO DI INDIRIZZO tra gli oggetti
		
		Persona p1 = new Persona();
		p1.nome = "Stefano";     
		p1.cognome = "Rubinetti";
		Persona p2 = new Persona();
		p2.nome = "Stefano";     
		p2.cognome = "Rubinetti";
		
		//p1 si riferisce alla persona con id 28
		//p2 anche
		
		boolean c =  p1 == p2;//avremo TRUE
		
		Persona p3 = new Persona();
		//p3.nome -> null
		boolean d = p3.nome==null;
		
		boolean e;
		
		//fare controllo di esistenza
		if(p3.nome!=null)
			e = p3.nome.equals("ciao");
		
		
		//CONNETTORI BOOLEANI
		//&& AND -> è true se entrambe le sottocondizioni sono true, false in ogni altro caso
		//|| OR  -> è true se almeno una sottocondizione è true
		//Ho DETTO UNA CASTRONERIA.
		//l'ordine seguito nelle espressioni booleane in JAVA è:
		//PARENTESI, come nelle espressioni algebriche
		//AND, come le moltiplicazione e le divisioni nelle espressioni algebriche
		//OR, come le addizioni/sottrazioni nelle espressioni algebriche
		
		//1 + 10 * 2 -> 21, perchè fa prima 10*2 e poi lo somma ad 1
		//true || false && true, prima fa l'AND, quindi false && true-> false
		//poi fa true || false -> true
		
		
		
		//ESPRESSIONE -> QUALUNQUE cosa produca un valore
		
		boolean condizioneA = false;
		boolean condizioneB = false;
		boolean condizioneC = false;
		boolean condizioneD = false;
		boolean condizioneE = true;
		
		//sbagliata, BRUTTA, non facile da leggere
		boolean f = 	(condizioneA && condizioneB)		|| 
						(condizioneC && condizioneD)		|| 
						condizioneE							;
		
		
		//Un utilizzo classico dell'OR esterno è la validazione per FALSIFICAZIONE
//		boolean isValid()
//		{
//			return 	proprietaA != null 					&&
//					(proprietaB<=50 || proprietaB>100)	;	
//					
//		}
		
//		if(condizione)
//		{
//			//blocco di verità
//		}
//		else
//		{
//			//blocco di falsità
//		}
		
		//OPERATORE TERNARIO
		//if in linea
		//il suo compito è quello di scegliere tra 2 valori in base ad una condizione
		int valoreV = 10;
		int valoreF = 15;
		int a = condizioneA ? valoreV : valoreF;
		
		if(condizioneA)
			a = valoreV;
		else
			a = valoreF;
		
		//SWITCH
		//Osserva con fare minaccioso il valore di una variabile
		//la variabile osservata deve avere valori DISCRETI
		//decide che CASE eseguire in base al valore della variabile
		int variabileOsservata= 0;
		
		switch(variabileOsservata)
		{
			case 1:
				//codice da eseguire se variabileOsservata VALE a
			break;
			case 2:
				//codice da eseguire variabileOsservata VALE b
			break;
			default:
				//codice da eseguire variabileOsservata non vale nessuno dei precedenti
		}
		
		if(variabileOsservata>1)
		{
			//codice da eseguire se variabileOsservata VALE a
		}
		else
			if(variabileOsservata==2)
			{
				//codice da eseguire variabileOsservata VALE b
			}
			else
			{
				//codice da eseguire variabileOsservata non vale nessuno dei precedenti
			}
		
																																													
	}
}
