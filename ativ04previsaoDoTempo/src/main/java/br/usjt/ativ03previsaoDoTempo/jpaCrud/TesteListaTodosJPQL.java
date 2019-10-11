package br.usjt.ativ03previsaoDoTempo.jpaCrud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.ativ03previsaoDoTempo.JPAUtil;
import br.usjt.ativ03previsaoDoTempo.model.Periodo;


public class TesteListaTodosJPQL {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Periodo");
		@SuppressWarnings("unchecked")
		List <Periodo> periodos = query.getResultList();
		for (Periodo p : periodos) {
		System.out.println(p);
		}
		manager.close();
		JPAUtil.close();
		}

//	@Override
//	public String toString() {
//		return "TesteListaTodosJPQL []";
//	}
	
}
