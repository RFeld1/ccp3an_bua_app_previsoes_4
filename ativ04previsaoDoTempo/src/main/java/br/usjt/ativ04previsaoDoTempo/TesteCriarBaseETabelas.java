package br.usjt.ativ04previsaoDoTempo;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
		}
}
