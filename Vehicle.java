/**
 * @author Bullwinkle Moose
 * @version 1.0
 */

import java.text.DecimalFormat;

public class Vehicle
{
    private String stockCode;
    private String make;
    private String model;
    private int year;
    private double dealerCost;
    private double sellingPrice;
    private double profitMargin;

    private static final int CURRENT_YEAR = 2016;
    private static final int OLDEST_YEAR = 1970;

    /**
     * Default Constructor for Objects of class Vehicle.
     */
    public Vehicle()
    {

    }

    /**
     * Constructor for Objects of class Vehicle.
     *
     * @param _stockCode to initialize stockCode field
     * @param _make to initialize make field
     * @param _model to initialize model field
     * @param _year to initialize year field
     */
    public Vehicle(String _stockCode, String _make, String _model, int _year)
    {
        stockCode = _stockCode;
        make = _make;
        model = _model;

        if(_year >= OLDEST_YEAR && _year <= CURRENT_YEAR)
        {
            year = _year;
        }
    }

    /**
     * @return the vehicle stockCode as String
     */
    public String getStockCode()
    {
        return stockCode;
    }

    /**
     * @return the make as String
     */
    public String getMake()
    {
        return make;
    }

    /**
     * @return the model as String
     */
    public String getModel()
    {
        return model;
    }

    /**
     * @return the year as int
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return the dealerCost as double
     */
    public double getdealerCost()
    {
        return dealerCost;
    }

    /**
     * @return the sellingPrice as double
     */
    public double getSellingPrice()
    {
        return sellingPrice;
    }

    /**
     * @return the profit margin on the vehicle if sold, as double
     */
    public double getProfitMargin()
    {
        return profitMargin;
    }

    /**
     * @param _stockCode sets the value for the stockCode field.
     */
    public void setStockCode(String _stockCode)
    {
        stockCode = _stockCode;
    }

    /**
     * @param _make sets the value for the make field.
     */
    public void setMake(String _make)
    {
        make = _make;
    }

    /**
     * @param _model sets the value for the model field.
     */
    public void setModel(String _model)
    {
        model = _model;
    }

    /**
     * @param _year sets the value for the year field
     */
    public void setYear(int _year)
    {
        if(_year >= OLDEST_YEAR && _year <= CURRENT_YEAR)
        {
            year = _year;
        }
        else
        {
            System.out.println("invalid input");
        }
    }

    /**
     * @param _dealerCost sets the value for the dealerCost field
     */
    public void setDealerCost(double _dealerCost)
    {
        if(_dealerCost >= 0)
        {
            dealerCost = _dealerCost;

        }
        else
        {
            System.out.println("invalid input");
        }
    }

    /**
     * @param _sellingPrice sets the sellingPrice only if it is at least 25% than dealerCost
     */
    public void checkStandardSellingPrice(double _sellingPrice)
    {
        if(_sellingPrice >= (dealerCost * 1.25))
        {
            sellingPrice = _sellingPrice;
        }
        else
        {
            System.out.println("The dealer cost is: $" + dealerCost + ". Sale price $" + _sellingPrice + " is not high enough");
        }
    }

    /**
     * @param _sellingPrice sets the value for the sellingPrice field
     */
    public void setSellingPrice(double _sellingPrice)
    {
        if(_sellingPrice >= 0)
        {
            sellingPrice = _sellingPrice;

        }
        else
        {
            System.out.println("invalid input");
        }
    }

    /**
     * calculates the profit margin for selling a vehicle
     */
    public void calculateProfitMargin()
    {
        profitMargin = (sellingPrice - dealerCost) / sellingPrice;
    }

    /**
     * @return the profit on selling a vehicle as a dollar value.
     */
    public double calculateProfit()
    {
        return sellingPrice - dealerCost;
    }

    /**
     * formats and displays all vehicle information.
     */
    public void printDetails()
    {
        DecimalFormat formatter = new DecimalFormat("$0.00");
        DecimalFormat percentFormatter = new DecimalFormat("0%");

        System.out.println("Jalopies Are Us Vehicle Summary: ");
        System.out.println("Vehicle: " + year + " " + make + " " + model);
        System.out.println("Stock Code:" + stockCode);
        System.out.println("Dealer Cost: " + formatter.format(dealerCost));
        System.out.println("Selling Price: " + formatter.format(sellingPrice));
        System.out.println("Profit Margin: " + percentFormatter.format(profitMargin));
        System.out.println("Dollar Profit: " + formatter.format(calculateProfit()));
    }
}
