package mockDirect;

public class Person extends Address{
    // instance variables
    private final int id; // must set as final
    private Name name; // inherit Name class
    private Address homeAddress; // inherit Address class
    private String phoneNumber;
    private String email;
    private static int recordNumber; // must be static

    // initial constructor
    public Person(){
        this.name = new Name();
        this.homeAddress = new Address();
        this.phoneNumber = "None given";
        this.email = "None given";
        this.id = ++recordNumber;
    }

    // parameterized constructor
    public Person(String first, String middle, String last, Address homeAddress, String phoneNumber, String email){
        this.name = new Name(first, middle, last);
        setHomeAddress(homeAddress);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        this.id = ++recordNumber;
    }

    // getters
    public Name getName(){
        return name;
    }
    public Address getHomeAddress(){
        return homeAddress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
    public static int getRecordNumber(){
        return recordNumber;
    }

    // setters
    public void setName(Name name){
        this.name = name;
    }
    public void setHomeAddress(Address homeAddress){
        if(homeAddress == null)
            throw new IllegalArgumentException("Home Address cannot be null");
        this.homeAddress = homeAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber == null)
            throw new IllegalArgumentException("Phone Number cannot be null");
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        if(email == null)
            throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }

    public String toString(){
        String result = "";
        result += (this.name.toString() + "\n");
        result += ("Home Address: " + this.homeAddress.toString() + "\n");
        result += ("Phone Number: " + this.phoneNumber + "\n");
        result += ("Email Address: " + this.email + "\n");
        result += ("ID: " + recordNumber + "\n");
        return result;
    }
}
