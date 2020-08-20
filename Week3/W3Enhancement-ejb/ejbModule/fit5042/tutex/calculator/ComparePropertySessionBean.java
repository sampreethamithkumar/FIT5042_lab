package fit5042.tutex.calculator;



import java.util.HashSet;
import java.util.Set;

import javax.ejb.Stateful;

import java.util.Iterator;

import fit5042.tutex.repository.entities.Property;

@Stateful
public class ComparePropertySessionBean implements CompareProperty
{
	private Set<Property> list;
	
	public ComparePropertySessionBean()
	{
		list = new HashSet<>();
	}

	@Override
	public void addProperty(Property property) 
	{
		list.add(property);
		
	}

	@Override
	public void removeProperty(Property property) 
	{
		if (list.isEmpty())
			return;
		
		Iterator<Property> propIterate = list.iterator();
		
		while (propIterate.hasNext())
		{
			Property prop = propIterate.next();
			if (prop.getPropertyId() == property.getPropertyId())
				list.remove(property);
		}
	}

	@Override
	public int bestPerRoom() 
	{
		if(list == null || list.size() == 0)
		{
			return Integer.MIN_VALUE;
		}
		
		Iterator<Property> propIterate = list.iterator();
		Property prop = propIterate.next();
		double pricePerRoom = prop.getPrice()/prop.getNumberOfBedrooms();
		
		for (Property property : list)
		{
			double propertyPricePerRoom = property.getPrice()/property.getNumberOfBedrooms();
			if (propertyPricePerRoom < pricePerRoom)
				pricePerRoom = propertyPricePerRoom;
		}
		
		for (Property property : list)
		{
			if ((property.getPrice()/property.getNumberOfBedrooms()) == pricePerRoom)
				return property.getPropertyId();
		}
		return -1;
	}	
}
