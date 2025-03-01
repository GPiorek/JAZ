package pl.pjatk.grzpior;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFourthComponent {

    public MyFourthComponent(@Value("${my.custom.property}") String property) {
        System.out.println(property);
    }
}
