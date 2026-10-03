public class Chick extends Animal{
    public Chick (String type, String sound){
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
