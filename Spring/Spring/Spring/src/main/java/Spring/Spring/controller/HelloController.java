package Spring.Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!");
        return "hello"; //templeates에 있는 hello.html과 연결
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value="name")String name, Model model){
        model.addAttribute("name",name);
        //hello-template.html에 Model채로 넘겨줌 
        return "hello-template";
    }
}
