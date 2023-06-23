import java.util.Scanner;
public class Human{
   
    private int choice;
    private Scanner input;
    
    public HumanSolution(){
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(){
        System.out.println("How many marbles would you like to take?");
        choice = input.nextInt();
    }
    
    public int getChoice(){
        return choice;
    }
}