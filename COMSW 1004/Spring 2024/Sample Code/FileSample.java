import java.io.*;
import java.util.Scanner;

public class FileSample {


    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File(args[0]);
        Scanner parser = new Scanner(myFile);
        PrintWriter writer = new PrintWriter(args[1]);

        while (parser.hasNext()) {
            writer.println(parser.next());
        }
        writer.close();
        parser.close();
    }



}