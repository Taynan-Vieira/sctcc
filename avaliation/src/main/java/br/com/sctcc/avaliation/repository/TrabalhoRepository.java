package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
}
