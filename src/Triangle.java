import java.util.Map;
import java.util.Map.Entry;

class Triangle {

  private Map<String,Point> points;

  public void draw() {
    System.out.println("The triangle is formed by the following 3 points : ");
    for ( Entry temp : points.entrySet())
      System.out.println(temp.getKey().toString()+" : ("+((Point)temp.getValue()).getX()+","+((Point)temp.getValue()).getY()+")");
  }

  public Map<String, Point> getPoints() {
    return points;
  }

  public void setPoints(Map<String, Point> points) {
    this.points = points;
  }
}