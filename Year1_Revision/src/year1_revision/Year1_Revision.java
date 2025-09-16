
package year1_revision;

import java.util.ArrayList;
import java.util.List;


public class Year1_Revision {


    public static void main(String[] args) {
      
        Car car1 = new Car();
        car1.setManufacturer("Ford");
        car1.setColour("Red");
        car1.setCurrentSpeed(30);
        
        Car car2 = new Car();
        car2.setManufacturer("Toyota");
        car2.setColour("Blue");
        car2.setCurrentSpeed(30);
        
        Car car3 = new Car();
        
        Car car4 = new Car("BMW", "Black", 80);
        //Car(String manufacturerIn, String colourIn, int currentSpeedIn)
        
        Car car5 = new Car("White", 100);
        //Car(String colourIn, int currentSpeedIn)
        
        List<Car> myGarage = new ArrayList<>();
        myGarage.add(car1);
        myGarage.add(car2);
        myGarage.add(car3);
        myGarage.add(car4);
        myGarage.add(car5);
        
        
        int carNo = 0;
        for(Car myCar : myGarage)
        {
        carNo++;
        System.out.println("Car " + carNo + ": " + myCar.getColour() + " " + myCar.getManufacturer() + " at " + myCar.getCurrentSpeed() + "mph ");
        }
        
        Petrol petrolCar1 = new Petrol();
        System.out.println("** Petrol Cars **");
        System.out.println("Car " + carNo + ": " + petrolCar1.getColour() + " " 
                + petrolCar1.getManufacturer() + " at " 
                + petrolCar1.getCurrentSpeed() + 
                "mph running a " + petrolCar1.getEngineSize() 
                + " litre engine ");
        
        Petrol petrolCar2 = new Petrol("Jaguar", "Green", 75, "Premium", 2.5);
          System.out.println("Car " + carNo + ": " + petrolCar2.getColour() + " " 
                + petrolCar2.getManufacturer() + " at " 
                + petrolCar2.getCurrentSpeed() + 
                "mph running a " + petrolCar2.getEngineSize() 
                + " litre engine with " + petrolCar2.getFuelType()
                + " Fuel");
        
          Electric electricCar1 = new Electric("Porsche", "Violet", 99);
          Electric electricCar2 = new Electric("Indigo", 45, 250);
        //System.out.println("Car 1: " + car1.colour + " " + car1.manufacturer);
        //System.out.println("Car 2: " + car2.colour + " " + car2.manufacturer);
    }
    
}
