package wizard_management;
import behaviours.Flyable;
import behaviours.Guardable;

public class Wizard {
  String name;
  private Flyable ride;
  private Guardable guard;


  public Wizard(String name, Flyable ride, Guardable guard){
    this.name = name;
    this.ride = ride;
    this.guard =guard;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public void setGuard(Guardable guard) {
   this.guard = guard;
 }
 public String defend(){
  return guard.guard();
 }
}