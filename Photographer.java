import java.util.*;

public class Photographer{

  private ArrayList<Camera> cameras;
  private HashMap<String, Integer> journal;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
    this.journal = new HashMap<String, Integer>();
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

  public String collectionDetails(){
    int count = 1;
    String output = "";
    for (Camera camera : cameras) {
      output = output + camera.printDetails();
      if (count < cameraCount() ) {
        output = output + ", ";
        count++;
      }
    }
    return output;
  }

  public int journalLength(){
    return journal.size();
  }

  public void addToJournal(String key, Integer value){
    journal.put(key, value);
  }

}