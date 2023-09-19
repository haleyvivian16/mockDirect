package mockDirect;

public class Student extends Person{
    private String level;

    // initial constructor
    public Student(){
        super();
        this.level = "Freshman";
    }
    public Student(String first, String middle, String last, Address address, String phone, String email, String level) throws IllegalArgumentException{
        super(first, middle, last, address, phone, email);
        setLevel(level);
    }

    public String getLevel(){
        return this.level;
    }

    public void setLevel(String level) throws IllegalArgumentException{
        if("Freshman".equalsIgnoreCase(level) || "Sophomore".equalsIgnoreCase(level)
                || "Junior".equalsIgnoreCase(level) || "Senior".equalsIgnoreCase(level)
                || "Graduate".equalsIgnoreCase(level))
            this.level = level;
        else {
            throw new IllegalArgumentException(level + " is not a valid level.");
        }
    }

    public String toString(){
        String result = super.toString();
        result += "College Level: " + level + "\n";
        return result;
    }
}