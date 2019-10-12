package br.usjt.ativ04previsaoDoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ativ04previsaoDoTempo.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
public Usuario findOneByLoginAndSenha (String login, String senha);

}