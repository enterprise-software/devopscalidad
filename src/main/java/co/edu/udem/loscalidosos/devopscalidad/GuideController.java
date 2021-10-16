package co.edu.udem.loscalidosos.devopscalidad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuideController {
    @GetMapping("/guide")
    public String guide(@RequestParam(name="name", required=false, defaultValue="Estamos en construcción...") String name, Model model) {
        model.addAttribute("name", name);
        return "guide";
    }
}
