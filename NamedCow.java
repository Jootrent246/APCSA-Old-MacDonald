/*
* Namedcow
* Trent Hardacre
* Returns the name of the cow
*/
public class NamedCow extends Cow{
    private String name;
    public NamedCow(String type, String sound, String name){
        super(type, sound);
        this.name = name;
    }
    public String getCowName(){
        return name;
    }
}
