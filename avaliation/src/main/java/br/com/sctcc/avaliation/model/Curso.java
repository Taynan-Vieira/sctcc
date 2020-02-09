package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tcc01_curso")
public class Curso implements Serializable {

	private static final long serialVersionUID = 5493706545113275052L;

	@Id
	@Column(name = "tcc01_cod_curso")
	private Long id;

	@Column(name = "tcc01_descricao")
	private String descricao;

}
