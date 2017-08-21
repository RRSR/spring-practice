package raj;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the component that published the event (never {@code null})
   */
  public DrawEvent(Object source) {
    super(source);
    System.out.println("Event occurred : "+source.toString());
  }
}
