import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class Point implements InitializingBean, DisposableBean{

  private int x;
  private int y;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("POINT : InitializingBean afterPropertiesSet method is called.");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("POINT : DisposableBean destroy method is called.");
  }

  public void myInit(){
    System.out.println("POINT : Calling the myInit() method.");
  }

  public void myDestroy(){
    System.out.println("POINT : Calling the myDestroy() method.");
  }
}