package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class UsuarioController {

    @GetMapping("/")
    public String exibirFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario";
    }

    @PostMapping("/processar")
    public String processarFormulario(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario);
        return "resultado";
    }
}