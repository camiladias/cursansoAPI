package com.cursando.cursando.repositories;

import com.cursando.cursando.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByEmail(String email);

}
