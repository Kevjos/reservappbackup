package com.reservapp2.demo.modelo;
// Generated 2/07/2017 08:36:40 AM by Hibernate Tools 5.1.0.Final


import java.util.HashSet;
import java.util.Set;

/**
 * Mesa generated by hbm2java
 */
public class Mesa  implements java.io.Serializable {


     private Integer idMesa;
     private Establecimiento establecimiento;
     private Integer puestos;
     private String ubicacion;
     private String estado;
     private Set<Reserva> reservas = new HashSet<Reserva>(0);

    public Mesa() {
    }

	
    public Mesa(Integer idMesa, Establecimiento establecimiento, Integer puestos) {
        this.idMesa = idMesa;
        this.establecimiento = establecimiento;
        this.puestos = puestos;
    }
    public Mesa(Integer idMesa, Establecimiento establecimiento, Integer puestos, String ubicacion, String estado, Set<Reserva> reservas) {
       this.idMesa = idMesa;
       this.establecimiento = establecimiento;
       this.puestos = puestos;
       this.ubicacion = ubicacion;
       this.estado = estado;
       this.reservas = reservas;
    }
   
    public Integer getIdMesa() {
        return this.idMesa;
    }
    
    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }
    public Establecimiento getEstablecimiento() {
        return this.establecimiento;
    }
    
    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
    public Integer getPuestos() {
        return this.puestos;
    }
    
    public void setPuestos(Integer puestos) {
        this.puestos = puestos;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set<Reserva> getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }




}


