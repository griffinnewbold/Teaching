public class VehicleTest {

  public static void main(String[] args) {
    Vehicle mercedes = new Vehicle("black", 2);
    Vehicle toyata = new Vehicle("blue", 4, true);

    System.out.println(mercedes.getColor());
    System.out.println(toyota.getColor());

    mercedes.setColor("red");
    
    System.out.println(mercedes.getColor());
    System.out.println(toyota.getColor());
  }
}
