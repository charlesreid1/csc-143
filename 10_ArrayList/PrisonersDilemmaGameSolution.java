// This gives us access to the Random class:
import java.util.*; 

/**
 * Prisoners Dilemma Game: Solution
 *
 * Dr. Reid
 * CSC 143
 * Worksheet 3
 */
public class PrisonersDilemmaGameSolution {

    /* These store confessions (Boolean: T/F Do they confess?) and added sentence time,
     * according to worksheet specifications */ 

    ArrayList<Boolean> rpConfessions; // Rainbow Pony Gang: did they confess or not
    ArrayList<Integer> rpTime; // Rainbow Pony Gang: added time

    ArrayList<Boolean> psConfessions; // Plaid Socks Gang: did they confess or not
    ArrayList<Integer> psTime; // Plaid Socks Gang: added time

    int Nrounds;
    int currentRound;
    boolean isRunning;

    /** The constructor initializes variables and gets the game ready to run. */
    public PrisonersDilemmaGame() {
        // Link for random number documentation:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        Random r = new Random();
        Nrounds = 100 + r.nextInt(101);
        currentRound = 0;
        this.isRunning = false;

        rpConfessions = new ArrayList<Boolean>();
        this.rpTime = new ArrayList<Integer>();

        psConfessions = new ArrayList<Boolean>();
        this.psTime = new ArrayList<Integer>();
    }

    /** This runs all rounds of the game. */
    public void runGame() { 
        this.isRunning = true;
        for( currentRound = 1; currentRound <= Nrounds; currentRound++ ) {
            runOneRound();
        }
        this.isRunning = false;
        gameSummary();
    }

    public void runOneRound() {
        this.isRunning = true;

        // Prisonsers decide wehther to confess or not randomly. 
        // Change this to change each gang's strategy.
        Random r = new Random();
        boolean rpConfess = r.nextBoolean();
        boolean psConfess = r.nextBoolean();

        // Add these confession outcomes to the confessions ArrayLists

        // Determine how much time each gang had added to their time:
        // add elements to rpTime and psTime.
        int rp = 0;
        int ps = 0;
        if( rpConfess && psConfess ) { 
            rp = 5; ps = 5;
        } else if( rpConfess && !psConfess ) { 
            rp = 0; ps = 20;
        } else if( psConfess && !rpConfess ) { 
            rp = 20; ps = 0;
        } else {
            rp = 2; ps = 2;
        }
        this.rpTime.add(rp);
        this.psTime.add(ps);
    }

    /** Find the cumulative sum of an ArrayList of integers */
    private int cSum(ArrayList<Integer> times) { 
        int sum = 0;
        for(Integer i : times) {
            sum += i;
        }
        return sum;
    }

    public void gameSummary()  {
        int rpSum = cSum(this.rpTime); 
        int psSum = cSum(this.psTime);

        String rpStr = "The Rainbow Pony Gang";
        String psStr = "The Plaid Socks Gang";

        System.out.printf("%s: %d years      %s: %d years \n", rpStr, rpSum, psStr, psSum);
        
        String gameState;
        String winner;
        if(isRunning){
            gameState = " is in the lead ";
        } else {
            gameState = " won ";
        }
        
        if( psSum < rpSum ) {
            winner = psStr;
        } else if( rpSum < psSum ) {
            winner = rpStr;
        } else {
            winner = "Nobody";
        }

        System.out.printf("%s %s after %d rounds!\n", winner, gameState, currentRound);
    }

    public static void main(String[] args) { 
        PrisonersDilemmaGame p = new PrisonersDilemmaGame();
        p.runGame();
    }
}
