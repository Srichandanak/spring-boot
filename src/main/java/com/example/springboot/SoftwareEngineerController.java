package com.example.springboot;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")

public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Srichandana",
                        "Java, react, aiml"
                ),
                new SoftwareEngineer(
                        2,
                        "Sreelu",
                        "Java, Springboot"
                )
        );
    }
}
