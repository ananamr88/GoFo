/**
 *@author Abdelrahman Mohamed Kamal Soliman
 */
public class Booking {

    Playgrounds playground = new Playgrounds();
    public String SlotTime,Name;
    public Booking(){}

    /**
     * setting slot time
     * @param SlotTime time
     */
    public void setSlotTime(String SlotTime){this.SlotTime=SlotTime;}

    /**
     * setting name
     * @param Name name
     */
    public void setName(String Name){this.Name=Name;}

    /**
     * getting slot time
     * @return time
     */
    public String getSlotTime(){return SlotTime;}

    /**
     * getting name
     * @return name
     */
    public String getName(){return Name;}

    /**
     * prints info about books
     * @return information
     */
    public String toString(){
        return ("Name:" +getName()+ "Slot Time: "  +getSlotTime());
    }

    /**
     * parameterized constructor
     * @param Name name
     * @param SlotTime time
     * @param playground object from playgrounds (playground)
     */
    public Booking(String Name , String SlotTime , Playgrounds playground){
        setName(Name);
        setSlotTime(SlotTime);
        this.playground=playground;
    }
}
