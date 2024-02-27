public class StaticExample {

  private static int sharedNumber = 0;
  private int myNumber;


  public StaticExample() { 
    myNumber = sharedNumber;
    sharedNumber += 2;
  }

  public static int getSharednumber() {
    return sharedNumber;
  }

  public int getMyNumber() {
    return myNumber;
  }
}
