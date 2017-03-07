import java.util.*;

public class Photographer{

  private ArrayList<String> cameras;

  public Photographer(){
    this.cameras = new ArrayList<String>();
  }

  public int cameraCount(){
    return cameras.size();
  }

  public void addCamera(String camera){
    cameras.add(camera);
  }

  public void removeCamera(String removeCamera){
    int index = 0;
    for (String camera : cameras) {
      if (camera == removeCamera) {
        cameras.remove(index);
      }
      index++;  
    }
  }

}