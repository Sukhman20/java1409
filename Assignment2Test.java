
public class Assignment2Test {

	/**
	 * @param args
	 */
	public static void test() {

		/*System.out.println("TESTING constructor validation--------");
		System.out.println(new Vehicle("1974CevMC", "", "Monte Carlo", 1974));
		System.out.println(new Vehicle("1974CevMC", "Chevrolet", null, 1974));
		System.out.println(new Vehicle("1974CevMC", "Chevrolet", "Monte Carlo", 2015));*/
		
		System.out.println("\nTESTING valid object--------");
		Vehicle vehicle = new Vehicle("1974CevMC", "Chevrolet", "Monte Carlo", 1974);
		vehicle.setDealerCost(250.00);
		//vehicle.checkStandardSellingPrice(300.00);
		//vehicle.checkStandardSellingPrice(395.95);
		@SuppressWarnings("unused")
		Customer tester = new Customer("daRby", "doG", "", "", "123-123-1234");
		Customer customer = new Customer("daRby", "doG", "DL-1234567890", "K9 Woofer Road", "123-123-1234");
		PurchaseDate purchaseDate = new PurchaseDate(2014, 05, 20);
		VehiclePurchase purchase = new VehiclePurchase(customer, purchaseDate, vehicle, true);
		
		purchase.calculatePurchasePrice(395.95);
		vehicle.calculateProfitMargin();
		purchase.displayPurchaseInformation();

	}

}
