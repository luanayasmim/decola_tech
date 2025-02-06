package com.avanade.decolatech.rh.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.entities.Usuario;
import com.avanade.decolatech.rh.repositories.UserRepository;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario user = userRepository.getUserByUsername(username);

        List<GrantedAuthority> authorities = user.getRoles().stream().map(role ->  new SimpleGrantedAuthority(role.getNome()))
        		.collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
                username,
                user.getPassword(),
                authorities
        );
    }
	
	public Usuario saveUser(Usuario user) {
		return userRepository.save(user);
	}	
}

