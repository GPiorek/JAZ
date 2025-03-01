package pl.pjatk.grzpior;

import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent(SecondComponent secondComponent) {
        System.out.println("FirstComponent Message from constructor");
        messageFirstComponentFromMethod();

    }

    public void messageFirstComponentFromMethod() {
        System.out.println("FirstComponent Message from method");
    }
}
