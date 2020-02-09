package br.com.sctcc.avaliation.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tcc08_item")
public class Item implements Serializable {

	private static final long serialVersionUID = 7701914320368579334L;

	@Id
	@Column(name = "tcc08_cod_item")
	private Long id;

	@Column(name = "tcc08_descricao")
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "fktcc08tcc09_cod_tipo_avaliacao")
	private TipoAvaliacao tipoAvaliacao;

}
