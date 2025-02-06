package com.avanade.decolatech.rh.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.decolatech.rh.entities.AuthRequest;
import com.avanade.decolatech.rh.entities.AuthResponse;
import com.avanade.decolatech.rh.entities.Role;
import com.avanade.decolatech.rh.entities.Usuario;
import com.avanade.decolatech.rh.services.AuthService;
import com.avanade.decolatech.rh.services.UsuarioService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private AuthService authService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Usuario> incluir(@RequestBody Usuario usuario) {
		try {
    		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    		String password = passwordEncoder.encode(usuario.getPassword());
    		usuario.setPassword(password);
    		
    		List<Role> roles = new ArrayList<Role>();
    		Role role = new Role("ROLE_ADMIN");
    		role.setUsuario(usuario);
    		roles.add(role);
    		usuario.setRoles(roles);
    		
    		return new ResponseEntity<Usuario>(usuarioService.saveUser(usuario), HttpStatus.CREATED);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request){
		try {
			 	String token = authService.login(request);
			 	
		        AuthResponse authResponse = new AuthResponse();
		        authResponse.setAccessToken(token);

		        return new ResponseEntity<>(authResponse, HttpStatus.OK);
			
 		} catch (Exception e) {
 			throw new RuntimeException(e);
		}
	}

}
