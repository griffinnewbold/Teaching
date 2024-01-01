import java.util.Scanner; 

public class ConditionalPracticeSolution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(numericToLetterGrade(n));

        boolean a = true, b = true;
        System.out.println(nandGate(a,b));
        System.out.println(xorGate(a,b));
        System.out.println(xnorGate(a,b));

        b = false;
        System.out.println(nandGate(a,b));
        System.out.println(xorGate(a,b));
        System.out.println(xnorGate(a,b));

        a = false;
        System.out.println(nandGate(a,b));
        System.out.println(xorGate(a,b));
        System.out.println(xnorGate(a,b));

        b = true;
        System.out.println(nandGate(a,b));
        System.out.println(xorGate(a,b));
        System.out.println(xnorGate(a,b));

    }

    /*implement the following method according to these instruction
     *return a String representative of the letter grade received when 
     *a student receives a numeric grade n such that:
     * >= 98 A+ 93 <= A < 98 88 <= A- < 93
     * 85 <= B+ < 88  83 <= B < 85  80 <= B- < 83
     * 77 <= C+ < 80  73 <= C < 77  70 <= C- < 73 
     * 65 <= D < 70  < 65 F */
    public static String numericToLetterGrade(int n){
        if(n >= 98){
            return "A+";
        }else if(n >= 93 && n < 98){
            return "A";
        }else if(n >= 88 && n < 93){
            return "A-";
        }else if(n >= 85 && n < 88){
            return "B+";
        }else if(n >= 83 && n < 85){
            return "B";
        }else if(n >= 80 && n < 83){
            return "B-";
        }else if(n >= 77 && n < 80){
            return "C+";
        }else if(n >= 73 && n < 77){
            return "C";
        }else if(n >= 70 && n < 73){
            return "C-";
        }else if(n >= 65 && n < 70){
            return "D";
        }else{
            return "F";
        }
    }

    //A nand gate is defined as the inverting of an and gate
    //using the logical symbols taught, implement a nand gate
    public static boolean nandGate(boolean a, boolean b){
        return !(a && b);
    }

    //A xor gate is defined as a gate which is true if and
    //only if only one of its operands is true, implement a 
    //xor gate
    public static boolean xorGate(boolean a, boolean b){
        return (a || b) && (!a || !b);
    }

    //An xnor gate is defined as the inverting of an xor 
    //implement this method in a single line using code you
    //already wrote
    public static boolean xnorGate(boolean a, boolean b){
        return !xorGate(a,b);
    }






}