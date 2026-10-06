/*
* Animal
* Trent Hardacre
* A superclass that subclasses could inherit from
*/
public class Animal{
    public String sound;
    public String type;
    public Animal (String sound, String type){
      this.sound = sound;
      this.type= type;
    }
    public String getType(){
      return sound;
    }
    public String getSound(){
      return type;
    }
}
