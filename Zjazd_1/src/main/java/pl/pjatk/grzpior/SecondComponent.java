package pl.pjatk.grzpior;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
    public SecondComponent() {
        System.out.println("SecondComponent Message from constructor");
        messageSecondComponentFromMethod();
    }

    public void messageSecondComponentFromMethod() {
        System.out.println("SecondComponent Message from method");
    }
}
