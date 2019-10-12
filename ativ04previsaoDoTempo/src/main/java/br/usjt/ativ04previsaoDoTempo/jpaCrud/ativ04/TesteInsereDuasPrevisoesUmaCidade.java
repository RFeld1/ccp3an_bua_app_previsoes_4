package br.usjt.ativ04previsaoDoTempo.jpaCrud.ativ04;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ativ04previsaoDoTempo.JPAUtil;
import br.usjt.ativ04previsaoDoTempo.model.Cidade;
import br.usjt.ativ04previsaoDoTempo.model.Previsao;


public class TesteInsereDuasPrevisoesUmaCidade {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Cidade c = new Cidade();
		c.setNome("Guaratinguetá");
		c.setLatitude("22 48 59 S");
		c.setLongitude("45 11 33 W");
		List <Previsao> previsoes = new ArrayList <>();
		Previsao p1 = new Previsao();
		p1.setCidade(c);
		p1.setDiadasemana("Segunda");
		p1.setDescricao("Nublado");
		p1.setTemperaturaMin(11);
		p1.setTemperaturaMax(20);
		p1.setUmidade(1040);
		p1.setData("2019-10-14");
		Previsao p2 = new Previsao ();
		p2.setCidade(c);
		p2.setDiadasemana("Terça");
		p2.setDescricao("Ensolarado");
		p2.setTemperaturaMin(23);
		p2.setTemperaturaMax(30);
		p2.setUmidade(1030);
		p2.setData("2019-10-15");

		previsoes.add(p1);
		previsoes.add(p2); 
		c.setPrevisoes(previsoes);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
