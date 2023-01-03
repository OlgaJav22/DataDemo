package testDemo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/info")
    public String infoMain(Model model) {
        model.addAttribute("title", " Информационная страница");

        return "info - main";
    }
}
