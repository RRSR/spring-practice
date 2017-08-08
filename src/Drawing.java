import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Drawing {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    System.out.println("The Application name is : "+context.getApplicationName());
    System.out.println("The Display Name is : "+(String) context.getDisplayName());
    System.out.println("The Context Id is :"+(String) context.getId().toString());
    System.out.println("The Context Parent is :"+context.getParent());
    System.out.println("The Bean Definition Count is : "+context.getBeanDefinitionCount());
    System.out.println("The Class Loader is : "+(String) context.getClassLoader().getClass().getName()+" with the parent class loader as : "+(String) context.getClassLoader().getParent().getClass().getName());
    Triangle triangle = (Triangle) context.getBean("triangle");
    triangle.draw();

  }
}