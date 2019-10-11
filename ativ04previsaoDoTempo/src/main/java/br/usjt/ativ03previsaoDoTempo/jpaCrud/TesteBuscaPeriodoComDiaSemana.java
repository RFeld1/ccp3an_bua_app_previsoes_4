package br.usjt.ativ03previsaoDoTempo.jpaCrud;

import javax.persistence.EntityManager;

import br.usjt.ativ03previsaoDoTempo.JPAUtil;
import br.usjt.ativ03previsaoDoTempo.model.Periodo;

public class TesteBuscaPeriodoComDiaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Periodo p = manager.find(Periodo.class, 1L);
		System.out.println(p);
		manager.close();
		JPAUtil.close();
		}

	@Override
	public String toString() {
		return "TesteBuscaPeriodoComDiaSemana []";
	}

	
}
