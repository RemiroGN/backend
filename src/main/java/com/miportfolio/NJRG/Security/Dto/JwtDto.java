package com.miportfolio.NJRG.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class JwtDto {
   private String token;
   private String bearer = "Bearer";
   private String nombreUsuario;
   private Collection<? extends GrantedAuthority> authorithies;
   
   
   //Constructor
    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authorithies) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorithies = authorithies;
    }
    
    // G&S

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorithies() {
        return authorithies;
    }

    public void setAuthorithies(Collection<? extends GrantedAuthority> authorithies) {
        this.authorithies = authorithies;
    }
    
   
}
