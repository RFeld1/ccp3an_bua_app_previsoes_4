package br.usjt.ativ04previsaoDoTempo.jpaCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ativ04previsaoDoTempo.JPAUtil;
import br.usjt.ativ04previsaoDoTempo.model.Periodo;


public class TesteAtualizaPeriodo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Periodo p = manager.find(Periodo.class, 1L);
		p.setTemperaturaMin(10);
		p.setTemperaturaMax(50);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
