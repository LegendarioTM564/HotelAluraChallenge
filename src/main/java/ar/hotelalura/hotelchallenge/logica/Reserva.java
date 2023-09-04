
package ar.hotelalura.hotelchallenge.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Temporal(TemporalType.DATE) 
    private Date checkIn;
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    private double valor;
    private String pago;
    
   

    public Reserva() {
    }

    public Reserva(int id, Date checkIn, Date checkOut, double valor, String pago, Huesped unHuesped) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.valor = valor;
        this.pago = pago;
       
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public double getValor() {
        return valor;
    }

    public String getPago() {
        return pago;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

  

  

    
    
    
}
