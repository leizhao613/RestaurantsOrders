package oop.project.java;

import java.io.IOException;

import oop.project.java.dish.Beef;
import oop.project.java.dish.Chicken;
import oop.project.java.drink.Beer;
import oop.project.java.drink.Coke;
import oop.project.java.drink.Water;
import oop.project.java.mainfood.FriedRice;
import oop.project.java.mainfood.Rice;
import oop.project.java.mainfood.StreamRice;

public class OrdersDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("This is Orders Demo.");
		
		addOrderToLibrary();
		
		Thread recievedOrders1 = new RecievedOrders("Waitress 1");
		Thread recievedOrders2 = new RecievedOrders("Waitress 2");
		
		recievedOrders1.start();
		recievedOrders2.start();
		
		DeliveryOrders deliveryOrders = new DeliveryOrders();
				
		deliveryOrders.start();
		
		System.out.println("Press any key to exit Demo Order ");
		try 
		{
			System.in.read();
		} 
		catch (IOException e) 
		{
			System.out.println("Thread Demo Orders interrupted.");
		}
		
		deliveryOrders.stopThread();
		
		System.out.println("Order Demo is Done!!! ");
	}
	
	private static void addOrderToLibrary()
	{
		OrderLibrary theOrderFactiory = OrderLibrary.getInstance();
		
		Rice aRice = new Rice();
		StreamRice aStreamRice = new StreamRice();
		FriedRice aFriedRice = new FriedRice();
		
		Water aWater = new Water();
		Beer aBeer = new Beer();
		Coke aCoke = new Coke();
		
		Beef aBeef = new Beef();
		Chicken aChicken = new Chicken();
		
		theOrderFactiory.addOrderToLibrary(aRice);
		theOrderFactiory.addOrderToLibrary(aStreamRice);
		theOrderFactiory.addOrderToLibrary(aFriedRice);
		
		theOrderFactiory.addOrderToLibrary(aWater);
		theOrderFactiory.addOrderToLibrary(aBeer);
		theOrderFactiory.addOrderToLibrary(aCoke);
		
		theOrderFactiory.addOrderToLibrary(aBeef);
		theOrderFactiory.addOrderToLibrary(aChicken);
	}

}
