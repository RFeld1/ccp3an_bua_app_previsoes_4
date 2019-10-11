package br.usjt.ativ03previsaoDoTempo.jpaCrud;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ativ03previsaoDoTempo.JPAUtil;
import br.usjt.ativ03previsaoDoTempo.model.DiaSemana;
import br.usjt.ativ03previsaoDoTempo.model.Periodo;

public class TesteInserePeriodoComDiaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		//Perfil p = new Perfil ();
		DiaSemana ds = new DiaSemana();
		
		ds.setNomeDia("Segunda-feira");
		manager.persist(ds);
		
		Periodo p = new Periodo();
		p.setDiaSemana(ds);
		p.setDatahora("27/09/2019");
		p.setTemperaturaMin(13);
		p.setTemperaturaMax(18);
		p.setHuminade(1030);
		p.setLatitude("22º 48 59 S");
		p.setLongitude("45° 11 33\" W");
		p.setDescricao("Nublado");
		
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
