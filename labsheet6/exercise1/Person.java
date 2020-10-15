package labsheet6.exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        setFirstName("Not Supplied");
        setLastName("Not Supplied");
    }

    public Person(String firstName, String lastName)
    {
      setName(firstName, lastName);
    }
    public void setName(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);

    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;

    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return firstName;
    }

    public String toString()
    {
        return "First name: " + getFirstName() +
                "  " + "Last name: " + getLastName();

    }





}
