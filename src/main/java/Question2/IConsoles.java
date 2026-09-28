package Question2;

public interface IConsoles {
    
   // Keep only the lines the question lists
    public String getName();       // ← CHANGE: get methods from the question
    public String getType();       // ← CHANGE
    public int getQuantity();      // ← CHANGE
    public double getPrice();      // ← CHANGE
 
    public void printReport();     // ← CHANGE: print method from the question
}

