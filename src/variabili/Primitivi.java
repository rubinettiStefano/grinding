package variabili;

public class Primitivi 
{

	public static void main(String[] args) 
	{
		//Variabili di tipo PRIMITIVO
		//Variabili di tipo OGGETTO
		
		//byte,short,int,long,float,double,boolean,char
		//iniziano con la minuscola
		//sono un UNICO VALOR
		//UNA VARIABILE È una scatola che contiene un valore
		int a = 5;//scatola di nome a, che contiene il valore 5
		//quando facciamo operazioni di assegniazione di primitivi, semplicemente stiamo 
		//cambiando il valore nella scatola
		int b = a;//NON sto mettendo a dentro b, sto dicendo
		//copia in b, inserisci in b, lo stesso valore presente in a
		System.out.println("a="+a);
		System.out.println("b="+b);
		b+=3;//somma al valore già presente nella scatola b il valore 3, quindi avremo 8
		System.out.println("stampa post somma");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
