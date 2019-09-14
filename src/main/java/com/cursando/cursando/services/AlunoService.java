package com.cursando.cursando.services;

import com.cursando.cursando.models.Aluno;
import com.cursando.cursando.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno findAlunoByEmail(String email) {
        return alunoRepository.findByEmail(email);
    }
}
