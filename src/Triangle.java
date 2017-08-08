import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

class Triangle implements ApplicationContextAware, BeanNameAware{

  private Point pointA;
  private Point pointC;
  private Point pointB;
  private ApplicationContext context;

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
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.context = applicationContext;
  }

  @Override
  public void setBeanName(String name) {
    System.out.println("The Triangle class's bean name is : " + name);
  }
}