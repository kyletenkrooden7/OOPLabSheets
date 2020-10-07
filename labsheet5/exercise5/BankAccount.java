package labsheet5.exercise5;

public class BankAccount{
    private String owner;
    private int number;
    private static double InterestRate;
    private static int count;


    public BankAccount()
    {
        this("Owner not available",0);

    }
    public BankAccount(String owner, double InterestRate)
    {
        incrementCount();
        setOwner(owner);
        setNumber(number);
        setInterestRate(InterestRate);

    }

    private static void incrementCount() {count++;}

    public static int getCount(){
        return count;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public String getOwner(){return owner;}

    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){return number;}

    public static void  setInterestRate(double InterestRate){
        BankAccount.InterestRate=InterestRate;
    }
    public static double getInterestRate(){return InterestRate;}


    public String toString()
        {
           return "Owner: " + getOwner() +
                   "  Account Number: " + getNumber()  +
                   "  Interest Rate: " + getInterestRate();

        }









}
