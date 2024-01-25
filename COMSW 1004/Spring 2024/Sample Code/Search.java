/**
 * File contains all the search algorithms 
 * mentioned in the course, linear and 
 * binary search.
 * 
 * @author Griffin Newbold
 */
public class Search {

  /**
   * Searches for the specified value x in the array a 
   * using the sequential search algorithm.
   *
   * @param {@code int[] a} the array used for searching.
   * @param {@code int x} the value to be searched for.
   */
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

  /**
   * Searches for the specified value x in the array a 
   * using the binary search algorithm.
   *
   * @param {@code int[] a} the array used for searching.
   * @param {@code int x} the value to be searched for.
   */
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

  //main method for code
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7,8};
    System.out.println(binarySearch(a, 7));
    System.out.println(sequentialSearch(a, 9));
  }
}
