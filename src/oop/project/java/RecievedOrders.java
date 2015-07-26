package oop.project.java;

public class RecievedOrders extends Thread
{
	private String servant;
	public RecievedOrders(String servant )
	{
		this.servant = servant;
	}
	
	public void run() 
	{
		OrderLibrary theOrderFactiory = OrderLibrary.getInstance();
		Orders theOrders = Orders.getInstance();
		
		for (int i=0; i < 10; i++)
		{
			Order order = theOrderFactiory.generateOrder();
			if (order != null )
			{
				order.setServant(servant);
				theOrders.add(order);
				//printOrder(order);
			}
			try 
			{
				Thread.sleep(50);
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Thread Create Orders interrupted.");
			}
		}
		System.out.println("10 orders have been created by " + servant);
	}
	
	private void printOrder(Order order)
	{
		System.out.format("  Recieved Order ---- Num: #%-3s", order.getOrderNumber());
		System.out.format(" Name: %-12s" , order.name());
		System.out.format(" $: %4.2f", order.price());
		System.out.format(" Served by: %-10s" , order.getServant());
		System.out.println("");
	}

}
