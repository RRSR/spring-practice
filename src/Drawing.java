import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Drawing {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Shape shape = (Shape) context.getBean("circle");
    shape.draw();
  }
}