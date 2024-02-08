public class Vehicle {

  //instance variables being declared
  private String color;
  private int numberOfDoors;
  private boolean isConvertible;

  /* CONSTRUCTORS BEGIN NOW */
  public Vehicle(String color, int numberOfDoors, boolean isConvertible) {
    this.color = color;
    this.numberOfDoors = numberOfDoors;
    this.isConvertible = isConvertible;
  }

  public Vehicle(String color, int numberOfDoors) {
    this.color = color;
    this.numberOfDoors = numberOfDoors;
    this.isConvertible = false;
  }

  public Vehicle(String color) {
    this.color = color;
    this.numberOfDoors = 4;
    this.isConvertible = false;
  }

  public Vehicle() {
    this.color = "black";
    this.numberOfDoors = 4;
    this.isConvertible = false;
  }
  /* CONSTRUCTORS END HERE */

  /* ACCESSORS BEGIN HERE */
  public String getColor() {
    return this.color;
  }

  public int getDoorCount() {
    return this.numberOfDoors;
  }

  public boolean isConvertible() {
    return this.isConverible;
  }
  /* ACCESSORS END HERE */

  /* MUTATORS BEGIN HERE */
  public void setColor(String newColor) {
    this.color = newColor;
  }
  /*MUTATORS END HERE */
}
