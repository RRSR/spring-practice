import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{

  private Point centre;

  public Point getCentre() {
    return centre;
  }

  @Resource(name = "pointTwo")
  public void setCentre(Point centre) {
    this.centre = centre;
  }

  @Override
  public void draw() {
    System.out.println("The circle is formed with centre : ("+centre.getX()+","+centre.getY()+")");
  }

  @PostConstruct
  public void myInit(){
    System.out.println("Calling myInit() method.");
  }

  @PreDestroy
  public void myDestroy(){
    System.out.println("Calling myDestroy() method.");
  }
}
