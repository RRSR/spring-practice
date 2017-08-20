import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import raj.Shape;

class Drawing {

  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    context.registerShutdownHook();
    Shape shapeTriangle = (Shape) context.getBean("triangle");
    shapeTriangle.draw();
    Shape shapeCircle = (Shape) context.getBean("circle");
    shapeCircle.draw();
  }
}