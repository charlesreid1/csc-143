// This gives us access to the Random class:
import java.util.*; 

/**
 * Prisoners Dilemma Game: Starter Class
 * Worksheet 3
 *
 * Use this code to help you get started 
 * implementing the Prisoners' Dilemma Game
 * for worksheet 3.
 */
public class PrisonersDilemmaGame {

    /* These store confessions (Boolean: T/F Do they confess?) and added sentence time,
     * according to worksheet specifications */ 

    ArrayList<Boolean> rpConfessions; // Rainbow Pony Gang: did they confess or not
    ArrayList<Integer> rpTime; // Rainbow Pony Gang: added time

    ArrayList<Boolean> psConfessions; // Plaid Socks Gang: did they confess or not
    ArrayList<Integer> psTime; // Plaid Socks Gang: added time

    int Nrounds;
    boolean isRunning;

    public PrisonersDilemmaGame() {
        // Link for random number documentation:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        this.isRunning = false;
    }

    public void runGame() { 
        // Run all rounds
    }

    public void runOneRound() {
        this.isRunning = true;

        // Prisonsers decide wehther to confess or not randomly. 
        // Change this to change each gang's strategy.
        boolean rpConfess = Random.nextBoolean();
        boolean psConfess = Random.nextBoolean();

        // Add these confession outcomes to the confessions ArrayLists

        // Determine how much time each gang had added to their time:
        // add elements to rpTime and psTime.
        if( /* both rpConfess and psConfess are true */) { 
        } else if( /* only rpConfess is true */ ) { 
        } else if( /* only psConfess is true */ ) {
        } else if( /* both rpConfess and psConfess are false */ ) {
        }
    }
}
