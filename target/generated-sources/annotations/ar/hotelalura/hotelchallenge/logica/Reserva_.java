package ar.hotelalura.hotelchallenge.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-04T18:05:59", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Date> checkIn;
    public static volatile SingularAttribute<Reserva, Double> valor;
    public static volatile SingularAttribute<Reserva, Integer> id;
    public static volatile SingularAttribute<Reserva, Date> checkOut;
    public static volatile SingularAttribute<Reserva, String> pago;

}