public class Circle implements Shape{

  private Point centre;

  public Point getCentre() {
    return centre;
  }

  public void setCentre(Point centre) {
    this.centre = centre;
  }

  @Override
  public void draw() {
    System.out.println("The circle is formed with centre : ("+centre.getX()+","+centre.getY()+")");
  }
}
