package oop.project.java.drink;

import oop.project.java.Order;

public class Water extends Order
{
	@Override
	public float price() 
	{
		return 0.0f;
	}

	@Override
	public String name() 
	{
		return "Water";
	}
}
