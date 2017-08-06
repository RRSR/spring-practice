import java.util.List;

class Triangle {

  private List<Point> points;

  public void draw() {
    System.out.println("The triangle is formed by the following 3 points");
    for (Point point : points) {
      System.out.println("Point : ( " + point.getX() + " , " + point.getY() + " )");
    }
  }

  public List<Point> getPoints() {
    return points;
  }

  public void setPoints(List<Point> points) {
    this.points = points;
  }
}