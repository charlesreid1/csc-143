import java.util.*;
public class LotterySet {
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBER = 40;
    public static final int PRIZE = 100;

    public static void main(String[] args) {
        Set<Integer> winning = createWinningNumbers();
        Set<Integer> ticket = getTicket();
    
        Set<Integer> matches = new TreeSet<Integer>(ticket);
        matches.retainAll(winning);
    
        System.out.println("Your ticket was: " + ticket);
        System.out.println("Winning ticket was: " + winning);
        if( matches.size() > 0 ) {
            double prize = 100 * Math.pow(2, matches.size());
            System.out.println("Matched numbers: "+matches);
            System.out.printf("Prize: $%.2f\n", prize);
        } else {
            System.out.println("Nope.");
        }
    }

    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winning = new TreeSet<Integer>();
        Random r = new Random();
        while( winning.size() < NUMBERS ) {
            int number = r.nextInt(MAX_NUMBER) + 1;
            winning.add(number);
        }
        return winning;
    }

    // read player's lottery ticket from console
    public static Set<Integer> getTicket() { 
        Set<Integer> ticket = new TreeSet<Integer>();
        Scanner console = new Scanner(System.in);
        System.out.print("Type " + NUMBERS + " lotto numbers (1-40): ");
        while(ticket.size() < NUMBERS) {
            int number = console.nextInt();
            ticket.add(number);
        }
        return ticket;
    }
}
