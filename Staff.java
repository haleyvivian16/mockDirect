package mockDirect;

/** this class inherits from base class Employee **/
public class Staff extends Employee{

    //instance variable
    private String title;

    //default constructor
    public Staff() {
        super();
        setTitle("Unknown");
    }

    //parameterized constructor
    public Staff(String first,String middle,String last,Address home,String phone,String email,String office,int salary,int day,int month,int year,String title) {
        super(first,middle,last,home,phone,email,office,salary,day,month,year);
        this.title=title;
    }

    //getter
    public String getTitle() {
        return title;
    }

    // setter
    public void setTitle(String t) {
        this.title = t;
    }

    @Override
    //toString method
    public String toString() {
        String result = "";
        result += (super.toString());
        result += ("Title: " + title + "\n");
        return result;
    }


}
