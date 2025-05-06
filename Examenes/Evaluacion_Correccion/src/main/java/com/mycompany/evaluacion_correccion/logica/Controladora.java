package com.mycompany.evaluacion_correccion.logica;

import com.mycompany.evaluacion_correccion.persistencia.ControladoraPersistencia;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String cedulaPropietario, String nombrePropietario, String apellidoPropietario,
            String placaVehiculo, String marcaVehiculo, String estadoVehiculo,
            String espacioVehiculo, String diaTurno, String horaTurno) throws Exception {
        
        // Crear y configurar Propietario
        Propietario propietario = new Propietario();
        propietario.setCedula(cedulaPropietario);
        propietario.setNombre(nombrePropietario);
        propietario.setApellidos(apellidoPropietario);
        
        // Crear y configurar Vehículo
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca(placaVehiculo);
        vehiculo.setMarca(marcaVehiculo);
        vehiculo.setEstado(estadoVehiculo);
        vehiculo.setUnPropietario(propietario);
        
        // Crear y configurar Turno
        Turno turno = new Turno();
        turno.setAnden(espacioVehiculo);
        turno.setDia(diaTurno);
        turno.setHora_Disponible(horaTurno);
        turno.setUnVehiculo(vehiculo);
        
        // Validar restricciones
        validarRestriccionesTurno(vehiculo, turno);
        
        // Guardar en la base de datos
        controlPersis.guardar(propietario, turno, vehiculo);
    }
    
    private void validarRestriccionesTurno(Vehiculo vehiculo, Turno turno) throws Exception {
        EntityManager em = controlPersis.getPropietarioJpa().getEntityManager();
        try {
            // Restricción 1: Un vehículo no puede tener dos turnos el mismo día
            Query queryDia = em.createQuery(
                "SELECT t FROM Turno t WHERE t.unVehiculo.placa = :placa AND t.dia = :dia"
            );
            queryDia.setParameter("placa", vehiculo.getPlaca());
            queryDia.setParameter("dia", turno.getDia());
            List<Turno> turnosMismoDia = queryDia.getResultList();
            
            if (!turnosMismoDia.isEmpty()) {
                throw new Exception("El vehículo ya tiene un turno registrado para el mismo día: " + turno.getDia());
            }
            
            // Restricción 2: Un vehículo no puede tener dos turnos en el mismo andén
            Query queryAnden = em.createQuery(
                "SELECT t FROM Turno t WHERE t.unVehiculo.placa = :placa AND t.anden = :anden"
            );
            queryAnden.setParameter("placa", vehiculo.getPlaca());
            queryAnden.setParameter("anden", turno.getAnden());
            List<Turno> turnosMismoAnden = queryAnden.getResultList();
            
            if (!turnosMismoAnden.isEmpty()) {
                throw new Exception("El vehículo ya tiene un turno registrado en el andén: " + turno.getAnden());
            }
        } finally {
            em.close();
        }
    }
}