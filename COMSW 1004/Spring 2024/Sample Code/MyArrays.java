public class MyArrays {

  public static void main(String[] args) {
    if (args.length != 0) {
      for (int i = 0; i < args.length; i++) {
        System.out.println(args[i]);
      }
    }

    int[] numbers = {1,2,3,4};
    int[] numbers2 = new int[]{5,6,7,8};
    int[] numbers3 = new int[4];
    
    numbers3[0] = 9;
    numbers3[1] = 10;
    numbers3[2] = 11;
    numbers3[3] = 12;

    for (int i = 0; i < 4; i++) {
      System.out.println(numbers[i]);
      System.out.println(numbers2[i]);
      System.out.println(numbers3[i]);
    }
  }

}
