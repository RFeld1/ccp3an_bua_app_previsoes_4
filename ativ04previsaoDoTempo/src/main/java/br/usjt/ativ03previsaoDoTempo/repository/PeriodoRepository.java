package br.usjt.ativ03previsaoDoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ativ03previsaoDoTempo.model.Periodo;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {

}