import java.util.ArrayList;

public class ArrayListFunSolution {


    //create and return a new array such that 
    //each element is the sum of all preceding elements
    //the first element is to remain the same
    public ArrayList<Integer> accumulatingSum(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        int total = 0; 
        for(Integer i : list){ // {1,2,3} => {1, 1, 3, 6}
            total += i;
            newList.add(total);
        }
        newList.add(0, list.get(0));
        return newList;
    }

    //return true if all elements in list are strictly
    //increasing
    public boolean isStrictlyIncreasing(ArrayList<Integer> list){
        for(int i = 1; i < list.size(); i++){
            if(list.get(i-1) >= list.get(i)){
                return false;
            }
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
    public boolean isBalanced(ArrayList<Integer> list){
        int sumA = 0, sumB = 0;
        if(list.size() % 2 != 0){
            for(int i = 0, j = list.size()-1; i != j; i++, j--){
                sumA += list.get(i);
                sumB += list.get(j);
            }
        }else{
            int n = list.size()/2;
            for(int i = 0, j = list.size()-1; i < n; j--, i++){
                sumA += list.get(i);
                sumB += list.get(j);
            }

        }
        return sumA == sumB;
    }

}