package com.mycompany.evaluacion_correcion2.logica;

import com.mycompany.evaluacion_correcion2.logica.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T23:20:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Celular.class)
public class Celular_ { 

    public static volatile SingularAttribute<Celular, String> estado;
    public static volatile SingularAttribute<Celular, Integer> numero;
    public static volatile SingularAttribute<Celular, Integer> idCel;
    public static volatile SingularAttribute<Celular, Double> saldo;
    public static volatile SingularAttribute<Celular, Cliente> unCliente;
    public static volatile SingularAttribute<Celular, Double> megas;

}