package de.tub.as.smm.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SmartMeter implements Serializable{
	   private static final long serialVersionUID = 1L;
	   
	   
	    @Id @GeneratedValue
	    String kennung;
	    Long StromSpannung;
	    Long StromStärke;
	 
	    public SmartMeter() {
	    }
	 
	    public SmartMeter(String kennung) {
	        this.kennung = kennung;
	        //TODO: Spannung/Stärke 
	    }
	 
	    @Override
	    public String toString() {
	        return "SmartMeter: " + kennung;
	    }
	    
	    public String getKennung(){
	    	return kennung;
	    }
	

}
