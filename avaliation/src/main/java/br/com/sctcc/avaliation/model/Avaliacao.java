package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tcc06_avaliacao")
public class Avaliacao implements Serializable {

	private static final long serialVersionUID = 4445918516295785983L;

	@Id
	@Column(name = "tcc06_cod_avaliacao")
	private Long id;

	@Column(name = "tcc06_nota_final")
	private Double notaFinal;

	@Column(name = "tcc06_banca_aberta")
	private Boolean bancaAberta;

	@ManyToOne
	@JoinColumn(name = "fktcc06tcc03_cod_trabalho")
	private Trabalho trabalho;

	@ManyToOne
	@JoinColumn(name = "fktcc06tcc09_cod_tipo_avaliacao")
	private TipoAvaliacao tipoAvaliacao;

}
