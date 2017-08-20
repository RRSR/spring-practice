package raj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

class Triangle implements Shape {

  private Point pointA;
  private Point pointB;
  private Point pointC;

  @Autowired
  private MessageSource messageSource;


  public void draw() {
    System.out.println(messageSource.getMessage("triangle.message",null,"Default Triangle Draw", null));
    System.out.println(messageSource.getMessage("point.message",new Object[]{pointA.getX(),pointA.getY()},"Default Point Draw",null));
    System.out.println(messageSource.getMessage("point.message",new Object[]{pointB.getX(),pointB.getY()},"Default Point Draw",null));
    System.out.println(messageSource.getMessage("point.message",new Object[]{pointC.getX(),pointC.getY()},"Default Point Draw",null));
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

  public MessageSource getMessageSource() {
    return messageSource;
  }

  public void setMessageSource(MessageSource messageSource) {
    this.messageSource = messageSource;
  }
}