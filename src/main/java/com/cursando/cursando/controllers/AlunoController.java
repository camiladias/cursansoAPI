package com.cursando.cursando.controllers;

import com.cursando.cursando.models.Aluno;
import com.cursando.cursando.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value="/login", method = RequestMethod.POST, produces="application/json")
    public Aluno login(Principal principal) {
        return alunoService.findAlunoByEmail(principal.getName());
    }
}
