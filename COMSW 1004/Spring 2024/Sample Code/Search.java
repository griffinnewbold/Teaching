public class Search {

  //Runs the sequential search algorithm and returns true or false.
  public static boolean seqeuntialSearch(int[] a, int x) {
    int i = 0;
    while (i < a.length) {
      if (a[i] == x) {
        return true;
      }
      i += 1;
    }
    return false;
  }

  //Runs the binary search algorithm and returns true or false.
  public static boolean binarySearch(int[] a, int x) {
    int leftPointer = 0;
    int rightPointer = a.length - 1;

    while (leftPointer <= rightPointer) {
      int mid = leftPointer + ((leftPointer + rightPointer) / 2);
      if (a[mid] == x) {
        return true;
      } else if (a[mid] < x) {
        leftPointer = mid + 1;
      } else {
        rightPointer = mid - 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7,8};
    System.out.println(binarySearch(a, 7));
    System.out.println(sequentialSearch(a, 9));
  }
}
