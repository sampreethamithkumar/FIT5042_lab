package fit5042.tutex.repository;

import fit5042.tutex.repository.entities.Property;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * 
 * @author Sampreeth Amith Kumar
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
