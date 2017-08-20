package raj;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

  private Point centre;

  @Autowired
  private MessageSource messageSource;

  public MessageSource getMessageSource() {
    return messageSource;
  }

  public void setMessageSource(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  public Point getCentre() {
    return centre;
  }

  @Resource
  public void setCentre(Point centre) {
    this.centre = centre;
  }

  @Override
  public void draw() {
    System.out.println(messageSource.getMessage("circle.message",null,"Default Circle Draw",null));
    System.out.println(messageSource.getMessage("point.message",new Object[]{centre.getX(),centre.getY()},"Default Circle Draw",null));
  }

  @PostConstruct
  public void myInit(){
    System.out.println("Calling myInit() method of Circle.");
  }

  @PreDestroy
  public void myDestroy(){
    System.out.println("Calling myDestroy() method of Circle.");
  }
}
