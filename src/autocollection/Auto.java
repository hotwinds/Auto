/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocollection;

/**
 *
 * @author Александр
 */
public class Auto {
    String Manufacturer;
    String Model;
    int Year;
    int MotorCapacity;
    String Type;
    
    public Auto(String Manufacturer, String Model, int Year, int MotorCapacity, String Type){
    this.Manufacturer = Manufacturer;
    this.Model = Model;
    this.Year = Year;
    this.MotorCapacity = MotorCapacity;
    this.Type = Type;
    }
    
    public String getManufacturer(){
        return Manufacturer;
    }
    
    public String getModel(){
        return Model;
    }
    
    public int getYear(){
        return Year;
    }
    
    public int getMotorCapacity(){
        return MotorCapacity;
    }
    
    public String getType(){
        return Type;
    }
    
    @Override
    public String toString() {
        return  Manufacturer + " " + Model +  " " +  Year + " " +  MotorCapacity + " " +  Type;
    }
}
