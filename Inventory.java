
/**
 * Inventory class
 * 
 * @author Sukhman Nijjer 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Inventory class with one instance variable
 */
public class Inventory
{
    private static ArrayList<Vehicle> vehicles;
    
    /**
     * Default constructor
     */
    public Inventory()
    {
        vehicles = new ArrayList<Vehicle>();
    }
    
    /**
     * @param _vehicles
     */
    public static void setVehicles(ArrayList<Vehicle> _vehicles)
    {
        vehicles = _vehicles;
    }
    
    /**
     * @return vehicles
     */
    public static ArrayList<Vehicle> getVehicles()
    {
       return vehicles; 
    }
    
    /**
     * @param vehicle
     * Checks if the vehicle is null
     */
    public void addVehicle(Vehicle vehicle)
    {
       if(vehicle != null)
       {
          vehicles.add(vehicle); 
       }
       else 
       {
           System.out.println("Your vehicle is null");
        }
    }
    
    /**
     * @param model
     * Search inventory for mode speacified and adds it to ArrayList
     * Forwards it to method for display.
     */
    public void searchByModel(String model)
    {
       ArrayList<Vehicle> results = new ArrayList<Vehicle>();
       for(Vehicle v : vehicles)
       {
           if(v.getModel().equals(model))
           {
               results.add(v);
            }
        }
        dispalySearchResults(results);
        
    }
    
    /**
     * @param year
     * Search inventory for year specified and adds it to the ArrayList
     * Forward it to the method for display
     */
    public void searchByYear(int year)
    {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle v : vehicles)
        {
            if(v.getYear() == (year))
            {
                results.add(v);
            }
        }
         dispalySearchResults(results);
    }
    
    /**
     * @param minPrice
     * @param maxPrice
     * Search inventory for price specified and adds it to the ArrayList
     * Forward it to the method for display
     */
    public void searchByPrice(double minPrice, double maxPrice)
    {
       ArrayList<Vehicle> results = new ArrayList<Vehicle>();
       for(Vehicle v : vehicles)
       {
           if(minPrice <= v.getSellingPrice() && maxPrice >= v.getSellingPrice())
           {
               results.add(v);
            }
            
        }
         dispalySearchResults(results);
    }
    
    /**
     * @param results
     * Displays the Vehicle compiled by above searches
     */
    public void dispalySearchResults(ArrayList<Vehicle> results)
    {
        for(Vehicle v : vehicles)
        {
            v.printDetails();
            System.out.println();
        }
    }
    
    /**
     * @param stockCode
     * Removes the vehicle from Arraylist
     */
    public static void removeVehicle(String stockCode)
    {
        Iterator<Vehicle> it = vehicles.iterator();
        while(it.hasNext())
        {
            Vehicle v = it.next();
            if(v.getStockCode().equals(stockCode))
            {
                it.remove();
            }
        }
        
    }
    
    /**
     * @return number of vehicles currently in the inventory.
     */
    public String inventoryCount()
    {
        int inventoryCount = vehicles.size() + 1;
        return "There are"+" "+ inventoryCount+" "+"vehicles in the inventory.";
    }
    
    /**
     * @return dollar value of all the vehicles in the inventory.
     */
    public String inventoryValue()
    {
        double inventoryValue = 0;
        for(Vehicle v : vehicles)
        {
             inventoryValue += v.getdealerCost();
        }
        return "You have $"+ inventoryValue + " in stock.";
    }
    
    /**
     * Displays all the details for each vehicle in the inventory.
     */
    public void displayInventory()
    {
        System.out.println(inventoryCount());
        System.out.println("\nJalopies Are Us Vehicle Summary:\n");
        for(Vehicle index : vehicles) {
            index.printDetails();
            System.out.println();
        }
    }
}

