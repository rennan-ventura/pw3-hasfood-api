package br.com.rennan.rentura.hasfood.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.rennan.rentura.hasfood.Enum.DiaSemanaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_RESTAURANTE")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RESTAURANTE")
	private Long id;
	
	@Column(name = "TX_CNPJ")
	private String cnpj;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
	@Column(name = "DT_APROVACAO")
	@Enumerated
	private DiaSemanaEnum aprovacao;
	
	@Column(name = "VLR_ENTREGA")
	private double vlr_entrega;
	
	@Column(name = "NR_TEMPO_MIN_ENTREGA")
	private int tempo_min_entrega;
	
	@Column(name = "NR_TEMPO_MAX_ENTREGA")
	private int tempo_max_entrega;
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_COZINHA")
	private TipoCozinha id_cozinha;

}
