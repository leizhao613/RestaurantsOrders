package oop.project.java.mainfood;

import oop.project.java.Order;

public class Rice extends Order
{
	@Override
	public float price() 
	{
		return 1.0f;
	}

	@Override
	public String name() 
	{
		return "Rice";
	}
}
