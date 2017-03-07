import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  String camera1;
  String camera2;

  @Before
  public void before(){
    photographer = new Photographer();
    camera1 = "Sony 5500";
    camera2 = "Zeiss 30";
  }

  @Test
  public void camerasStartsEmpty(){
    assertEquals(0, photographer.cameraCount() );
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(camera1);
    assertEquals(1, photographer.cameraCount() );
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(camera1);
    photographer.addCamera(camera2);
    photographer.removeCamera(camera1);
    assertEquals(1, photographer.cameraCount() );
  }

}