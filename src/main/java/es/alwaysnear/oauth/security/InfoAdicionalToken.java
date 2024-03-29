package es.alwaysnear.oauth.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import es.alwaysnear.oauth.model.Usuario;
import es.alwaysnear.oauth.services.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer{

	@Autowired
	private IUsuarioService usuarioService;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Map<String, Object> info = new HashMap<String, Object>();
		
		Usuario usuario = usuarioService.findByLogin(authentication.getName());
		info.put("nombre", usuario.getLogin());
		info.put("apellido", usuario.getLogin());
		info.put("correo", usuario.getLogin()  + "@email.com");
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
