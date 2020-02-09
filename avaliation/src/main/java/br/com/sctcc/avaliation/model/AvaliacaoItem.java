package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tcc07_avaliacao_item")
public class AvaliacaoItem implements Serializable {

	private static final long serialVersionUID = -3668596174718438672L;

	@Id
	@Column(name = "tcc07_cod_avaliacao_item")
	private Long id;

	@Column(name= "tcc07_comentario")
	private String comentario;

	@Column(name = "tcc07_nota")
	private Double nota;

	@ManyToOne
	@JoinColumn(name = "fktcc07tcc06_cod_avaliacao")
	private Avaliacao avaliacao;

	@ManyToOne
	@JoinColumn(name = "fktcc07tcc08_cod_item")
	private Item item;

}
