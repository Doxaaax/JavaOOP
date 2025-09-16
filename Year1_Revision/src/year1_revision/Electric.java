/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package year1_revision;

/**
 *
 * @author 30469957
 */
public class Electric extends Car {
    //Attributes
    private int range;
    
    public Electric ()
    {
        range = 100;
    }
    
    public Electric (String manufacturerIn, String colourIn, int currentSpeedIn)
    {
        super(manufacturerIn, colourIn, currentSpeedIn);
        range = 300;
    }
    
    public Electric (String colourIn, int currentSpeedIn, int rangeIn)
    {
        super(colourIn, currentSpeedIn);
        range = rangeIn;
    }
    //Setter
    public void setRange(int rangeIn) 
    {
        range = rangeIn;
    }
    //Getter
    public int getRange()
    {
        return range;
    }
    
}
