
package ar.hotelalura.hotelchallenge.logica;

import ar.hotelalura.hotelchallenge.persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;


public class Controladora {

    ControladoraPersistencia controladoraPersis;

    public Controladora() {
        
        controladoraPersis = new ControladoraPersistencia();
        
    }
    
    
    
    
    public List<Usuario> traerUsuario() {
        
        
        List<Usuario> listaUsuarios = controladoraPersis.traerUsuarios();
        
        
        return listaUsuarios;
    }
    
    
    
    
    

    public void guardar(String nombre, String apellido, String telefono, Date nacimiento, String nacionalidad, Date checkIn, Date checkOut, double valor, String formaPago) {
       
        Reserva reservas = new Reserva();
        
        reservas.setCheckIn(checkIn);
        reservas.setCheckOut(checkOut);
        reservas.setValor(valor);
        reservas.setPago(formaPago);
        
        controladoraPersis.guardar(reservas);
        
        
        Huesped huesped = new Huesped();
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setTelefono(telefono);
        huesped.setfNacimiento(nacimiento);
        huesped.setNacionalidad(nacionalidad);
        huesped.setNumReserva(reservas);
        
        controladoraPersis.guardar(huesped);
        
         
    }

    public List<Reserva> traerReservas() {
        return controladoraPersis.traerReservas();
    }

    public List<Huesped> traerHuespedes() {
         return controladoraPersis.traerHuespedes();
    }

    
  

   public void borrar( int numHuesped , int numReserva) {
        controladoraPersis.borrar(numReserva, numHuesped);
    }

    public Huesped traerHuesped(int numHuesped) {
        return controladoraPersis.traerHuesped(numHuesped);
    }

    public void modificar(Huesped huesped, String nombre, String apellido, String telefono, Date nacimiento, String nacionalidad, Date checkIn, Date checkOut, double valor, String formaPago) {
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setTelefono(telefono);
        huesped.setfNacimiento(nacimiento);
        huesped.setNacionalidad(nacionalidad);
        
        controladoraPersis.modificarHuesped(huesped);
        
        Reserva reserva = this.buscarReserva(huesped.getId());
        reserva.setCheckIn(checkIn);
        reserva.setCheckOut(checkOut);
        reserva.setValor(valor);
        reserva.setPago(formaPago);
        
        this.modificarReserva(reserva);
        
    }

    public Reserva buscarReserva(int idReserva){
   
         return controladoraPersis.buscarReserva(idReserva);
   
   }

    private void modificarReserva(Reserva reserva) {
         controladoraPersis.modificarReserva(reserva);
    }

    public List<Huesped> busquedaHuespedes(String busquedaH) {
        return controladoraPersis.busquedaHuespedes(busquedaH);
    }

    public Reserva traerReserva(int numReserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}

  
    
      

    

    
    

