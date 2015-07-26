package oop.project.java.mainfood;

public class FriedRice extends Rice
{
	@Override
	public float price() 
	{
		return 2.5f;
	}

	@Override
	public String name() 
	{
		return "Fried "+ super.name();
	}
}
