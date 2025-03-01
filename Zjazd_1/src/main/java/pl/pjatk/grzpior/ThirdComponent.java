package pl.pjatk.grzpior;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent {
    private final SecondComponent secondComponent;
    private final FirstComponent firstComponent;

    public ThirdComponent(ApplicationContext context, SecondComponent secondComponent, FirstComponent firstComponent) {
        context.getBean("firstComponent", FirstComponent.class);    //nazwy z małej?
        context.getBean("secondComponent", SecondComponent.class);
        this.secondComponent = secondComponent;
        secondComponent.messageSecondComponentFromMethod();
        this.firstComponent = firstComponent;
        firstComponent.messageFirstComponentFromMethod();

    }
}
