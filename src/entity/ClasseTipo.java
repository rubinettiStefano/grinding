package entity;

//Stiamo definendo un nuovo TIPO in Java, letteralmente una nuova tipologia di oggetti
//Un modello/uno stampo per creare oggetti di questo nuovo tipo
//Le classi si dividono in due parti divise a loro volta in due parti
public class ClasseTipo 
{
	//SCOPE, 'LOCATION'
	//SCOPE DI CLASSE
	//proprietà e metodi di CLASSE, -> static
	//proprietà e metodi riguardanti l'intera classe, non il singolo oggetto
	//proprietà -> valori possibi/template
	//es: Classe Smartphone
	static String[] dimensioniSchermoPossibili = {"4 pollici","5 pollici","6 pollici"};
	//metodi di classe
	//metodi di utilità, fanno cose utili per la classe ma non lavorano sui singoli oggetti
	//PSEUDO-COSTRUTTORE
	//ad esempio LocalDate.of(anno,mese,giorno);
	public static LocalDate of(int year,int month,int day)
	{
	
		
	}
	static boolean isValid(int year,int month,int day)
	{
		//controlla se la data va bene
	}
	
	//Integer.parseInt() -> metodo static della classe Integer
	//non ha bisogno di un oggetto di tipo Integer per lavorare
	
	//Integer b = Integer.parseInt(Console.readString());
	
	//SCOPE DI OGGETTO
	//costruttore (metodo speciale con lo stesso nome della classe il cui scopo è istanziare
	//oggetti di quella classe e , opzionalmente, inizializzare valori delle proprietà
	//può essere chiamato solo preceduto da NEW
	
	//Proprietà di oggetto
	//il cui INSIEME DI VALORI in un determinato momento viene detto STATO dell'oggetto
	//lo STATO di un oggetto è quello che salvo in un db, sotto forma di riga
	
	//Metodi di oggetto
	//detti anche COMPORTAMENTO
	//Metodo = sottoprogramma, piccola parte di un programma
	//Un programma è matematicamente una funzione fatta così
	// O -> P(I)
	// dove O = Output, P = programma, I = Input
	//un programma prende in ingresso dei dati e li usa per compiere operazioni e produrre
	//un RISULTATO
	
	//differenza tra METODO e FUNZIONE
	//funzione = O -> P(I)
	//metodo = funzione che prende come input, oltre ai parametri, lo stato dell'oggetto o 
	//della classe su cui viene chiamata
	
	//INPUT SET di un metodo, informazioni in entrata
	//parametri, proprietà dell'oggetto/classe, metodi dell'oggetto/classe
	
	
	
	
	
	
	
	
	
}
