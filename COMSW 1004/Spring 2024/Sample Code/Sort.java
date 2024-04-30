/**
 * Includes methods for all the mentioned sorting algorithms.
 * Will be updated later to include other mentioned algorithms
 * later in the course i.e. merge sort. :D
 *
 * @author Griffin Newbold
 */
public class Sort {

  /**
   * Sorts the input using the insertion sort algorithm.
   *
   * @param {@code int[] array} the array to be sorted.
   */
  public static int[] insertionSort(int[] array) {
    int n = array.length;  
    for (int j = 1; j < n; j++) {  
      int key = array[j];  
      int i = j-1;  
      while ( (i > -1) && ( array [i] > key ) ) {  
          array [i+1] = array [i];  
          i--;  
      }  
      array[i+1] = key;    
    }
    return array;
  }

  /**
   * Sorts the input using the selection sort algorithm.
   *
   * @param {@code int[] array} the array to be sorted.
   */
  public static int[] selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (array[minIndex] > array[j]) {
          minIndex = j;
        }
      }
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
    return array;
  }

  //main method for code.
  public static void main(String[] args) {
    int[] isStart = {4, 6, 10, 1, 3, 2, 5};
    int[] seStart = {2, 1, 16, 10, 12, 5, 7};
    int[] insertSortRes = insertionSort(isStart);
    int[] selectSortRes = selectionSort(seStart);

    for(int i = 0; i < insertSortRes.length; i++) {
        System.out.print(insertSortRes[i] + " ");
    }
    System.out.print("\n");
    for(int i = 0; i < selectSortRes.length; i++) {
        System.out.print(selectSortRes[i] + " ");
    }
  }
  
}
