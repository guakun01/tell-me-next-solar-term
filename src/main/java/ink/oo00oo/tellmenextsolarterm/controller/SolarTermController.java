package ink.oo00oo.tellmenextsolarterm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/solar-term")
public class SolarTermController {

    @GetMapping("/next")
    public String nextSolarTerm() {
        return "say hello";
    }

}
