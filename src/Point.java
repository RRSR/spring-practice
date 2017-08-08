import org.springframework.beans.factory.BeanNameAware;

class Point implements BeanNameAware{

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
  public void setBeanName(String name) {
    System.out.println("The Point class's bean name is :" + name);
  }
}