package mockDirect;

import java.time.LocalDate;
/** this class is inherited from base class Person **/
public class Employee extends Person{

    // instance variables
    private String office;
    private int salary;
    private LocalDate hireDate;

    // default constructor
    public Employee() {
        super();
        setOffice("Unassigned");
        setSalary(0);
        setHireDate(null);
    }

    // parameterized constructor
    public Employee(String first,String middle,String last,Address home,String phone,String email,String office,int salary,int month,int day,int year) {
        super(first, middle, last, home, phone, email);
        setOffice(office);
        setSalary(salary);
        setHireDate(LocalDate.of(year, month, day));
    }

    // getters
    public String getOffice() {
        return office;
    }
    public int getSalary() {
        return salary;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }

    // setters
    public void setOffice(String office) {
        this.office = office;
    }
    public void setSalary(int salary) {
        if(salary < 0)
            throw new IllegalArgumentException("Invalid salary amount");
        this.salary = salary;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // toString method
    @Override
    public String toString() {
        String result = "";
        result += (super.toString());
        result += ("Office: " + this.office + "\n");
        result += ("Salary: " + this.salary + "\n");
        result += ("HireDate: " + this.hireDate + "\n");
        return result;
    }
}
