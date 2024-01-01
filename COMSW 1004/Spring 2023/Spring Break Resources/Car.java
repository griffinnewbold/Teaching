public class Car {

    //instance variables
    private String color;
    private String model; 
    private int fuel;


    public Car(String model, String color){

        this.model = model; 
        this.color = color;
        this.fuel = 0;

    }

    public String getModel(){
        return this.model;
    }

    public String getColor(){
        return this.color;
    }

    public int getFuel(){
        return this.fuel;
    }
    
    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setFuel(int gallons){
        this.fuel = gallons;
    }

    public void someMethod()
    {
       if(someCondition)
       {
           
       }
       else
       {
           
       } 
    }




}