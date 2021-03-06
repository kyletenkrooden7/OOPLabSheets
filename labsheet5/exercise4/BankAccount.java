package labsheet5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private static double InterestRate;

    public BankAccount()
    {
        setOwner("Owner Not Available");
        setNumber(0);
        setInterestRate(0);

    }
    public BankAccount(String owner, int number, double InterestRate)
    {
        setOwner(owner);
        setNumber(number);
        setInterestRate(InterestRate);

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
