/*
* Chick
* Trent Hardacre
* Returns the chick type and sound
*/
public class Chick extends Animal{
    public int choice = (int) (Math.random() * 2);
    private String chickSound;
    public Chick (String type, String sound){
        super(type, sound);
        this.type = type;
        if (choice == 0){
         chickSound = "Cluck";
        }else if (choice == 1){
        chickSound = "Cheep";
        }
        this.sound = chickSound;
    }
    @Override
    public String getType(){
        return type;
    }
    public String getSound(){
        return sound;
    }
}
