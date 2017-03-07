import java.util.*;

public class Photographer{

  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public int cameraCount(){
    return cameras.size();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }

  public void removeCamera(Camera removeCamera){
    int index = 0;
    for (Camera camera : cameras) {
      if (camera == removeCamera) {
        cameras.remove(index);
      }
      index++;  
    }
  }

}