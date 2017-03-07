public class DigitalCamera implements Camera{

  private String name;
  private int shutterSpeed;

  public DigitalCamera(String name, int shutterSpeed){
    this.name = name;
    this.shutterSpeed = shutterSpeed;
  }

  public String printDetails(){
    return this.name + " - " + this.shutterSpeed + "ms";
  }

  public String getName(){
    return this.name;
  }

  public int getShutterSpeed(){
    return this.shutterSpeed;
  }

} 