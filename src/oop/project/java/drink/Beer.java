package oop.project.java.drink;

import oop.project.java.Order;

public class Beer extends Order
{
	@Override
	public float price() 
	{
		return 6.5f;
	}

	@Override
	public String name() 
	{
		return "Beer";
	}
}
