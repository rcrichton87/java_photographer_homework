import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera camera1;
  DigitalCamera camera2;
  AnalogueCamera camera3;
  AnalogueCamera camera4;

  @Before
  public void before(){
    photographer = new Photographer();
    camera1 = new DigitalCamera("Sony 5500", 35);
    camera2 = new DigitalCamera("Zeiss 30", 20);
    camera3 = new AnalogueCamera("Canon 1000", 15);
    camera4 = new AnalogueCamera("Fujifilm 450s", 20);
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

  @Test
  public void digitalCameraHasName(){
    assertEquals("Sony 5500", camera1.getName());
  }

  @Test
  public void digitalCameraHasShutterSpeed(){
    assertEquals(20, camera2.getShutterSpeed() );
  }

  @Test
  public void digitalCameraCanPrintDetails(){
    assertEquals("Sony 5500 - 35ms", camera1.printDetails());
  }

  @Test
  public void analogueCameraHasName(){
    assertEquals("Fujifilm 450s", camera4.getName() );
  }

  @Test
  public void analogueCameraHasFocalLength(){
    assertEquals(15, camera3.getFocalLength());
  }

}