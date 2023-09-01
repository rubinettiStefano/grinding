package entity;

public class Persona 
{
	static String propClasse = "ciao";
	
	static String metodClasse()
	{
		String a = this.nome;
	}
	
	//metodi di oggetto hanno come input -> parametri, proprietà e metodi di classe e di oggetto
	//metodi di CLASSE hanno come input -> parametri, proprietà  e metodi SOLO di classe 
	
	public String nome,cognome;
	
	public String toString()
	{
		return nome + " "+cognome;
	}
	
	
	public String metodoEsempio(Persona other)
	{
		//nome e cognome dell'oggetto persona
		//può richiamare il toString
		//può usare il valore di par1
		return toString()+ " "+this.nome + other.toString();
		
		//this -> oggetto in cui mi trovo
	}
	//10 StefanoStefano Rubinetti
	
	
	String metodoEsempio2()
	{
		return nome + " "+ toString() +propClasse + metodClasse();
	}
	//[questo] -> OPZIONALE
	//[visibilità] ... [scope] tipoDiRitorno nome([parametri]) 
	//la firma da informazioni su quel metodo al resto del programma
	//visibilità -> dove posso richiamare quel metodo
	//public -> richiamabile anche dalla luna, tutto il mondo
	//protected -> bohhhhh, martedì
	//default/package -> solo all'interno dello stesso package in cui ho la classe
	//private -> solo dentro la classe stessa
	
	//definiamo lo SCOPE (classe/oggetto)
	//se non mettiamo niente -> scope di oggetto, viene richiamato su un oggetto (this)
	//se mettiamo static, scope di classe, viene richiamato direttamente sulla classe
	
	//L'OGGETTO CONOSCE LA CLASSE, LA CLASSE NON CONOSCE GLI OGGETTI
	
	//tipo di ritorno obbligatorio, può essere VOID, senza ritorno
	//il return è obbligatorio in tutti i metodi ad esclusione di quelli void
	//return ha 2 compiti:
	//terminare l'esecuzione del metodo
	//restituire un valore
}
