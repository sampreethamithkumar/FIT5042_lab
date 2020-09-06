package com.monash;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NameStorageBean
 */
@Stateless
@LocalBean
public class NameStorageBean {

    /**
     * Default constructor. 
     */
    public NameStorageBean() {
        // TODO Auto-generated constructor stub
    }
    
    private String name= "World";
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

}
