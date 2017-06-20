package com.example.demo;
/**
 * Created by student on 6/20/17.
 */

import com.example.demo.models.Person;
import com.example.demo.models.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private PersonRepository personRepository;
    @RequestMapping("/")
    public String index() {
        return "index";

    }

    @GetMapping("/")
    public String newPerson(Model model){
        model.addAttribute(new Person());
        return "index";
    }

    @PostMapping("/")
    public String processForm(@ModelAttribute Person person){

        return "result";

    }

}
