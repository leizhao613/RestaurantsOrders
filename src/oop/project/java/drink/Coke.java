package oop.project.java.drink;

import oop.project.java.Order;

public class Coke extends Order{
	@Override
	public float price() 
	{
		return 1.5f;
	}

	@Override
	public String name() 
	{
		return "Coke";
	}
}
