package Question2;

// FILE 3 - THE SUBCLASS
// Builds on File 2: constructor, any calculation, and the print method.
 
public class ConsoleSales extends AbstractConsole {   // ← CHANGE: subclass name + File 2 name
 
    // Constructor - copy the parameter list from File 2's constructor
    public ConsoleSales(String name, String type, int quantity, double price) {   // ← CHANGE
        super(name, type, quantity, price);   // ← CHANGE: same names, same order
    }
 
    // The print method - use the exact name the question gives
    public void printReport() {                                    // ← CHANGE: name
        System.out.println("\nCONSOLE SALES REPORT");                      // ← CHANGE
        System.out.println("******************************");
        System.out.println("NAME: " + getName());                  // ← CHANGE: one line
        System.out.println("TYPE: " + getType());                  // ← CHANGE  per
        System.out.printf("TOTAL: " + getTotalSales());    // ← delete if no calculation
    }
}
