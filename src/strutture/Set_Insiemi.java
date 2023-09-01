package strutture;

import java.util.HashSet;
import java.util.Set;

import entity.Persona;

public class Set_Insiemi 
{
	
	public static void main(String[] args) 
	{
		//Insieme NON ordinato di elementi dello stesso tipo, di lunghezza variabile (dinamica)
		//NON NON può contenere DUPLICATI
		//NON HA INDICI
		//Cassettone dei pupazzi in sconto al supermercato
		//Equivalente in programmazione degli INSIEMI MATEMATICI
		
		//contains(elemento) -> restituisce TRUE se il SET contiene quell'elemento
		//						false altrimenti
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("A");
		set1.add("B");
		
		set2.add("B");
		set2.add("C");

		//l'unione in java si fa con il metodo addAll
//		set1.addAll(set2);
//		
//		for(String s : set1)
//			System.out.println(s);
		
		//intersezione si fa con retainAll
//		set1.retainAll(set2);
//		for(String s : set1)
//			System.out.println(s);
		
		//la sottrazione si fa con il metodo removeAll
//		set1.removeAll(set2);
//		for(String s : set1)
//			System.out.println(s);
		
		//il mio obiettivo è ottenere un insieme con solo gli elementi NON in comune
		//creo un unione , tutti gli elementi
		//creo un intersezione, elementi in comune
		//sottraggo dall'unione l'intersezione
		Set<String> nonInComune = new HashSet<String>(set1); //lo clona
		nonInComune.addAll(set2);
		
		Set<String> intersezione = new HashSet<String>(set1); //lo clona
		intersezione.retainAll(set2);
		
		nonInComune.removeAll(intersezione);
		
		for(String s : nonInComune)
			System.out.println(s);
		
	}
}
