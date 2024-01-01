import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args){
        ArrayList<Integer> myFirstArrayList = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            myFirstArrayList.add(Integer.parseInt(args[i]));
        }
        
        for(int i = 0; i < myFirstArrayList.size(); i++){
            System.out.println(myFirstArrayList.get(i));
        }

        myFirstArrayList.remove(new Integer(2002));

        for(Integer i : myFirstArrayList){
            myFirstArrayList.remove(i);
        }

        myFirstArrayList.remove(0);

        for(Integer i : myFirstArrayList){
            System.out.println(i);
        }


        


    }




}