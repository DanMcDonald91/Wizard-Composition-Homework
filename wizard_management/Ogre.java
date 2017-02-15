package wizard_management;
import behaviours.Guardable;

public class Ogre extends MythicalBeast implements Guardable {
  
  public Ogre(String name){
    super(name);
  }
  public String guard(){
    return "Shrek Smash";
  }

}