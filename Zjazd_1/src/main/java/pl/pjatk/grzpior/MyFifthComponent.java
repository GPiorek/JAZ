package pl.pjatk.grzpior;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFifthComponent {
    public MyFifthComponent(@Value("${my.custom.property}") String property) {
        System.out.println(property);
    }
}
