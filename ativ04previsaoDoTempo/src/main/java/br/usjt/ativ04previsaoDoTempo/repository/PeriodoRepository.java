package br.usjt.ativ04previsaoDoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ativ04previsaoDoTempo.model.Periodo;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {

}