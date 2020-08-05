package fit5042.tutex;

import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.entities.Property;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Junyang
 */
public class RealEstateAgency 
{
    private String name;
    private final PropertyRepository propertyRepository;

    public RealEstateAgency(String name) throws Exception {
        this.name = name;
        this.propertyRepository = PropertyRepositoryFactory.getInstance();
    }
    
    // this method is for initializing the property objects
    // complete this method
    public void createProperty() {
        try 
        {
			propertyRepository.addProperty(new Property(1,"24 Boston Ave, Malvern East VIC 3145, Australia",2,150,420000));
			propertyRepository.addProperty(new Property(2,"11 Bettina St, Clayton VIC 3168, Australia",3,352,360000));
			propertyRepository.addProperty(new Property(3,"3 Wattle Ave, Glen Huntly VIC 3163, Australia",5,800,6500000));
			propertyRepository.addProperty(new Property(4,"3 Hamilton St, Bentleigh VIC 3204, Australia",2,170,4350000));
			propertyRepository.addProperty(new Property(5,"82 Spring Rd, Hampton East VIC 3188, Australia",1,60,820000));
			System.out.println("5 property added successfully");
		} 
        catch (Exception e) 
        {
			e.printStackTrace();
		}
    }
    
    // this method is for displaying all the properties
    // complete this method
    public void displayProperties() 
    {
    	try 
    	{
			List<Property> properties = propertyRepository.getAllProperties();
			Iterator<Property> property = properties.iterator();
			while (property.hasNext())
			{
				System.out.println(property.next().toString());
			}
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
        
    }

    public void searchPropertyById() 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter the ID of the property you want to search: ");
    	try 
    	{
			Property property = propertyRepository.searchPropertyById(scan.nextInt());
			if (property == null)
				System.out.println("No such property");
			else
				System.out.println(property.toString());
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    
    public void run() {
        createProperty();
        System.out.println("********************************************************************************");
        displayProperties();
        System.out.println("********************************************************************************");
        searchPropertyById();
    }
    
    public static void main(String[] args) {
        try {
            new RealEstateAgency("FIT5042 Real Estate Agency").run();
        } catch (Exception ex) {
            System.out.println("Application fail to run: " + ex.getMessage());
        }
    }
}
