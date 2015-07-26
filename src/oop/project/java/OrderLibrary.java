package oop.project.java;

import java.util.ArrayList;
import java.util.Random;

public class OrderLibrary 
{
	private static OrderLibrary instance = new OrderLibrary();
	
	//Keep sample of the items that restaurant can offer.
	private ArrayList<Order> orders;
	private Random orderIndex = new Random();
	
	private OrderLibrary() 
	{
		orders = new ArrayList<Order>();
	}
	
	public static OrderLibrary getInstance()
	{
		return instance;
	}
	
	//Randomly generate a item from the sample list
	Order generateOrder() 
	{
		//Return null when no sample in the list, restaurant can offer nothing.
		if (orders.size() <=0) return null;
		
		Order order = null;
		try
		{
			//Clone one item from the sample.
			order = (orders.get(orderIndex.nextInt(orders.size()))).getClass().newInstance();
		}
		catch (Exception e) 
		{
			order = null;
		}
		return order;
	}
	
	//Add one sample to list
	void addOrderToLibrary(Order order) 
	{
		orders.add(order);
	}

}
