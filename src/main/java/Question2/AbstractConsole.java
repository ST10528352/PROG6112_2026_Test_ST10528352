package Question2;

// FILE 2 - THE ABSTRACT CLASS
// Stores the data: private variables, a constructor, and a get method for each variable.
 
public abstract class AbstractConsole implements IConsoles {   // ← CHANGE: both names
 
    // One variable per piece of data the question lists
    // (text = String, whole number = int, decimal = double)
    private String StoreName;       
    private String DeviceType;       
    private int quantity;      

 
    // Constructor - same name as the class, one parameter per variable
    public AbstractConsole(String name, String type, int quantity, double price) {   // ← CHANGE
        this.StoreName = name;              
        this.DeviceType = type;              
        this.quantity = quantity;      

    }
 
    // One get method per variable. If the interface lists get methods,
    // use EXACTLY the same names as the interface.
    @Override
    public String getName() {          // ← CHANGE: type + name
        return StoreName;                   // ← CHANGE: the variable it returns
    }
    @Override
    public String getType() {          // ← CHANGE
        return DeviceType;                   // ← CHANGE
    }
    @Override
    public int getQuantity() {         // ← CHANGE
        return quantity;               // ← CHANGE
    }
}
