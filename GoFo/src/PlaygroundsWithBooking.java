import java.util.ArrayList;
import java.util.Scanner;
/**
 *@author Anan Amr Mohamed Elsaber
 */
public class PlaygroundsWithBooking {
    Scanner input = new Scanner(System.in);
    Playgrounds playgroundobj =  new Playgrounds();
    ArrayList<Playgrounds> playgrounds = new ArrayList<>();
    ArrayList<Booking> books = new ArrayList<>();

    /**
     * function for adding a playground to the arraylist
     * @param playgroundobj playground
     */
    public void AddPlayground(Playgrounds playgroundobj){
        playgrounds.add(playgroundobj);
        System.out.println("PLAYGROUND ADDED SUCCSESFULLY \n"+playgroundobj.toString()+
                "\nNOTE: TO DELETE PLAYGROUND GO TO TAB 'LIST ALL PLAYGROUNDS'TO KNOW PLAYGROUND'S ID FIRST.");
    }

    /**
     * this display all the playgrounds from the arraylist
     */
    public void ListAllPlaygrounds() {
        for (int i = 0; i < playgrounds.size(); i++) {
            int numbering =i;
            numbering++;
            System.out.println("Playground "+numbering+": \nPlayground ID (NOTE:YOU WILL USE THE ID FOR REMOVING A PLAYGROUND): "
                    + numbering + " , " +playgrounds.get(i).toString());
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    /**
     * this fucntion for booking a playground and after booking a playground by id , deleted that playground from the arraylist
     * @param id id
     */
    public void BookPlaygorund(int id){
        System.out.println("Playground has been booked successfully!");
        DeletePlayground(id);
    }

    /**
     * this for deleting a playground
     * @param id id of a playground
     */
    public void DeletePlayground(int id){
        id--;
        playgrounds.remove(id);
    }

    /**
     * this for adding a book for a user to book a playground by id
     */
    public void AddBook()
    {
        ListAllPlaygrounds();
        System.out.println("Choose Playground With ID");
        int id= input.nextInt();
        BookPlaygorund(id);
        System.out.println("Please Add You Name:");
        String name = input.next();
        System.out.println("Please Add The Slot Time");
        String slot = input.next();
        Booking bookadd =  new Booking(name,slot,playgroundobj);
        books.add(bookadd);
        System.out.println(bookadd.toString());
    }

    /**
     * this for displaying books
     */
    public void DisplayBooks() {
        for (int i = 0; i < books.size(); i++) {
            int numbering = i;
            numbering++;
            System.out.println("Book ID (NOTE:YOU WILL USE THE ID FOR REMOVING A BOOK): "
                    + numbering + "\n" + books.get(i).toString());
        }
    }

    /**
     * this deleting books
     * @param id id of the book
     */
    public void DeleteBook(int id){
        id--;
        books.remove(id);
        System.out.println("Deleted Successfully!");
    }
}
