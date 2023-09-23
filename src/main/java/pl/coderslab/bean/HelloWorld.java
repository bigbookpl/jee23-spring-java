package pl.coderslab.bean;

import java.time.Instant;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
  public void hello(){
    System.out.println(Instant.now());
  }

}
