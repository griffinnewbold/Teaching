import java.util.*;

public class ArrayListSample {

  public static void main(String[] args){
    ArrayList<String> stringList = new ArrayList<String>();
    for (String s : args) {
      stringList.add(s);
    }
    System.out.println(stringList);
  }

  
}
