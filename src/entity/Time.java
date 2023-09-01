package entity;

public class Time 
{
	static  int toMinutes(Time t)
	{
		return t.ora*60+t.minuti;
	}
	
	
	int ora, minuti;
	
	int toMinutes()
	{
		return toMinutes(this);
	}
}
