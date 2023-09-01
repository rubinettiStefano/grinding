package variabili;

import entity.Persona;

public class Oggetti 
{
	public static void main(String[] args) 
	{
		//quando io ISTANZIO (CREO) un nuovo oggetto (tramite costruttore)
		//ma sto creando qualcosa in memoria
		//una zona della memoria che Java riconosce come un'istanza di Persona
		//come un oggetto Persona
		//Quando ASSEGNO un oggetto ad una variabile non STO modificando minimamente la memoria
		//Variabile p1, tu sei la porta di accesso a quel nuovo oggetto persona
		Persona p1 = new Persona();
		p1.nome = "Stefano";     
		//non sto dicendo "cambia il nome di p1"
		//prendi l'oggetto a cui la variabile p1 si riferisce, e cambia il valore della sua proprietà
		//nome nella memoria
		p1.cognome = "Rubinetti";
		Persona p2 = p1;
		//Non sto creando nessuna persona nuova, il mio programma continua a lavorare su un'unica
		//persona, AVENDO IO CHIAMATO IL COSTRUTTORE 1 volta sola
		//p2 è un altro modo per accedere, un altro collegamento, un altro riferimento
		//sempre alla stessa persona a cui p1 puntava
		p2.nome = "Esteban";
		System.out.println(p1);
		
		//Variabili
		//Variabili primitive, scatole con dentro valore
		//Variabili oggetto(complesse), riferimenti a un oggetto in memoria
		
	}
}
