package br.usjt.ativ03previsaoDoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ativ03previsaoDoTempo.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
public Usuario findOneByLoginAndSenha (String login, String senha);

}