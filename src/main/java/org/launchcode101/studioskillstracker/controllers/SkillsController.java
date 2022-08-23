package org.launchcode101.studioskillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SkillsController {
    @GetMapping("ping")
    @ResponseBody
    public String helloSkills(@RequestParam String name){
        return "Service is up and running " + name + ".";
    }

    @GetMapping("")
    public String possibleLanguages(){
        return "possible";
    }

    @GetMapping("form")
    public String form(){
        return "form";
    }

    @PostMapping("processForm")
    public String processForm(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third, Model model){
        model.addAttribute("name", name);

        List<String> languages = new ArrayList<>(){{
            add(first);
            add(second);
            add(third);
        }};
        model.addAttribute("languages", languages);
        return "thankyou";
    }

}
