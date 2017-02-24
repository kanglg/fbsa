package org.kanglg.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 * Created by kanglg on 2017/2/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Hello!";
    }
}
