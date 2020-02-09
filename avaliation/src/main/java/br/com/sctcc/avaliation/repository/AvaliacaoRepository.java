package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}
