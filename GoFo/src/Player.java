/**
 *@author Taha Mohamed Yousef
 */
public class Player extends User {

    /**
     * default constructor prints Player
     */
    public Player(){
        System.out.println("Player");
    }

    /**
     * this function for the Ewallet of the player
     */
    public void EwalletPlayer()
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
