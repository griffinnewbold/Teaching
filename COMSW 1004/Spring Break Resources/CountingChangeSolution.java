import java.util.Scanner; 

public class CountingChangeSolution{

    //Do not alter the main method 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much is due? (in pennies)");
        int amountDue = sc.nextInt();
        System.out.println("How much was received? (in pennies)");
        int amountReceived = sc.nextInt();

        String loopResult = countChangeWithLoop(amountDue, amountReceived);
        String noLoopResult = countChangeNoLoop(amountDue, amountReceived); 
        
        System.out.println(loopResult);
        System.out.println(noLoopResult);
        System.out.println(loopResult.equals(noLoopResult));
    }

    //Please implement the following methods
    public static String countChangeWithLoop(int amountDue, int amountReceived){
        int difference = amountReceived - amountDue;
        int dollars = 0, quarters = 0, dimes = 0, nickels = 0;

        while(difference > 5){
            if(difference - 100 >= 0){
                dollars++;
                difference -= 100;
            }else if(difference - 25 >= 0){
                quarters++;
                difference -= 25;
            }else if(difference - 10 >= 0){
                dimes++;
                difference -= 10;
            }else if(difference - 5 >= 0){
                nickels++;
                difference -= 5;
            }
        }

        String result = "";
        result += "Dollars: " + dollars;
        result += " Quarters: " + quarters;
        result += " Dimes: " + dimes; 
        result += " Nickels: " + nickels;
        result += " Pennies: " + difference;
        return result;
    }

    public static String countChangeNoLoop(int amountDue, int amountReceived){
        int difference = amountReceived - amountDue;
        int dollars = difference / 100;
        difference %= 100;
        int quarters = difference / 25;
        difference %= 25;
        int dimes = difference / 10;
        difference %= 10;
        int nickels = difference / 5;
        difference %= 5;
        
        String result = "";
        result += "Dollars: " + dollars;
        result += " Quarters: " + quarters;
        result += " Dimes: " + dimes; 
        result += " Nickels: " + nickels;
        result += " Pennies: " + difference;
        return result;

    }






}