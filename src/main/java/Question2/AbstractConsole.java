package Question2;

// FILE 2 - THE ABSTRACT CLASS
// Stores the data: private variables, a constructor, and a get method for each variable.
 
public abstract class AbstractConsole implements IConsoles {   
 
    // One variable per piece of data the question lists
    // (text = String, whole number = int, decimal = double)
    private String getStore;       
    private String getConsoleType;       
    private int getTotalSales;      

    // Constructor - same name as the class, one parameter per variable
    public AbstractConsole(String name, String type, int quantity) {   
        this.getStore = name;              
        this.getConsoleType = type;              
        this.getTotalSales = quantity;                  
    }
 
    // One get method per variable. If the interface lists get methods,
    // use EXACTLY the same names as the interface.
    public String getName() {         
        return getStore;                   
    }
    public String getType() {          
        return getConsoleType;                   
    }
    public int getQuantity() {         
        return getTotalSales;                               
    }
}
