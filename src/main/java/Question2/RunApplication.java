package Question2;

// FILE 4 - THE RUN CLASS (has main)
// Asks for the values, creates the object, prints the report.
 
import java.util.Scanner;
 
public class RunApplication {   // ← CHANGE: the name the question asks for
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // One prompt + one input line per variable, in the same order as File 2
        System.out.print("Enter the Store: ");      // ← CHANGE: prompt text
        String name = input.nextLine();            // ← CHANGE: text = nextLine()
 
        System.out.print("Enter the Console type: ");      // ← CHANGE
        String type = input.nextLine();            // ← CHANGE
 
        System.out.print("Enter the total sales of PS5 consoles for Number 1 electronic store: ");  // ← CHANGE
        int quantity = input.nextInt();            // ← CHANGE: whole number = nextInt()
 
        // Create the object: subclass name, values in the constructor's order
        ConsoleSales item = new ConsoleSales(name, type, quantity);   
        item.printReport();                        // ← CHANGE: print method name
 
        input.close();
    }
}

