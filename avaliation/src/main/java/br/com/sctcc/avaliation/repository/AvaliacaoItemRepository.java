package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.AvaliacaoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoItemRepository extends JpaRepository<AvaliacaoItem, Long> {
}
