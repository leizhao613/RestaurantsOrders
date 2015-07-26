package oop.project.java.dish;

import oop.project.java.Order;

public class Chicken extends Order
{
	@Override
	public float price() 
	{
		return 7.5f;
	}

	@Override
	public String name() 
	{
		return "Chicken";
	}
}
