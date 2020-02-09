package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
