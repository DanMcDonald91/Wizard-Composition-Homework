package wizard_management;

public abstract class Villain {

  String name;

  public Villain(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

}