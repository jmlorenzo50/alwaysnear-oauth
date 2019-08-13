package es.alwaysnear.oauth.services;

import es.alwaysnear.oauth.model.Usuario;

public interface IUsuarioService {
	
	public Usuario findByLogin(String login);

}
