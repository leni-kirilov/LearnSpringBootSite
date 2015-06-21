/**
 * Created by Leni on 21.6.2015 ?..
 */
package bg.kirilov.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Leni!";
    }
}