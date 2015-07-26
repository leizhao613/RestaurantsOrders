package oop.project.java;

public abstract class Order 
{
	private String servant;
	private int orderNumber;
	
	public void setServant(String servant) 
	{
		this.servant = servant;
	}

	public String getServant() 
	{
		return this.servant;
	}
	
	public void setOrderNumber(int orderNumber) 
	{
		this.orderNumber = orderNumber;
	}

	public int getOrderNumber() 
	{
		return this.orderNumber;
	}
	
	public abstract String name();
	public abstract float price();
	
}
