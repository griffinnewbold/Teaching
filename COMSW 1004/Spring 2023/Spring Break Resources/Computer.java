import java.util.Random;

public class Computer{
    
    private int mode;
    private int choice;
    private Random rn;
    
    public Computer(int m){
        mode = m;
        choice = -1;
        rn = new Random();
    }
    
    public void move(int marblesLeft){
        if (marblesLeft == 1) {
            choice = 1;
        }else if (mode == 1) {
            choice = rn.nextInt(marblesLeft/2) + 1; 
        }else {
            if (marblesLeft == 3 || marblesLeft == 7 || marblesLeft == 15
                   || marblesLeft == 31 || marblesLeft == 63) {
                choice = rn.nextInt(marblesLeft/2) + 1;
            }else { 
                int i = 0;
                while (i < 7 && Math.pow(2, i) <= marblesLeft) {
                        i++;
                }
                double powerTwoMinusOne = Math.pow(2, (i-1)) - 1; 
                choice = marblesLeft - (int)powerTwoMinusOne;
            }
        }    
    }  
 
    public int getChoice(){
        return choice;
    }   
}