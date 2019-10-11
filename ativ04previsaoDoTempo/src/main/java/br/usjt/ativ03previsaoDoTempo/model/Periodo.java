package br.usjt.ativ03previsaoDoTempo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="tb_periodo")
public class Periodo implements Serializable {	
    private static final long serialVersionUID = 1L;
    
    @OneToOne(optional=false)
	@JoinColumn(name="id_nome_dia_semana")
    private DiaSemana diaSemana;
    
    @Id
    @GeneratedValue
    private Long id;

    //private String diaSemana;
    
    @Column (nullable=false, length=50)
    private String datahora;
    
    @Column (nullable=false, length=3)
    private int temperaturaMin;
    @Column (nullable=false, length=3)
    private int temperaturaMax;
    @Column (nullable=false, length=5)
    private int huminade;
    @Column (nullable=false, length=50)
    private String latitude;
    @Column (nullable=false, length=50)
    private String longitude;
    @Column (nullable=false, length=140)
    private String descricao;

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
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

    public int getHuminade() {
        return huminade;
    }

    public void setHuminade(int huminade) {
        this.huminade = huminade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDatahora() {
		return datahora;
	}

	public void setDatahora(String datahora) {
		this.datahora = datahora;
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
		Periodo other = (Periodo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
