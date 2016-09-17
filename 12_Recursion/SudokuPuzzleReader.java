import java.util.*;
import java.io.*;

public class SudokuPuzzleReader {
    private String puzzleFile;

    public SudokuPuzzleReader( String puzzleFile ) {
        this.puzzleFile = puzzleFile;
    }

    public int[][] getPuzzle() throws FileNotFoundException {
        int[][] grid = new int[9][9];
        Scanner in = new Scanner( new File(this.puzzleFile) );

        for( int i = 0; i < 9; i++ ) {
            //Scanner nums = new Scanner( in.nextLine() );

            // a line consists of a blank -, a digit 0-9, or a space
            for( int j = 0; j < 9; j++ ) { 
                int num = in.nextInt();
                if( num >= 0 && num <= 9 ) {
                    grid[i][j] = num;
                } 
            }
        }
        return grid;
    }
}

