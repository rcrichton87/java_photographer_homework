public class DigitalCamera implements Camera{

  private String name;
  private int shutterSpeed;

  public DigitalCamera(String name, int shutterSpeed){
    this.name = name;
    this.shutterSpeed = shutterSpeed;
  }

  public String printDetails(){
    return "placeholder";
  }

  public String getName(){
    return this.name;
  }

} 