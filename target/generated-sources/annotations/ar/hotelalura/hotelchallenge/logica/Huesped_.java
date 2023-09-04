package ar.hotelalura.hotelchallenge.logica;

import ar.hotelalura.hotelchallenge.logica.Reserva;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-04T18:05:59", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Huesped.class)
public class Huesped_ { 

    public static volatile SingularAttribute<Huesped, Reserva> numReserva;
    public static volatile SingularAttribute<Huesped, String> apellido;
    public static volatile SingularAttribute<Huesped, Date> fNacimiento;
    public static volatile SingularAttribute<Huesped, Integer> id;
    public static volatile SingularAttribute<Huesped, String> telefono;
    public static volatile SingularAttribute<Huesped, String> nombre;
    public static volatile SingularAttribute<Huesped, String> nacionalidad;

}