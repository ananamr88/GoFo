import java.util.Scanner;
/**
 *@author Anan Amr Mohamed Elsaber
 */
public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;


        PlaygroundsWithBooking playgroundsWithBooking = new PlaygroundsWithBooking();
        System.out.println("WELCOME TO GOFO APPLICATION ! \n1.Sign In  \n2.Sign Up \n3.EXIT");
        User user = new User();
        int choose1 = input.nextInt();
        if (choose1 == 1) {
            user.SignIn();
        }
        if (choose1 == 2) {
            user.SignUp();
        }
        while (!exit) {
            System.out.println("Choose:- \n1.Playground Owner Tabs \n2.Player Tabs \n3.EXIT");
            int choose2 = input.nextInt();
            if (choose2 == 1) {
                System.out.println("------ Playgroynd Owner Menu ------ \n1.Add Playground \n2.List All Playgrounds \n3.Books \n4.Delete\n5.Ewallet\n6.Exit");
                int chooseowner = input.nextInt();
                if (chooseowner == 1) {

                    System.out.println("Add The Following:");
                    System.out.print("Number Of Players:");
                    String NumberOfPlayers = input.next();
                    System.out.print("Playground Length:");
                    String PlaygroundLength = input.next();
                    System.out.print("Playground Width:");
                    String PlaygroundWidth = input.next();
                    System.out.print("Price:");
                    String Price = input.next();
                    System.out.print("Available Time:");
                    String AvailableTime = input.next();
                    Playgrounds playgrounds = new Playgrounds(NumberOfPlayers, PlaygroundLength, PlaygroundWidth, Price, AvailableTime);
                    playgroundsWithBooking.AddPlayground(playgrounds);
                }
                if (chooseowner == 2) {
                    playgroundsWithBooking.ListAllPlaygrounds();
                }
                if (chooseowner == 3) {
                    playgroundsWithBooking.DisplayBooks();
                }
                if (chooseowner == 4) {
                    System.out.println("Would You Like To Delete: 1.Book   2.Playground");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        playgroundsWithBooking.DisplayBooks();
                        System.out.println("Please Enter Book's ID That You Want To Delete");
                        int id = input.nextInt();
                        playgroundsWithBooking.DeleteBook(id);
                    }
                    if (choice == 2) {
                        playgroundsWithBooking.ListAllPlaygrounds();
                        System.out.println("Please Enter Playground's ID You Want To Delete");
                        int id = input.nextInt();
                        playgroundsWithBooking.DeletePlayground(id);
                        System.out.println("Deleted Successfully !");
                    }
                }


                if (chooseowner == 5) {
                    PlaygroundOwner playgroundOwner = new PlaygroundOwner();
                    playgroundOwner.EwalletOwner();
                }
            }// end playground owner

            if (choose2 == 2) {
                System.out.println("------ Player Menu ------ \n1.Book Playground \n2.My Books \n3.Ewallet\n4.Exit");
                int chooseplayer1 = input.nextInt();
                if (chooseplayer1 == 1) {
                    playgroundsWithBooking.AddBook();
                }
                if (chooseplayer1 == 2) {
                    playgroundsWithBooking.DisplayBooks();
                }
                if (chooseplayer1 == 3) {
                    Player player = new Player();
                    player.EwalletPlayer();
                }
            }// end player

            if (choose2 == 3) {
                exit = true;
            }
        }
    }
}
