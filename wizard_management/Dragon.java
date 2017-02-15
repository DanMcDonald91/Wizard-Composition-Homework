package wizard_management;
import behaviours.Flyable;
import behaviours.Guardable;

public class Dragon extends MythicalBeast implements Flyable, Guardable {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  public String guard(){
    return "Fire wall";
  }

}