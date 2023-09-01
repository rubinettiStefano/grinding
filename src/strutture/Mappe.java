package strutture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mappe 
{
	public static void main(String[] args) 
	{
		//Definizione
		//Vicino, una mappa non ha posizioni
		//Una mappa è un insieme non ordinato di coppie chiave-valore
		
		//Le CHIAVI sono un SET, vale a dire, non possono avere duplicati
		
		//metodo importanti
		Map<String,String> m = new HashMap<String,String>();
		// put, oltre ad essere un abbreviazione volgare, è anche un metodo che prende 2 parametri
		//una chiave ed un valore, aggiunge una coppia chiave valore
		//se chiamo put inserendo una chiave già presente, rimpiazzo il valore
		m.put("chiave1", "valore1");
		m.put("chiave2", "valore2");
		
		// get, prende un valore prendendo come parametro una chiave
		String valore = m.get("chiave");
		
		//cosa restituisce se passo una chiave non presente????
		//m.get("paperino")
		//fortunatamente NO, restituisce NULL, mi dice nessun valore con quella chiave
		
		//keySet() -> restituisce un Set contenente tutte le chiavi
		//questo è essenziale per scorrere una MAPPA (non il famoso studio)
		Set<String> keys = m.keySet();
		
		for(String key : keys)
		{
			String value = m.get(key);
			
		}
		
	}
}
