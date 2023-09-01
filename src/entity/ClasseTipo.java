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
		//ma il compito di creare una data ora è mio
		//io richiamerò il costruttore, ma prima posso fare quello che voglio
		if(isValid(year,month,day))
		{
			LocalDate res =  new LocalDate();
			res.day = day;
			res.month = month;
			res.year = year;
			return res;
		}
		else
			return null;
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
	
}
