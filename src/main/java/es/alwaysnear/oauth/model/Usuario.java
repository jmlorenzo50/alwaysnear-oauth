package es.alwaysnear.oauth.model;

import java.io.Serializable;
import java.util.List;

/**
 * Entidad usuario. Recoge los datos del usuario que accede al sistema
 * @author jmlorenzo
 * @version 1.0
 */
public class Usuario implements Serializable {
	
	/** Identificador de la entidad */
	private Long usuId;
	
	/** Login del usuario */
	private String login;
	
	/** El password */
	private String password;
	
	private Boolean enabled;
	
	private List<Rol> roles;

	public Long getUsuId() {
		return usuId;
	}

	public void setUsuId(Long usuId) {
		this.usuId = usuId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	private static final long serialVersionUID = 5799868849694405023L;

	
}
