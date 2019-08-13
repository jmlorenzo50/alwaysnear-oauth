package es.alwaysnear.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.alwaysnear.oauth.model.Usuario;

@FeignClient("alwaysnear-usuarios")
public interface UsuarioFeignClient {

	@GetMapping("/usuarios/search/buscar-login")
	public Usuario findByLogin (@RequestParam String login);
	
}
