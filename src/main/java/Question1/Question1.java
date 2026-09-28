package Question1;

import java.util.Scanner;   // ← needed for Box 1B (user types values). Harmless otherwise.
 
public class Question1 {   // ← must be the same as your file name
 
    public static void main(String[] args) {

        // BOX 1 - THE TABLE (values are given in the question)
 
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
        
        // BOX 2 - PRINT THE TABLE
        System.out.println("----------------------------------------------");
        System.out.println("\nGAMING CONSOLE REPORT");   // ← CHANGE
        System.out.println("----------------------------------------------");
  
        // Top line: an empty corner, then each column name
        System.out.printf("%-15s", "");
        for (int c = 0; c < colNames.length; c++) {
            System.out.printf("%10s", colNames[c]);
        }
        System.out.println();
 
        // One line per row: the row name, then its numbers
        for (int r = 0; r < data.length; r++) {
            System.out.printf("%-15s", rowNames[r]);
            for (int c = 0; c < colNames.length; c++) {
                System.out.printf("%10d", data[r][c]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

        
        // BOX 3 - TOTAL FOR EACH ROW
 
        int[] rowTotals = new int[rowNames.length];   // one total per row
 
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < colNames.length; c++) {
                rowTotals[r] = rowTotals[r] + data[r][c];   // add across the row
            }
        }
 
        System.out.println("\nTOTAL FOR EACH ROW");   // ← CHANGE text
        for (int r = 0; r < rowNames.length; r++) {
            System.out.printf("%-15s%10d%n", rowNames[r], rowTotals[r]);
        }
        
        // BOX 5 - WHICH ROW HAS THE HIGHEST TOTAL   (Box 4 must be above this)
 
        int best = 0;   // position of the best row so far
        for (int r = 1; r < rowNames.length; r++) {
            if (rowTotals[r] > rowTotals[best]) {   // change > to < for the LOWEST
                best = r;
            }
        }
        System.out.println("\nHighest total: " + rowNames[best]);   // ← CHANGE text

    }
}
