package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tcc04_trabalho_professor")
public class TrabalhoProfessor implements Serializable {

	private static final long serialVersionUID = -2788621367679911563L;

	@Id
	@Column(name = "tcc04_cod_trabalho_professor")
	private Long id;

	@Column(name = "tcc04_examinador")
	private Long examinador;

	@ManyToOne
	@JoinColumn(name = "fktcc04tcc03_cod_trabalho")
	private Trabalho trabalho;

	@Column(name = "fktcc04tcc05_cod_professor")
	private Professor professor;

}
