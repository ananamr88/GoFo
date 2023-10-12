import java.util.Scanner;
/**
 *@author Abdelrahman Mohamed Kamal Soliman
 */
public class EWallet {
    public double balance;
    Scanner input = new Scanner(System.in);

    /**
     * parameterized constructor to put intialize balance
     * @param intialBalance balance
     */
    public EWallet(double intialBalance)
    {
        balance=intialBalance;
    }

    /**
     * setting balance
     * @param balance balance
     */
    public void setBalance(double balance){this.balance=balance;}

    /**
     * getting balance
     * @return balance
     */
    public double getBalance(){return balance;}

    /**
     * prints info about balance
     * @return balance
     */
    public String toString(){
        return ("Balance = " +getBalance() );
    }

    /**
     * this for sending money (withdrawing)
     */
    public void SendMoney()
    {
        System.out.println("Enter The Amount You Want To Send");
        double amount = input.nextDouble();
        if(balance>=amount) {
            balance = balance - amount;
            setBalance(this.balance);
            System.out.println("successful operation(Sending Money)");
        }
        else{
            System.out.println("Unsuccessful operation(Sending Money)");

        }
        System.out.println(toString());
    }

    /**
     * this for adding money(deposit)
     */
    public void AddMoney()
    {
        System.out.println("Enter The Amount You Want To Add");
        double amount = input.nextDouble();
        balance = balance + amount;
        setBalance(this.balance);
        System.out.println("successful operation(Adding Money)");
        System.out.println(toString());
    }
}
