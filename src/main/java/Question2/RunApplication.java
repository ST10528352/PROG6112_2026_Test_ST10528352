package Question2;

// FILE 4 - THE RUN CLASS (has main)
// Asks for the values, creates the object, prints the report.
import java.util.Scanner;
 
public class RunApplication {   
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = "Unknown"; 

        // 1. Interactive Menu using Scanner (FIRST)
        System.out.println("Select The Console Type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. Switch");
        System.out.print("Enter option number (1-3): ");
        
        int choice = input.nextInt();
        
        // Clean up the leftover newline character from nextInt() 
        // to prevent nextLine() from skipping later
        input.nextLine(); 
        
        // Match selection to option string
        switch (choice) {
            case 1:
                type = "PS5";
                break;
            case 2:
                type = "XBOX";
                break;
            case 3:
                type = "Switch";
                break;
            default:
                System.out.println("Invalid selection. Defaulting to 'Unknown'.");
                type = "Unknown";
                break;
        }

        // 2. Text Prompt for the Store Name (SECOND)
        System.out.print("Enter the Store: ");      
        String name = input.nextLine();            
 
        // 3. Prompt for quantity using the chosen console type
        System.out.print("Enter the total sales of " + type + " consoles for Number 1 electronic store: ");  
        int quantity = input.nextInt();            
 
        // 4. Create object and output report
        ConsoleSales item = new ConsoleSales(name, type, quantity);   
        item.printReport();                        
 
        input.close();
    }
}
