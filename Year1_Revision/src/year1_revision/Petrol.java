/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package year1_revision;

/**
 *
 * @author 30469957
 */
public class Petrol extends Car {
    
    //Attributes
    private String fuelType;
    private double engineSize;
    
    //Constructors
    //0-input parameter constructor
    public Petrol()
    {
        super(); //call Car()
        fuelType = "Regular Unleaded";
        engineSize = 1.5;
        
    }
    
    //5-input parameter constructor (ALL 5 Petrol Car attributes)
    public Petrol (String manufacturerIn, String colourIn, int currentSpeedIn, 
            String fuelTypeIn, double engineSizeIn)
    {
        super(manufacturerIn, colourIn, currentSpeedIn); //Call Car (String manufacturerIn, String colourIn, int currentSpeedIn)
        fuelType = fuelTypeIn;
        engineSize = engineSizeIn;
    }
    
    //Getter methods
    public String getFuelType() 
    {
        return fuelType;
    }
    
    public double getEngineSize()
    {
        return engineSize;
    }
    
    //Setter methods
    
    public void setFuelType(String fuelTypeIn) 
    {
        fuelType = fuelTypeIn;
    }
    
    public void setEngineSize(double engineSizeIn)
    {
        engineSize = engineSizeIn;
    }
    
}
