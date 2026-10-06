/*
* Pig
* Trent Hardacre
* Returns the type and sound of the pig
*/
public class Pig extends Animal{
    public Pig (String type, String sound){
        super(type, sound);
        this.type = type;
        this.sound = sound;
    }
    @Override
    public String getType(){
        return type;
    }
    public String getSound(){
        return sound;
    }
}
