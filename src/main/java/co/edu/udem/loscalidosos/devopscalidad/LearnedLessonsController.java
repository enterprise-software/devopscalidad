package co.edu.udem.loscalidosos.devopscalidad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LearnedLessonsController {
    @GetMapping("/learned")
    public String learned(@RequestParam(name="name", required=false, defaultValue="Lecciones aprendidas.") String name, Model model) {
        model.addAttribute("name", name);
        return "learned";
    }
}
