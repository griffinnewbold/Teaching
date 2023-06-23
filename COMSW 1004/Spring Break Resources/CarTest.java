public class CarTest {

    public static void main(String[] args){
        Car myCar = new Car("BMW", "purple");
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getFuel());

        //mutator calls
        myCar.setColor("red");
        myCar.setFuel(4);

        //accessor calls
        System.out.println(myCar.getModel());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getFuel());
    }



}