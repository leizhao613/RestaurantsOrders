package oop.project.java;

//Thread to print out served orders if there is in the Orders queue.
public class DeliveryOrders extends Thread
{
	//Get the Singleton Orders queue object 
	Orders theOrders = Orders.getInstance();

	
	public void run() 
	{
		Order order;
		int counter = 0;
		while(theOrders.hasNext())
		{
			//Served orders count.
			counter++;
			order = theOrders.remove();
			printOrder(order);
		}
		System.out.println(counter + " orders have been served.");
	}
	
	private void printOrder(Order order)
	{
		System.out.format("    Delivered Order ---- Num: #%-3s", order.getOrderNumber());
		System.out.format(" Name: %-12s" , order.name());
		System.out.format(" $: %4.2f", order.price());
		System.out.format(" by: %-10s" , order.getServant());
		System.out.println("");
	}
	
	//Set the flag to exit waiting loop when order queue is empty in Orders hasNext method. 
	void stopThread()
	{
		theOrders.setNoWaitFlag(true);
	}
}
