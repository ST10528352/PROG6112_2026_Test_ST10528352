package Question2;

// FILE 3 - THE SUBCLASS
// Builds on File 2: constructor, any calculation, and the print method.
 
public class ConsoleSales extends AbstractConsole {   
 
    // Constructor - copy the parameter list from File 2's constructor
    public ConsoleSales(String name, String type, int quantity) {  
        super(name, type, quantity);
    }
 
    // The print method - use the exact name the question gives
    @Override
    public void printReport() {                                    
        System.out.println("\nCONSOLE SALES REPORT");                      
        System.out.println("******************************");
        System.out.println("NAME: " + getStore());                  
        System.out.println("TYPE: " + getConsoleType());                  
        System.out.printf("TOTAL: " + getTotalSales());    
    }
@Override
    public String getStore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public String getConsoleType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
        public int getTotalSales() {
        throw new UnsupportedOperationException("Not supported yet.");
}}