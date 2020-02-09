package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tcc05_professor")
public class Professor implements Serializable {

	private static final long serialVersionUID = -6078180198312624581L;

	@Id
	@Column(name = "tcc05_cod_professor")
	private Long id;

	@Column(name = "tcc05_nome")
	private String nome;

	@Column(name = "tcc05_matricula")
	private String matricula;

	@Column(name = "tcc05_senha")
	private String senha;

	@Column(name = "tcc05_examinador")
	private Boolean examinador;

}
