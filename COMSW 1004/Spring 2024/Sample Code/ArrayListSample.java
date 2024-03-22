import java.util.ArrayList;

public class ArrayListSample {

  public static void main(String[] args){
    ArrayList<String> stringList = new ArrayList<String>();
    for (String s : args) {
      stringList.add(s);
    }
  }

  
}
