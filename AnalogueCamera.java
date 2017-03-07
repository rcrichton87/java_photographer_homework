public class AnalogueCamera implements Camera{

  private String name;
  private int focalLength;

  public AnalogueCamera(String name, int focalLength){
    this.name = name;
    this.focalLength = focalLength;
  }

  public String printDetails(){
    return this.name + " - " + this.focalLength + "mm";
  }

  public String getName(){
    return this.name;
  }

  public int getFocalLength(){
    return this.focalLength;
  }

}