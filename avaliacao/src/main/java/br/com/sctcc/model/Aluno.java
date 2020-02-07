package br.com.sctcc.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tcc02_aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = -2828372386054833977L;

	@Id
	@Column(name = "tcc02_cod_aluno")
	private Long id;

	@Column(name = "tcc02_nome")
	private String nome;

	@Column(name = "tcc02_matricula")
	private String matricula;

	@ManyToOne
	@JoinColumn(name = "fktcc02tcc01_cod_curso")
	private Curso curso;

}
