/**
 *@author Taha Mohamed Yousef
 */
public class PlaygroundOwner extends User {

    /**
     *default constructor prints Playground Owner
     */
    public PlaygroundOwner(){System.out.println("Playground Owner");}

    /**
     * this fucntion for the EWallet of the playground Owner
     */
    public void EwalletOwner()
    {
        System.out.println("Enter Your Balance");
        double balance = input.nextDouble();
        EWallet eWallet = new EWallet(balance);
        System.out.println("Choose:\n 1.Add Money \n 2.Send Money");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1 -> eWallet.AddMoney();
            case 2 -> eWallet.SendMoney();
        }
    }
}
