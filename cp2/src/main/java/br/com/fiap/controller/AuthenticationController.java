package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String login() {
        return "login"; // Implemente a página de login (login.html)
    }

    @GetMapping("/logout")
    public String logout() {
        // Implemente o logout
        return "redirect:/login";
    }
}

