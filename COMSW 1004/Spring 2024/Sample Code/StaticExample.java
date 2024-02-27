public class StaticExample {

  //This is a static attribute, it is shared among all instances of the class 
  //if one instance alters the value of the member, all instances have that 
  //altered value.
  private static int sharedNumber = 0;

  //standard instance attribute.
  private int myNumber;

  //standard constructor
  public StaticExample() { 
    myNumber = sharedNumber;
    sharedNumber += 2;
  }

  //this method is static, it does not need an object reference to be called
  public static int getSharednumber() {
    return sharedNumber;
  }

  //standard accessor
  public int getMyNumber() {
    return myNumber;
  }
}
