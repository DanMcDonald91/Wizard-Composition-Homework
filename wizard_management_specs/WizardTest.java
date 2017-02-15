import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon dragon;
  Ogre ogre;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick, dragon);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick)wizard.getRide();
    assertEquals("Nimbus",ride.getBrand());
  }

  @Test
  public void canFlyBroomStick(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard ("Ricully",dragon, dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }
  @Test
  public void canFlyMagicCarpet(){
    MagicCarpet magiccarpet =new MagicCarpet("codeclan");
    wizard = new Wizard ("Gandalf", magiccarpet, dragon);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());

  }
  @Test
  public void setGuard(){
    Dragon dragon = new Dragon("Java The Jaded");
    wizard.setGuard(dragon);
    assertEquals("Fire wall", wizard.defend());
  }
  @Test
  public void setNewGuard(){
    Ogre ogre = new Ogre("Shrek");
    wizard.setGuard(ogre);
    assertEquals("Shrek Smash", wizard.defend());
  }

}