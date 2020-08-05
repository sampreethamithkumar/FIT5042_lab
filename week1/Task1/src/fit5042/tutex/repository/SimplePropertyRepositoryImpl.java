/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository;

import fit5042.tutex.repository.entities.Property;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * TODO Exercise 1.3 Step 2 Complete this class.
 * 
 * This class implements the PropertyRepository class. You will need to add the keyword
 * "implements" PropertyRepository. 
 * 
 * @author Junyang
 */
public class SimplePropertyRepositoryImpl implements PropertyRepository
{
	
	private final List<Property> properties;
	
    public SimplePropertyRepositoryImpl() 
    {
        properties = new ArrayList();
    }

	@Override
	public void addProperty(Property property) throws Exception {
		if (!properties.contains(property))
			properties.add(property);
		
	}

	@Override
	public Property searchPropertyById(int id) throws Exception {
		Iterator<Property> property = properties.iterator();
		while (property.hasNext())
		{
			Property prop = property.next();
			if (prop.getPropertyId() == id)
				return prop;
		}
		
		return null;
	}

	@Override
	public List<Property> getAllProperties() throws Exception {
		return properties;
	}
    
}
