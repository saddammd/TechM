package TechMtest.TechM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
//Random comment for conflict
    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
            String.format(template, name));
    }
    
    //adding code to feature1 branch
    //adding code to feature branch.

    @GetMapping("/show")
    public String showMessage() {
    	return "hello";
    }
    
  //adding code to feature2 branch
    @GetMapping("/show2")
    public String showMessage2() {
    	return "hi";
    }
    
  //adding code to feature5 branch
    @GetMapping("/show2")
    public String showMessage5() {
    	return "hi";
    }
}
