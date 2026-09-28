package Question1;

import java.util.Scanner;   // ← needed for Box 1B (user types values). Harmless otherwise.
 
public class Question1 {   // ← must be the same as your file name
 
    public static void main(String[] args) {

        // BOX 1A - THE TABLE (values are given in the question)
 
        // Words down the LEFT side of the question's table
        String[] rowNames = {"ROW 1", "ROW 2", "ROW 3"};   // ← CHANGE
 
        // Words along the TOP of the question's table
        String[] colNames = {"COL 1", "COL 2", "COL 3"};   // ← CHANGE
 
        // The numbers: one { } per ROW of the table, one number per COLUMN
        int[][] data = {
            {10, 20, 30},    // ← CHANGE: numbers for ROW 1
            {40, 50, 60},    // ← CHANGE: numbers for ROW 2
            {70, 80, 90}     // ← CHANGE: numbers for ROW 3 (no comma on the last one)
        };
        
        
    }
}
