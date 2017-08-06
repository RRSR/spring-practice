import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Drawing {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Triangle triangle = (Triangle) context.getBean("triangle");
    triangle.draw();

  }
}