/**
 *@author Abdelrahman Mohamed Kamal Soliman
 */
public class Playgrounds {

    public String NumberOfPlayers,PlaygroundLength,PlaygroundWidth,Price,AvailableTime;

    /**
     * this setting the numbers of player
     * @param NumberOfPlayers number of players
     */
    public void setNumberOfPlayers(String NumberOfPlayers){this.NumberOfPlayers=NumberOfPlayers;}

    /**
     * setting length
     * @param PlaygroundLength length
     */
    public void setPlaygroundLength(String PlaygroundLength){this.PlaygroundLength=PlaygroundLength;}

    /**
     * setting width
     * @param PlaygroundWidth width
     */
    public void setPlaygroundWidth(String PlaygroundWidth){this.PlaygroundWidth=PlaygroundWidth;}

    /**
     * setting price
     * @param Price price
     */
    public void setPrice(String Price){this.Price=Price;}

    /**
     * setting time
     * @param AvailableTime time
     */
    public void setAvailableTime(String AvailableTime){this.AvailableTime=AvailableTime;}

    /**
     * getting number of players
     * @return number of playes
     */
    public String getNumberOfPlayers(){return NumberOfPlayers;}

    /**
     * getting length
     * @return length
     */
    public String getPlaygroundLength(){return PlaygroundLength;}

    /**
     * getting width
     * @return width
     */
    public String getPlaygroundWidth(){return PlaygroundWidth;}

    /**
     * getting price
     * @return price
     */
    public String getPrice(){return Price;}

    /**
     * getting time
     * @return time
     */
    public String getAvailableTime(){return AvailableTime;}

    /**
     * default constructor
     */
    public Playgrounds(){}

    /**
     * tostring fucntion to prints info about the playpround
     * @return information
     */
    public String toString(){
        return ("The maximum number of players allowed for this playground: "+getNumberOfPlayers()+
                "\n Plaground Length: "+getPlaygroundLength()+ "\n Playground Width: " +getPlaygroundWidth()+
                "\n Price: " +getPrice()+"\n Available Time: " +getAvailableTime());
    }

    /**
     * parameterized constructor
     * @param NumberOfPlayers number of players
     * @param PlaygroundLength length
     * @param PlaygroundWidth width
     * @param Price price
     * @param AvailableTime time
     */
    public Playgrounds(String NumberOfPlayers,String PlaygroundLength,String PlaygroundWidth,String Price,String AvailableTime){
        setNumberOfPlayers(NumberOfPlayers);
        setPlaygroundLength(PlaygroundLength);
        setPlaygroundWidth(PlaygroundWidth);
        setPrice(Price);
        setAvailableTime(AvailableTime);
        }
}




