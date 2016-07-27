package com.ces.Learnings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, String> vehicle = new HashMap();
        
        vehicle.put(01, "Audi");
        vehicle.put(02, "BMW");
        vehicle.put(03, "Benz");
        vehicle.put(04,"Lambo");
        //vehicle.put(05, "GTR");
        
   
       // (int i=0; i <= vehicle.size(); i++)
        //System.out.println(vehicle.get(i));
        for (Entry<Integer, String> sabari : vehicle.entrySet())
        {
        	System.out.println(sabari.getValue());
        }
        
        for (int i=1; i <= vehicle.size(); i++){
        	System.out.println(vehicle.get(i));
        }
        
        String sab = vehicle.get(01);
        System.out.println(sab);
        
        
    }
}
