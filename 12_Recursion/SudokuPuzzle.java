import java.util.*;
import java.io.*;

/** 
 * SudokuPuzzle:
 * This class implements a Sudoku puzzle
 * and a method for recursively solving the
 * Sudoku puzzle using a backtrack algorithm.
 */
public class SudokuPuzzle {
    private int[][] Grid; // Store the 9x9 grid, either '-' or a digit
    private int[] Checker;

    /** Read a problem from a file */
    public SudokuPuzzle( String puzzleFile ) throws FileNotFoundException {
        SudokuPuzzleReader r = new SudokuPuzzleReader(puzzleFile);
        Grid = r.getPuzzle();
    };

    public int get( int r, int c ) {
        return Grid[r][c];
    }

    /** Prints the problem to the screen */
    public String toString() {
        String result = "";
        for( int i = 0; i < 9; i++ ) {
            for( int j = 0; j < 9; j++ ) {
                result += "  " + Grid[i][j];
            }
            result += "\n";
        }
        return result;
    }

    /** Solve the puzzle, returning true if successful and false otherwise */
    public boolean solve() { 
        return recursiveSolve(0,0);
    }

    /** Check if row r is valid */
    private boolean isRowValid( int r ) { 
        Checker = new int[10];

        for( int i = 0; i <= 9; i++ ) {
            Checker[i] = 0;
        }

        for( int i = 0; i < 9; i++ ) {
            if( Grid[r][i] != 0 ) {
                if( Checker[Grid[r][i]]==1 ) {
                    return false;
                }
                Checker[Grid[r][i]] = 1;
            }
        }
        return true;
    }

    /** Check if column c is valid */
    private boolean isColValid( int c ) {
        Checker = new int[10];

        for( int i = 0; i <= 9; i++ ) {
            Checker[i] = 0;
        }

        for( int i = 0; i < 9; i++ ) {
            if( Grid[i][c] != 0 ) {
                if( Checker[Grid[i][c]]==1 ) {
                    return false;
                }
                Checker[Grid[i][c]] = 1;
            }
        }
        return true;
    }

    /** Check if 3x3 panel is valid */
    private boolean isPanelValid( int sr, int sc ) {
        return true;
    }

    /** Fills in blank cells, assumes all rows before r and c have been solved, calls itself recursively. */
    private boolean recursiveSolve( int r, int c ) { 

        // Skip values that are already set 
        while( r < 9 && this.get(r,c)>0 ) {
            c++;
            if( c==9 ) {
                r++;
                c=0;
            }
        }

        // Base case: done
        if( r==9 ) {
            return true;
        }

        for(int i=1; i<=9; i++ ) {
            Grid[r][c] = i;
            if( isRowValid(r) 
             && isColValid(c) 
             && isPanelValid(r - r%3, c - c%3) 
             && recursiveSolve(r,c) ) {
                return true;
             }
        }

        Grid[r][c] = 0;
        return false;
    }
}
