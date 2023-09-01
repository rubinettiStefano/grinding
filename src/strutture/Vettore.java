package strutture;

public class Vettore 
{
	public static void main(String[] args) 
	{
		//cosa è un vettore? D.S.
		//Insieme ordinato di elementi dello stesso tipo, di lunghezza fissa
		//Può contenere OGGETTI?   YES
		//Può contenere PRIMITIVI? YES
		//Il vettore è un oggetto, con proprietà e metodi
		//non abbiamo mai usato metodi, ma abbiamo usato una proprietà length
		//length dipende da quanti elementi abbiamo INSERITO all'interno del vettore? D.S?
		//NICE
		
		//sintassi vettore
		//creiamo un vettore di String
		String[] vett = new String[10];
		//può contenere 10 String
		//quante String contiene al momento? ZERO
		//ha spazio per 10 String, ma non ne contiene nessuna
		//in realtà, contiene 10 null
		//la prima posizione di un vettore è sempre 0
		//l'ultima dimensione-1, 9 in questo caso
		
		//Irene spiega il caso di uso principale dei vettori in Java 
		//vantaggi rispetto alle liste
		
		//i vettori sono scomodi da fare schifo
		//i vettori saranno usati nel 90% dei casi perchè li riceveremo come ritorno di metodi
		//delle librerie standard di JAVA, come il metodo split delle String
		String[] parts = "ciao,bye,salut".split(",");
		//in questo caso il tipo di ritorno di split è String[] e restituirà un vettore contenente 3
		//String
		//parts[0] = "ciao"
		//parts[1] = "bye"
		//parts[2] = "salut"
		
		//i vettori sono SEMPRE più performanti delle LISTE
		//occupano meno spazio in memoria (a parità di elementi contenuti)
		//e sono pìù veloci da scorrere(in tempo di CPU)
		
		
		//Può contenere duplicati
	}
}
