package pl.pjatk.grzpior;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PojoClass {

    @Bean
    public ExampleClass exampleClass() {
        return new ExampleClass();
    }

    @Bean
    public List<String> defaultData(){
        return List.of("a","b","c","d","e");
    }
}
