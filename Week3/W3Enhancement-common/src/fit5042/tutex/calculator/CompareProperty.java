package fit5042.tutex.calculator;

import javax.ejb.Remote;

import fit5042.tutex.repository.entities.Property;

@Remote
public interface CompareProperty {

	void addProperty(Property property);
	
	public void removeProperty(Property property);

	public int bestPerRoom();

}
