package relazioni;

public class Relazioni
{
	public static void main(String[] args) 
	{
		//Relazioni 1 a N
		//Relazioni N a N
		//COMPOSIZIONE/USO
		//NON NON NON SONO RELAZIONI DI IDENTITÀ
		
		//LE RELAZIONI DI COMPOSIZIONE/USO le riconoscete perchè sono quelle che in SQL
		//definireste con le chiavi esterne
		
		//relazione 1 a N, un oggetto collegato a tanti (ad una lista)
		//in sql si ESPRIME con una CHIAVE ESTERNA sull'oggetto con molteplicità N
		//vale a dire, ogni figlio conosce suo padre
		//in sql la relazione viene detta monodirezionale (dal figlio al padre)
		
		//In java è invece BIDIREZIONALE
		//ed è espressa tramite 2 PROPRIETÀ
		//il figlio CONTIENE un riferimento all'oggetto padre -> Padre padre;
		//il padre CONTIENE una lista di figli -> List<Figlio> figli;
		
		//N a N
		//in SQL abbiamo la JOIN TABLE-> tabella con righe che contengono 2 chiavi esterne\
		//In java ogni oggetto CONTIENE una lista degli altri
	}
	
}
