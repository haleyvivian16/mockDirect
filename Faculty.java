package mockDirect;

/** Faculty class is inherited from base class Employee **/
public class Faculty extends Employee{

    // instance variable
    private String rank;

    // default constructor
    public Faculty() {
        super();
        setRank("Instructor");
    }

    // parameterized constructor
    public Faculty(String first,String middle,String last,Address home,String phone,String email,String office,int salary,int day,int month,int year,String rank) {
        super(first,middle,last,home,phone,email,office,salary,day,month,year);
        setRank(rank);
    }

    // getter
    public String getRank() {
        return rank;
    }

    // setter
    public void setRank(String rank) {
        if(isValidRank(rank))
            this.rank=rank;
        else
            throw new IllegalArgumentException("The faculty rank is incorrect");
    }

    // test if valid rank
    public boolean isValidRank(String r) {
        if(r.equalsIgnoreCase("Adjunct")||r.equalsIgnoreCase("Instructor")||r.equalsIgnoreCase("Assistant professor")||r.equalsIgnoreCase("Associate professor")||r.equalsIgnoreCase("Professor"))
            return true;
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        result += (super.toString());
        result += ("Rank of faculty: " + rank + "\n");
        return result;
    }

}
