/**
 * Information Object for a musical instrument rental.
 *
 * @author Sukhman Nijjer
 * @version this one
 */

public class VehiclePurchase
{
    private Customer customer;
    private PurchaseDate purchaseDate;
    private Vehicle vehiclePurchased;
    private boolean servicePackage;

    public static final double SERVICE_FEE = 500.00;

    /**
     * @param customer
     * @param purchaseDate
     * @param vehiclePurchased
     */
    public VehiclePurchase(Customer customer, PurchaseDate purchaseDate, Vehicle vehiclePurchased, boolean servicePackage)
    {
        this.customer = customer;
        this.purchaseDate = purchaseDate;
        this.vehiclePurchased = vehiclePurchased;

        this.servicePackage = servicePackage;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * @return the purchaseDate
     */
    public PurchaseDate getPurchaseDate()
    {
        return purchaseDate;
    }

    /**
     * @return the vehiclePurchased
     */
    public Vehicle getVehiclePurchased()
    {
        return vehiclePurchased;
    }

    /**
     * @return the servicePackage
     */
    public boolean isServicePackage()
    {
        return servicePackage;
    }

    /**
     * @param servicePackage the servicePackage to set
     */
    public void setServicePackage(boolean servicePackage)
    {
        this.servicePackage = servicePackage;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     * @return the total price of the purchased vehicle as a double
     */
    public void calculatePurchasePrice(double purchasePrice)
    {
        vehiclePurchased.checkStandardSellingPrice(purchasePrice);

        if(servicePackage)
        {
            vehiclePurchased.setSellingPrice(vehiclePurchased.getSellingPrice() + SERVICE_FEE);
        }
    }

    /**
     * Display the rental agreement information
     */
    public void displayPurchaseInformation()
    {
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Purchase Date: " + purchaseDate.getFullDate());
        System.out.print("Vehicle Description: ");
        vehiclePurchased.printDetails();

        if(servicePackage)
        {
            System.out.println("SERVICE PACKAGE INCLUDED");
        }
        
        Inventory inventory = new Inventory();
        Inventory.removeVehicle(vehiclePurchased.getStockCode());
    }
}
