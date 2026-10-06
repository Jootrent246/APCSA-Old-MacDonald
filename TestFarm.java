public class TestFarm{
    public static void main(String[]args){
        Cow myCow = new Cow("Cow", "Moo");
        System.out.println(myCow.getType() + " goes " + myCow.getSound());
        Chick myChick = new Chick("Ckick", "Cluck");
        System.out.println(myChick.getType() + " goes " + myChick.getSound());
        Pig myPig = new Pig("Pig", "Oink");
        System.out.println(myPig.getType() + " goes " + myPig.getSound());
        NamedCow myNamedCow = new NamedCow("Cow", "Moo", "Trent");
        System.out.println("The cow is known as " + myNamedCow.getCowName());
    }
}
   