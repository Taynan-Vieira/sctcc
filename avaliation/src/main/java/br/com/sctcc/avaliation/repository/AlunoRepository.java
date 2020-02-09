package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
