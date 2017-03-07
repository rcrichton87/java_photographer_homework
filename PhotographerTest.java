import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;

  @Before
  public void before(){
    photographer = new Photographer();
  }

  @Test
  public void camerasStartsEmpty(){
    assertEquals(0, photographer.cameraCount() );
  }

}