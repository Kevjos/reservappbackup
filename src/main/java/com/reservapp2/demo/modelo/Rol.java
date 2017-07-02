package com.reservapp2.demo.modelo;
// Generated 2/07/2017 08:36:40 AM by Hibernate Tools 5.1.0.Final


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer idRol;
     private String nombre;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Rol() {
    }

	
    public Rol(Integer idRol) {
        this.idRol = idRol;
    }
    public Rol(Integer idRol, String nombre, Set<Usuario> usuarios) {
       this.idRol = idRol;
       this.nombre = nombre;
       this.usuarios = usuarios;
    }
   
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


