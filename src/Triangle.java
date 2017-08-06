import java.util.List;
import java.util.Set;

class Triangle {

  private Set<Point> points;

  public void draw() {
    System.out.println("The triangle is formed by the following 3 points");
    for (Point point : points) {
      System.out.println("Point : ( " + point.getX() + " , " + point.getY() + " )");
    }
  }

  public Set<Point> getPoints() {
    return points;
  }

  public void setPoints(Set<Point> points) {
    this.points = points;
  }
}