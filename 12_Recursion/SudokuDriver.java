import java.io.*;
public class SudokuDriver {
    public static void main(String[] args) throws FileNotFoundException { 
        SudokuPuzzle s = new SudokuPuzzle("puzzles/example1.txt");
        System.out.println("Getting ready to solve the puzzle:");
        System.out.println(s);
        System.out.println();
        if(s.solve()) {
            System.out.println("Congratulations! You've solved the puzzle:");
            System.out.println( s );
            System.out.println();
        } else {
            System.out.println("Sorry, no solution found!");
            System.out.println( s );
            System.out.println();
        }
    }
}
