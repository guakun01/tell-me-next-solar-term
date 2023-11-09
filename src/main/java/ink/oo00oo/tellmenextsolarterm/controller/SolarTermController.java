package ink.oo00oo.tellmenextsolarterm.controller;

import ink.oo00oo.tellmenextsolarterm.exception.ResourceNotFoundException;
import ink.oo00oo.tellmenextsolarterm.manager.SolarTermManager;
import ink.oo00oo.tellmenextsolarterm.model.service.NextSolarTermVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/solar-term")
public class SolarTermController {

    private final SolarTermManager solarTermManager;

    @Autowired
    public SolarTermController(
            final SolarTermManager solarTermManager) {
        this.solarTermManager = solarTermManager;
    }

    @GetMapping("/next")
    public ResponseEntity<NextSolarTermVO> getNextSolarTerm() {
//        throw new ResourceNotFoundException("找不到下一个节气了，请联系机器人。");
        NextSolarTermVO nextSolarTerm = solarTermManager.getNextSolarTerm();
        return ResponseEntity.ok(nextSolarTerm);
    }


    @GetMapping("/test_not_found")
    public ResponseEntity<NextSolarTermVO> textNotFound() {
        throw new ResourceNotFoundException("找不到下一个节气了，请联系机器人。");
    }
}
