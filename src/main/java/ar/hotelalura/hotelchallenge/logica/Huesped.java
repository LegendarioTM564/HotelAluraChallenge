
package ar.hotelalura.hotelchallenge.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Huesped implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fNacimiento;
    private String nacionalidad;
    private String telefono;
    
    @OneToOne
    private Reserva numReserva;

    public Huesped() {
    }

    public Huesped(int id, String nombre, String apellido, Date fNacimiento, String nacionalidad, String telefono, Reserva numReserva) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.numReserva = numReserva;
    }

    public void setNumReserva(Reserva numReserva) {
        this.numReserva = numReserva;
    }

    public Reserva getNumReserva() {
        return numReserva;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    
   
    
    
    
    
}
