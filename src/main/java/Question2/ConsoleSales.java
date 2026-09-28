package Question2;

// FILE 3 - THE SUBCLASS
// Builds on File 2: constructor, any calculation, and the print method.
 
public class ConsoleSales extends AbstractConsole {   // ← CHANGE: subclass name + File 2 name
 
    // Constructor - copy the parameter list from File 2's constructor
    public ConsoleSales(String name, String type, int quantity, double price) {   // ← CHANGE
        super(name, type, quantity, price);   // ← CHANGE: same names, same order
    }
 
    // ONLY IF the question has a calculation (discount, VAT, fine, bill...)
    // Delete this whole method if there is no calculation.
    public double calculateTotal() {
        double total = getQuantity() * getPrice();   // ← CHANGE: the formula
        if (getQuantity() >= 10) {                   // ← CHANGE: the rule
            total = total - (total * 0.10);          // ← CHANGE: e.g. 10% off
        }
        return total;
    }
 
    // ONLY IF the question asks for a yes/no answer (hire staff? approved?)
    // Delete this whole method if there is no decision.
    public String getDecision() {
        if (getQuantity() < 20) {        // ← CHANGE: the rule
            return "YES";
        } else {
            return "NO";
        }
    }
 
    // The print method - use the exact name the question gives
    public void printReport() {                                    // ← CHANGE: name
        System.out.println("\nREPORT TITLE");                      // ← CHANGE
        System.out.println("******************************");
        System.out.println("NAME: " + getName());                  // ← CHANGE: one line
        System.out.println("TYPE: " + getType());                  // ← CHANGE  per
        System.out.println("QUANTITY: " + getQuantity());          // ← CHANGE  variable
        System.out.printf("PRICE: R %.2f%n", getPrice());          // ← CHANGE
        System.out.printf("TOTAL: R %.2f%n", calculateTotal());    // ← delete if no calculation
        System.out.println("DECISION: " + getDecision());          // ← delete if no decision
        System.out.println("******************************");
    }
}
