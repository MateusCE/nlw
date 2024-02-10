package controllers;

import dto.verifyIfHasCertificationDTO;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/students")
public class StudentController {
    @PostMapping("/teste")
    public String verifyIfHasCertification(@RequestBody verifyIfHasCertificationDTO veryHasCertificationDTO) {
        System.out.println(veryHasCertificationDTO);
        return "Usuário pode fazer a prova";


    }

    @GetMapping()
    public String verifyIfHasCertification() {
        System.out.println("/teste");
        return "Usuário pode fazer a prova";


    }
}
