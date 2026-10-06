/*
* Farm
* Trent Hardacre
* Displays the sounds animals make and the name of a cow
*/
public class Farm {
 private Animal [] a = new Animal [3];
 Farm () {
 a [0] = new NamedCow ("cow","moo", "Rex") ; 
 a [1] = new Chick ("chick "," cluck ") ;
 a [2] = new Pig ("pig"," oink ") ;
    }
 public void animalSounds () {
 for (int i = 0; i < a . length ; i ++) {
 System . out . println ( a [ i ]. getType () + " goes " + a [ i ]. getSound () ) ;

        }
 System . out . println ("The cow is known as " +(( NamedCow ) a [0]) . getCowName () ) ;
    }
 }