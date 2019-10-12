package br.usjt.ativ04previsaoDoTempo.jpaCrud.ativ04;

import javax.persistence.EntityManager;

import br.usjt.ativ04previsaoDoTempo.JPAUtil;
import br.usjt.ativ04previsaoDoTempo.model.Cidade;


public class TesteBuscaOneToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Cidade c = manager.find(Cidade.class, 8L);
		System.out.println(c);
		manager.close();
		JPAUtil.close();
		}
}
