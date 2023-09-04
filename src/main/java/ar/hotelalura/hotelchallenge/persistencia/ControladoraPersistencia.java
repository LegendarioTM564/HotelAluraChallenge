
package ar.hotelalura.hotelchallenge.persistencia;

import ar.hotelalura.hotelchallenge.logica.Huesped;
import ar.hotelalura.hotelchallenge.logica.Reserva;
import ar.hotelalura.hotelchallenge.logica.Usuario;
import ar.hotelalura.hotelchallenge.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    ReservaJpaController reservaJpa = new ReservaJpaController();
    HuespedJpaController huespedJpa = new HuespedJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void guardar(Reserva reservas) {
        reservaJpa.create(reservas);
    }
    
    public void guardar(Huesped huesped) {
        huespedJpa.create(huesped);
    }

    public List<Reserva> traerReservas() {
        return reservaJpa.findReservaEntities();
    }

    public List<Huesped> traerHuespedes() {
        return huespedJpa.findHuespedEntities();
    }

   

    public void borrar( int numHuesped, int numReserva) {
        
         try {
            
            huespedJpa.destroy(numHuesped);
            reservaJpa.destroy(numReserva);
            
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void modificarHuesped(Huesped huesped) {
        try {
            huespedJpa.edit(huesped);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarReserva(Reserva reserva) {
        try {
            reservaJpa.edit(reserva);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Reserva buscarReserva(int idReserva) {
        return reservaJpa.findReserva(idReserva);
    }

    public Huesped traerHuesped(int numHuesped) {
        return huespedJpa.findHuesped(numHuesped);
    }

    

    public List<Huesped> busquedaHuespedes(String busquedaH) {
        return traerHuespedes();
    }

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    
}
