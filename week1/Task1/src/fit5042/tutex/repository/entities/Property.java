/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository.entities;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author Sampreeth Amith Kumar
 * 
 */
//TODO Exercise 1.3 Step 1 Please refer tutorial exercise. 
public class Property 
{
	private int propertyId;
	private String address;
	private int numberOfBedrooms;
	private int size;
	private double price;
	
	public Property(int propertyId, String address, int numberOfBedrooms, int size, double price) {
		super();
		this.propertyId = propertyId;
		this.address = address;
		this.numberOfBedrooms = numberOfBedrooms;
		this.size = size;
		this.price = price;
	}

	public int getPropertyId() 
	{
		return propertyId;
	}
	
	public void setPropertyId(int propertyId) 
	{
		this.propertyId = propertyId;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public int getNumberOfBedrooms() 
	{
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) 
	{
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public int getSize() 
	{
		return size;
	}
	public void setSize(int size) 
	{
		this.size = size;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return  propertyId + " " + address + " " + numberOfBedrooms + "BR(s)" + " "  
				+ size + "sqm $" + price;
	}
	
	
    
}
