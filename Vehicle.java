/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Vehicle {
    String vehicleid,fueltype,brand; 
    
    Vehicle(String vehicleid,String brand ,String fueltype)
    {
        vehicleid=vehicleid.toUpperCase();
        brand=brand.toUpperCase();
      this.vehicleid=vehicleid;
      this.fueltype=fueltype;
      this.brand=brand;
    }
    
    void getvehicle()
    {
      System.out.println("Vehicle ID : "+vehicleid);
      System.out.println("Brand : "+brand);
      System.out.println("fueltype : "+fueltype);
    }
    
    int mileage()
    {
      if (fueltype=="petrol")
      {
        return 18;
      }
      else if (fueltype=="diesel")
      {
         return 20;
      }
      else if (fueltype=="electric")
      {
          return 50;
      }
        return 0;
    }
}
