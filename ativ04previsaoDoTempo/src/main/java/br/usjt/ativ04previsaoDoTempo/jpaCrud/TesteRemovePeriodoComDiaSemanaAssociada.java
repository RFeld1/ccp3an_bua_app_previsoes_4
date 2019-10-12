package br.usjt.ativ04previsaoDoTempo.jpaCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ativ04previsaoDoTempo.JPAUtil;
import br.usjt.ativ04previsaoDoTempo.model.Periodo;


public class TesteRemovePeriodoComDiaSemanaAssociada {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Periodo p = manager.find(Periodo.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
		}
}
