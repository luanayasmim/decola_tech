package com.avanade.decolatech.rh.entities;

public class AuthResponse {
	private String accessToken;
	
	public AuthResponse() { }
    
    public AuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }

	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}	
}
