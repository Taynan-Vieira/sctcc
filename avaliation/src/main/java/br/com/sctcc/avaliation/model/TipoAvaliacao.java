package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tcc09_tipo_avaliacao")
public class TipoAvaliacao implements Serializable {

	private static final long serialVersionUID = 3830893659568057069L;

	@Id
	@Column(name = "tcc09_cod_tipo_avaliacao")
	private Long id;

	@Column(name = "tcc09_descricao")
	private String descricao;

}
