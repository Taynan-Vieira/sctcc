package br.com.sctcc.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tcc03_trabalho")
public class Trabalho implements Serializable {

	private static final long serialVersionUID = -408298369126702245L;

	@Id
	@Column(name = "tcc03_cod_trabalho")
	private Long id;

	@Column(name = "tcc03_tema")
	private String tema;

	@Column(name = "tcc03_status")
	private String status;

	@ManyToOne
	@JoinColumn(name = "fktcc03tcc02_cod_aluno")
	private Aluno aluno;

}
