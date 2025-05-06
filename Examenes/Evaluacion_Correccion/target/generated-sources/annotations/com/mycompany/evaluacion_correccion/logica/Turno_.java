package com.mycompany.evaluacion_correccion.logica;

import com.mycompany.evaluacion_correccion.logica.Vehiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T19:19:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> anden;
    public static volatile SingularAttribute<Turno, String> dia;
    public static volatile SingularAttribute<Turno, Integer> id_turno;
    public static volatile SingularAttribute<Turno, String> hora_Disponible;
    public static volatile SingularAttribute<Turno, Vehiculo> unVehiculo;

}