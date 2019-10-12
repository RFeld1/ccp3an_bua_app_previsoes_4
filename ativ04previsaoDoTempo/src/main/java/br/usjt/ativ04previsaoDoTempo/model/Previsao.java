package br.usjt.ativ04previsaoDoTempo.model;

import java.io.Serializable;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import br.usjt.ativ04.model.Cidade;

@Entity
@Table(name = "tb_previsao")
public class Previsao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "id_Cidade")
	private Cidade cidade;

	
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, length = 50)
	private String data;
	@Column(nullable = false, length = 50)
	private String diadasemana;
	@Column(nullable = false, length = 140)
	private String descricao;

	@Column(nullable = false, length = 3)
	private int temperaturaMin;
	@Column(nullable = false, length = 3)
	private int temperaturaMax;
	@Column(nullable = false, length = 5)
	private int umidade;
	
	
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String string) {
		this.data = string;
	}
	public String getDiadasemana() {
		return diadasemana;
	}
	public void setDiadasemana(String diadasemana) {
		this.diadasemana = diadasemana;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(int temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public int getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(int temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public int getUmidade() {
		return umidade;
	}
	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Previsao other = (Previsao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
