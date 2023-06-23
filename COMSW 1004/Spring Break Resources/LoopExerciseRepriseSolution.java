import java.util.Scanner; 

public class LoopExerciseRepriseSolution{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number greater than the previous: ");
        int b = sc.nextInt();
        System.out.println("How many powers of 2 do you want: ");
        int n = sc.nextInt();
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println("You want to see every what letter? ");
        int x = sc.nextInt();
        System.out.println("Enter another String: ");
        String w = sc.next();

        System.out.println("-------------------------");
        System.out.println(evenNumbersFromAToB(a,b));
        System.out.println(sumOfFirstNPowersOfTwo(n));
        System.out.println(everyNthLetterOfAString(s, x));
        System.out.println(wordWithOnlyVowels(w));
        System.out.println("-------------------------");
    }

    //implement this method it should return a String with all even
    //numbers from a to b in the following format "2k 2k+2 2k+4" 
    public static String evenNumbersFromAToB(int a, int b){
        String result = "";
        for(int i = a; i <= b; i++){
            if(i % 2 == 0){
                result += i + " ";
            }
        }
        return result;
    }

    //implement this method it should return a String with the 
    //sum of the first n powers of 2 starting at 2^0
    public static String sumOfFirstNPowersOfTwo(int n){
        String result = "";
        for(int i = 0; i < n; i++){
            result += (int)Math.pow(2,i) + " ";
        }
        return result;
    }

    //implement this method it should return a String with every
    //nth letter separated by a space: "a0 aN a2N"
    public static String everyNthLetterOfAString(String s, int n){
        String result = "";
        for(int i = 0; i < s.length(); i += n){
            result += s.substring(i,i+1);
            result += " ";
        }
        return result;
    }

    //implement this method it should return the String s with only 
    //the vowels remaining
    public static String wordWithOnlyVowels(String s){
        String consonant = "bcdfghjklmnpqrstvwxyz", result = "";
        for(int i = 0; i < s.length(); i++){
            String c = s.substring(i,i+1);
            if(!consonant.contains(c)){
                result += s.charAt(i);
            }
        }
        return result;
    }








}