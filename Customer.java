/**
 * Information for customers renting a musical instrument.
 *
 * @author Bullwinkle Moose
 * @version (a version number or a date)
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String driversLicense;
    private String address;
    private String phoneNumber;

    /**
     * defualt constructor for Customer class
     */
    public Customer()
    {

    }

    /**
     * @param firstName      to set the firstName field
     * @param lastName       to set the lastName field
     * @param driversLicense to set the driversLicense field
     * @param address        to set the address field
     * @param phoneNumber    to set the phoneNumber field
     */
    public Customer(String firstName, String lastName, String driversLicense, String address, String phoneNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDriversLicense(driversLicense);
        setAddress(address);
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String name)
    {
        if(name != null && name.trim().length() > 0)
        {
            String fName = name.toLowerCase();
            firstName = fName.replace(fName.charAt(0), Character.toUpperCase(fName.charAt(0)));
        }
        else
        {
            System.out.println("ERROR: invalid first name");
        }
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String name)
    {
        if(name != null && name.trim().length() > 0)
        {
            String lName = name.toLowerCase();
            lastName = lName.replace(lName.charAt(0), Character.toUpperCase(lName.charAt(0)));
        }
        else
        {

            System.out.println("ERROR: invalid last name");
        }
    }

    /**
     * @return the driversLicense
     */
    public String getDriversLicense()
    {
        return driversLicense;
    }

    /**
     * @param driversLicense the driversLicense to set
     */
    public void setDriversLicense(String driversLicense)
    {
        if(driversLicense != null && driversLicense.trim().length() > 0)
        {
            this.driversLicense = driversLicense;
        }
        else
        {
            System.out.println("ERROR: invalid drivers license");
        }
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        if(address != null && address.trim().length() > 0)
        {
            this.address = address;
        }
        else
        {
            System.out.println("ERROR: invalid address");
        }
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the RentalCustomer first and last names.
     */
    public String getFullName()
    {

        return firstName + " " + lastName;
    }
}
