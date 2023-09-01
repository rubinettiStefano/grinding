package iterazioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iterazione 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		//ITERAZIONE==CICLO
		//RIPETERE LO STESSO BLOCCO DI CODICE PIÙ VOLTE
		
		//while
		//do-while
		//for
		//for-each
		
		//while
		//FORMA BASE, quello più generico
		//UN IF RIPETUTO TANTE VOLTE
		
		//condizioneDiRipetizione -> boolean
		//il while ci dice
		//prima di ogni giro controlla la condizioneDiRipetizione
		//se è TRUE esegui il corpo del ciclo
		//se è FALSE passa oltre
		//in un ciclo while, il corpo verrà eseguito da 0 a N volte
		
//		while(condizioneDiRipetizione)
//		{
//			//corpo del ciclo
//		}
		
		//in generale viene utilizzato principalmente con le librerie STANDARD di Java
		//lettura da file
		//JDBC, lettura da db
		
		//Crea un lettore (scanner) che legge dal file daLeggere.txt
		Scanner fileReader = new Scanner(new File("daLeggere.txt"));
		
		//fileReader.hasNextLine() -> abbiamo ancora almeno una riga da leggere
		//è un metodo che produce TRUE se non abbiamo ancora esaurito il file
		//FALSE se siamo arrivati in fondo
		while(fileReader.hasNextLine())
		{
			//leggo una riga e la stampo
			System.out.println(fileReader.nextLine());
		}
		
		//In java si usa quasi solo in combinazione
		//con un tipo di oggetto chiamato ITERATOR
		
		//do-while
		//come il while ma la condizione NON viene
		//controllata per il primo giro, che verrà
		//sempre eseguito
		
		//per il primo giro eseguo il corpo del ciclo
		//senza controllare la condizione
		//do-while==while, ma eseguito da 1 a N volte
//		do
//		{
//			//corpo del ciclo
//		}while(condizioneDiRipetizione);
//		//Chiedere input all'utente
		
		//for classico
		//unisce nelle sue parentesi tonde 3 istruzioni
		
		//int i=0 -> inizializzazione della variabile di scorrimento
		//i<10 -> condizione di ripetizione, esattamente come while/do-while
		//i++ -> aggiornamento della variabile di scorrimento
		
		//funziona come un while
		//continua a ripetere il corpo del ciclo
		//fin quando la condizione di ripetizione è true
		//eseguito da 0 a N volte
		//ci regala però una variabile, generalmente utilizzata come indice o contatore
		//definiamo il suo valore iniziale nella prima parte del for
		//e come cambierà alla fine di ogni giro, nell'ultima parte del for
		
		for(int i=0;i<10;i++)
		{
			//corpo del ciclo
		}
		
		//1) scorrimento di una collezione ordinata (liste/vettori) in cui, per motivi
		//	 abbiamo bisogno dell'indice
		//2) vogliamo ripetere una determinata operazione un tot numero (conosciuto) di volte
		//3) puramente matematico
		
		//for-each
		//scorrimento di collezioni, elemento per elemento
		//Esegui il corpo del ciclo per ogni singolo elemento della collezione
		//ogni singolo elemento è di TipoElemento e lo chiami al tuo interno nomeElemento
//		for(TipoElemento nomeElemento : collezione)
//		{
//			//corpo del ciclo
//		}
		//È così -> Lunedì mattina, massimo pomeriggio
		List<String> lista = new ArrayList<String>();
		
		//esegui il blocco di codice 110-112
		//Per ogni Stringa, che al tuo interno chiami "s" 
		//contenuta nella collezione di nome "lista"
		for(String s : lista)
		{
			System.out.println(s);
		}
	}
}
