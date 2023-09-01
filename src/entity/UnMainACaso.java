package entity;

public class UnMainACaso {

	public static void main(String[] args) 
	{
		
		
		metodoVoid(15);
		//quello che ritorniamo sempre è l'esecuzione al chiamante
		
	}
	
	static String metodoStringa()
	{
		return "ciao";
	}

	static void metodoVoid(int a)
	{
		
		System.out.println("ciao");
		if(a<10)
			return;
		
		System.out.println("a maggiore-uguale 10");
	}
}
