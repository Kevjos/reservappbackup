package com.reservapp2.demo.modelo;
// Generated 2/07/2017 08:36:40 AM by Hibernate Tools 5.1.0.Final



/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer idFactura;
     private Reserva reserva;
     private String metodoPago;
     private Float valorTotal;
     private String estadoPago;

    public Factura() {
    }

	
    public Factura(Integer idFactura, Reserva reserva) {
        this.idFactura = idFactura;
        this.reserva = reserva;
    }
    public Factura(Integer idFactura, Reserva reserva, String metodoPago, Float valorTotal, String estadoPago) {
       this.idFactura = idFactura;
       this.reserva = reserva;
       this.metodoPago = metodoPago;
       this.valorTotal = valorTotal;
       this.estadoPago = estadoPago;
    }
   
    public Integer getIdFactura() {
        return this.idFactura;
    }
    
    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public String getMetodoPago() {
        return this.metodoPago;
    }
    
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public Float getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getEstadoPago() {
        return this.estadoPago;
    }
    
    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }




}

