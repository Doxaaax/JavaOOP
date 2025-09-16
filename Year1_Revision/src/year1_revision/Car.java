
package year1_revision;


public class Car { //Child class of vehicle/sub-type
    
    //Attributes
    private String manufacturer;
    private String colour;
    private int currentSpeed;
    
    //Constructor
    public Car()
    {
        manufacturer = "Ferrari";
        colour = "Silver";
        currentSpeed = 60;
        
    }
    
    //Overloaded method (ALL 3 input parameters/arguments)
        public Car(String manufacturerIn, String colourIn, int currentSpeedIn)
    {
        manufacturer = manufacturerIn;
        colour = colourIn;
        currentSpeed = currentSpeedIn;
        
    }
        
    //Overloaded method 2 (ALL except manufacturer)
               public Car(String colourIn, int currentSpeedIn)
    {
        manufacturer = "Unknown";
        colour = colourIn;
        currentSpeed = currentSpeedIn;
        
    } 
    
    public void setManufacturer(String manufacturerIn) 
    {
        manufacturer = manufacturerIn;
    }
    
    public String getManufacturer()
    {
        return manufacturer;
    }
    //setter method
    public void setColour(String colourIn){
        colour = colourIn; //input parameter
    }
    //getter method
    public String getColour(){
        return colour;
    }
    
        public void setCurrentSpeed(int currentSpeedIn) 
    {
        currentSpeed = currentSpeedIn;
    }
    
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
}
