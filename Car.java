/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Car extends Vehicle{
    int seats;
    boolean automatic;
    public Car(String vehicleid, String brand, String fueltype, int seats, String auto)
    { 
        super(vehicleid,brand,fueltype);
        this.seats=seats;
        this.automatic = "on".equals(auto);
            
      }
    void getcar()
    {   
        super.getvehicle();
        System.out.println("Seats : "+seats);
        if(automatic==true)
         System.out.println("Automatic : "+"ON");
        else
            System.out.println("Automatic : "+"OFF");
            
    }
    @Override
     int mileage()
     {
       int a=super.mileage();
       System.out.println("Mileage : "+a);
        return 0;
       
     }

    }
   
