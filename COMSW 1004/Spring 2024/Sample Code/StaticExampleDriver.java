public class StaticExampleDriver {

  public static void main(String[] args) {
    Systen.out.println(StaticExample.getSharedNumber());

    StaticExample exampleA = new StaticExample();
    System.out.println(exampleA.getMyNumber());
    System.out.println(exampleA.getSharedNumber());

    StaticExample exampleB = new StaticExample();
    System.out.println(exampleB.getMyNumber());
    System.out.println(exampleB.getSharedNumber());
  }
}
