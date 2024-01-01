public class ArrayFunSolution{


    //create and return a new array such that 
    //each element is the sum of all preceding elements
    //the first element is to remain the same
    public int[] accumulatingSum(int[] list){
        int[] newList = new int[list.length+1];
        int idx = 0, total = 0;

        for(Integer i : list){
            newList[idx] = idx++ == 0 ? i : total;
            total += i; 
        }

        newList[idx] = total;
        return newList;
    }

    //return true if all elements in list are strictly
    //increasing
    public boolean isStrictlyIncreasing(int[] list){
        for(int i = 1; i < list.length; i++){
            if(list[i-1] >= list[i])
                return false;
        }
        return true;
    }

    /*
    return true if list is balanced 
    an array is balanced if and only if the
    elements to the left of the of the midpoint 
    is equal in sum to the elements of the right of 
    midpoint not including the midpoint, if the length
    is even then you'd include both middles in their halves */
    public boolean isBalanced(int[] list){
        int sumA = 0, sumB = 0;
        if(list.length % 2 != 0){
            for(int i = 0, j = list.length-1; i != j; i++, j--){
                sumA += list[i];
                sumB += list[j];
            }
        }else{
            int n = list.length/2;
            for(int i = 0, j = list.length-1; i < n; j--, i++){
                sumA += list[i];
                sumB += list[j];
            }

        }
        return sumA == sumB;
    }

}