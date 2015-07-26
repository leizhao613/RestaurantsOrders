package oop.project.java.dish;

import oop.project.java.Order;

public class Beef extends Order
{
	@Override
	public float price() 
	{
		return 8.5f;
	}

	@Override
	public String name() 
	{
		return "Beef";
	}
}
