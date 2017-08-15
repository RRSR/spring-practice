package raj;

class Triangle implements Shape {

  private Point pointA;
  private Point pointC;
  private Point pointB;

  public void draw() {
    System.out.println("The triangle is formed by the following 3 points : ");
    System.out.println("raj.Point A : ("+getPointA().getX()+","+getPointA().getY()+")");
    System.out.println("raj.Point B : ("+getPointB().getX()+","+getPointB().getY()+")");
    System.out.println("raj.Point C : ("+getPointC().getX()+","+getPointC().getY()+")");
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

}