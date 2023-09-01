package strutture;

import java.util.ArrayList;
import java.util.List;

import entity.Persona;

public class Liste 
{

	public static void main(String[] args) 
	{

		//YES
		//Insieme ordinato di elementi dello stesso tipo, di dimensione dinamica
		//NON NON NON NON possono contenere primitivi
		//List<int> lista;//eclipse mi picchia, ESISTE già, tyes
		List<Integer> lista2;
		//Tipo boxato -> Versione ad oggetto di un primitivo
		//il valore del primitivo sarà lo stato dell'oggetto
		//a cui viene aggiunto un comportamento (metodi)
		
		//Possono contenere DUPLICATI, 2 volte lo stesso oggetto?
		//vi faccio un esempio
		List<String> listaString = new ArrayList<String>();
		
		String s = "ciao";
		listaString.add(s);
		listaString.add(s);
		
		//quanto varrà listaString.size()?? D.S.
		System.out.println(listaString.size());
		//1 o 2? 
		//1? L'accendiamo?
		//La tua corsa verso il milione termina qui
		//le liste possono contenere duplicati, lo stesso oggetto in più posizioni
		//ANCHE I VETTORI
		//cambia in tutti e due
		//le posizioni non sono altro che variabili che puntano ad un oggetto
		//in questo caso la posizione 0 e 1 puntano alla STESSA STRINGA
		
		List<Persona> people = new ArrayList<Persona>();
		
		Persona p = new Persona(); //persona con id 27
		p.nome = "Stefano";
		
		people.add(p);
		people.add(p);
		
		//alla persona con id 27 puntano 3 variabili
		//p
		//posizione 0 di people
		//posizione 1 di people
		
		p.nome = "Gino";
		
		System.out.println(people.get(0).nome);
		System.out.println(people.get(1).nome);
		
		//metodi importanti delle liste
		//add -> aggiunge 1 elemento in fondo alla lista, aumentandone di 1 la lunghezza
		//add può anche prendere 1 intero come parametro(oltre all'elemento)
		//in quel caso aggiunge l'elemento a quella posizione
		//get -> prende l'elemento ad una determinata posizione
		//size() -> restituisce la lunghezza della lista, 
		//per una lista lunghezza==numero di elementi contenuti
		//remove(index or element) -> rimuove l'elemento passato come parametro 
		//o l'elemento ad un determinato indice, accorciando la lista di conseguenza
		
		people.get(27);
	}

}
