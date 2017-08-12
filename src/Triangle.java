import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class Triangle implements InitializingBean,DisposableBean{

  private Point pointA;
  private Point pointC;
  private Point pointB;

  public void draw() {
    System.out.println("The triangle is formed by the following 3 points : ");
    System.out.println("Point A : ("+getPointA().getX()+","+getPointA().getY()+")");
    System.out.println("Point B : ("+getPointB().getX()+","+getPointB().getY()+")");
    System.out.println("Point C : ("+getPointC().getX()+","+getPointC().getY()+")");
  }

  public Point getPointA() {
    return pointA;
  }

  public void setPointA(Point pointA) {
    this.pointA = pointA;
  }

  public Point getPointC() {
    return pointC;
  }

  public void setPointC(Point pointC) {
    this.pointC = pointC;
  }

  public Point getPointB() {
    return pointB;
  }

  public void setPointB(Point pointB) {
    this.pointB = pointB;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("TRIANGLE : InitializingBean afterPropertiesSet method is called.");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("TRIANGLE : DisposableBean destroy method is called.");
  }

  public void myInit(){
    System.out.println("TRIANGLE : Calling the myInit() method.");
  }

  public void myDestroy(){
    System.out.println("TRIANGLE : Calling the myDestroy() method.");
  }
}