public class Triangle {

  private String type = "Scaline";
  private int height =20;

  public String getType() {
    return type;
  }

//  public void setType(String type) {
//    this.type = type;
//  }


  public int getHeight() {
    return height;
  }

  public Triangle(int height) {
    this.height = height;
  }

  public Triangle(String type) {
    this.type = type;
  }

  public Triangle(String type, int height) {
    this.type = type;
    this.height = height;
  }

  public  void draw(){
    System.out.println("You have drawn a "+getType()+" Triangle of height "+getHeight()+".");
  }

}
