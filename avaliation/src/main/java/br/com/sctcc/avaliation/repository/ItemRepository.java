package br.com.sctcc.avaliation.repository;

import br.com.sctcc.avaliation.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
