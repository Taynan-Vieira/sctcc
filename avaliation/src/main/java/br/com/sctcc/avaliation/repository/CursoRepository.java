package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
