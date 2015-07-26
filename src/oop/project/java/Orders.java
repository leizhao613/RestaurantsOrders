package oop.project.java;

import java.util.LinkedList;

public class Orders 
{
	private static Orders instance = new Orders();
	
	//Customer order queue.
	private LinkedList<Order> orders;
	private int orderNumber = 0;
	private boolean noWaitFlag = false;
	
	private Orders() 
	{
		orders = new LinkedList<Order>();
	}
	
	//If no wait flag is true, hasNext method will not wait in the loop,
	void setNoWaitFlag(boolean noWaitFlag)
	{
		this.noWaitFlag = noWaitFlag;
	}
	
	public static Orders getInstance()
	{
		return instance;
	}
	
	public synchronized void add(Order order) 
	{
		orderNumber++;
		order.setOrderNumber(orderNumber);
		orders.add(order);
		notify();
	}
	
	public synchronized Order remove() 
	{
		return orders.remove();
	}
	
	public synchronized boolean hasNext() 
	{
		while(orders.isEmpty()) {
			try 
			{
				wait(1000);
				//If no wait flag is true, hasNext method will not wait in the loop, and return false.
				if (noWaitFlag) return false;
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Thread Orders method HasNext interrupted.");
			} 
        }
		return orders.isEmpty()? false: orders.iterator().hasNext();
	}
	
}
