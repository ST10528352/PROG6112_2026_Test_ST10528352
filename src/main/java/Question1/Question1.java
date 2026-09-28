package Question1;

import java.util.Scanner;   // ← needed for Box 1B (user types values). Harmless otherwise.
 
public class Question1 {   // ← must be the same as your file name
 
    public static void main(String[] args) {

        // BOX 1 - THE TABLE (values are given in the question)
 
        // Words down the LEFT side of the question's table
        String[] rowNames = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};   // ← CHANGE
 
        // Words along the TOP of the question's table
        String[] colNames = {"PS5", "XBOX", "SWITCH"};   // ← CHANGE
 
        // The numbers: one { } per ROW of the table, one number per COLUMN
        int[][] data = {
            {1000, 2000, 3000},    // ← CHANGE: numbers for ROW 1
            {2000, 3000, 4000},    // ← CHANGE: numbers for ROW 2
            {1500, 1100, 1200}     // ← CHANGE: numbers for ROW 3 (no comma on the last one)
        };
        
        // BOX 2 - PRINT THE TABLE
        System.out.println("----------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");   // ← CHANGE
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
        

        
        // BOX 3 - TOTAL FOR EACH ROW
 
        int[] rowTotals = new int[rowNames.length];   // one total per row
 
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < colNames.length; c++) {
                rowTotals[r] = rowTotals[r] + data[r][c];   // add across the row
            }
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");   // ← CHANGE text
        System.out.println("----------------------------------------------");
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
        System.out.println("\nCITY WITH THE MOST SALES: " + rowNames[best]);   // ← CHANGE text

    }
}
