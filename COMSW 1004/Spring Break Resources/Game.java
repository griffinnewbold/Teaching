public class Game{
    
    private int marbles;
    private HumanSolution humanPlayer;
    private ComputerSolution computerPlayer;
    
    public Game(int difficulty) {
        marbles = (int)((Math.random() * 91) + 10);
        humanPlayer = new Human();
        computerPlayer = new Computer(difficulty);
    }
     
    public void play() {
        int turn = Math.round((float) Math.random());
        while (marbles > 0) {
            playRound(turn);
            turn = Math.abs(turn - 1);
        }
        if (turn == 0) {
            System.out.println("\nYou win the game!!!");
        } else {
            System.out.println("\nComputer wins the game.");
        }
    }
    private void playRound(int turn) {
        System.out.println("There are currently " + marbles + " marbles.");
        if (turn == 0) {
            System.out.println("\n--------Human's Turn--------");
            humanPlayer.move();
            int maxMarbles = marbles == 1 ? 1 : marbles / 2;

            while (humanPlayer.getChoice() < 1 || 
                    humanPlayer.getChoice() > maxMarbles) {
                System.out.println("You must take at least one marble " + 
                    "and at most " +maxMarbles + " marbles!");
                humanPlayer.move();
            }
            marbles -= humanPlayer.getChoice();
        } else {
            System.out.println("\n--------Computer's Turn--------");
            computerPlayer.move(marbles);
            marbles -= computerPlayer.getChoice();
        }
    }
}