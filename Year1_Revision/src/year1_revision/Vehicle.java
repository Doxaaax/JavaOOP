/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package year1_revision;

/**
 *
 * @author 30469957
 */
public class Vehicle { //Parent/Base/Super/Main type
    private String manufacturer;
    private int currentSpeed;
    
    public void setManufacturer(String manufacturerIn) 
    {
        manufacturer = manufacturerIn;
    }
    
    public String getManufacturer()
    {
        return manufacturer;
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
