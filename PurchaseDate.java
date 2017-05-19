/**
 * PurchaseDate class. A date has a year, month and day, all numbers.
 * A date cannot be invalid, meaning that the year cannot be
 * later than the current year and the day and month must fall
 * within valid ranges. This class does not take into account
 * months with varying numbers of days.
 * <p>
 * NOTE TO STUDENTS: This class uses a private "helper" method that
 * takes a date component (int) as its parameter and returns a String
 * consisting of the date component padded with a leading zero if appropriate.
 * This extra method was not required in the assignment, but was added
 * to avoid writing the same code in two different places.
 *
 * @author Bullwinkle Moose
 * @version May 2014
 */
public class PurchaseDate
{
    // constants
    public static final int CURRENT_YEAR = 2014;
    public static final int JANUARY = 1;
    public static final int DECEMBER = 12;
    public static final int FIRST_DAY = 1;
    public static final int LAST_DAY = 31; // possible problems here!
    public static final int DOUBLE_DIGIT = 10;

    // instance variables
    private int year;
    private int month;
    private int day;

    /**
     * Constructor for objects of class Date. The constructor
     * expects three integer parameters: year, month and day.
     * If the year is not valid it defaults to the current year.
     * If the month or the day is not valid it defaults to the first
     * possible value for that field.
     */
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
        // validate the year and set
        if(theYear <= CURRENT_YEAR)
        {
            year = theYear;
        }
        else
        { // not valid so use the default
            year = CURRENT_YEAR;
        }

        // validate the month and set
        if(theMonth >= JANUARY && theMonth <= DECEMBER)
        {
            month = theMonth;
        }
        else
        { // not valid so use the default
            month = JANUARY;
        }

        // validate the day and set
        if(theDay >= FIRST_DAY && theDay <= LAST_DAY)
        {
            day = theDay;
        }
        else
        { // not valid so use the default
            day = FIRST_DAY;
        }
    }

    /**
     * Get the day.
     *
     * @return the day as an int
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Get the month.
     *
     * @return the month as an int
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Get the year.
     *
     * @return the year as an int
     */
    public int getYear()
    {
        return year;
    }

    /*
     * Tests one of the date numbers and returns it as a String,
     * with leading zero if appropriate.
     * @return a String for a month or day
     */
    private String getDateString(int date)
    {
        // date is a number with a single digit so pad with zero
        if(date < DOUBLE_DIGIT)
        {
            return "0" + date;
        }
        else
        { // no padding necessary
            return "" + date;
        }
    }

    /**
     * Returns a date string
     *
     * @return the full date as a String in the format YYYY-MM-DD
     */
    public String getFullDate()
    {
        // passes the month and day to helper method for formatting
        return year + "-" + getDateString(month) + "-" + getDateString(day);
    }

    /**
     * Sets the day to the value of the parameter if it is valid.
     *
     * @param the new day as an int
     */
    public void setDay(int newDay)
    {
        // day must be between FIRST_DAY and LAST_DAY inclusive
        if(newDay >= FIRST_DAY && newDay <= LAST_DAY)
        {
            day = newDay;
        }
        else
        {
            System.out.println("Invalid day data entered");
        }

    }

    /**
     * Sets the month to the value of the parameter if it is valid.
     *
     * @param the new month as an int
     */
    public void setMonth(int newMonth)
    {
        // month must be between JANUARY and DECEMBER inclusive
        if((newMonth >= JANUARY) && (newMonth <= DECEMBER))
        {
            month = newMonth;
        } else
        {
            System.out.println("Invalid month data entered");
        }
    }

    /**
     * Sets the year to the value of the parameter if it is valid.
     *
     * @param the new year as an int
     */
    public void setYear(int newYear)
    {
        if(newYear <= CURRENT_YEAR)
        {
            year = newYear;
        } else
        {
            System.out.println("Invalid year data entered");
        }
    }
}
