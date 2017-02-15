import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class JamGoblinTest {

  JamGoblin jamgoblin;

  @Before
  public void before(){
    jamgoblin = new JamGoblin("The Red King");
  }

  @Test
  public void hasName(){
    assertEquals("The Red King", jamgoblin.getName());
  }

  @Test
  public void GoblinAttack() {
    assertEquals("Marmalade Mist!", jamgoblin.attack());
  }
}