package com.mycompany.evaluacion_correccion.persistencia;

   import com.mycompany.evaluacion_correccion.logica.Propietario;
   import com.mycompany.evaluacion_correccion.logica.Turno;
   import com.mycompany.evaluacion_correccion.logica.Vehiculo;
   import javax.persistence.EntityManager;

   public class ControladoraPersistencia {
       
       private PropietarioJpaController propietarioJpa = new PropietarioJpaController();
       private TurnoJpaController turnoJpa = new TurnoJpaController();
       private VehiculoJpaController vehiculoJpa = new VehiculoJpaController();
       
       public PropietarioJpaController getPropietarioJpa() {
           return propietarioJpa;
       }
       
       public void guardar(Propietario propietario, Turno turno, Vehiculo vehiculo) {
           EntityManager em = propietarioJpa.getEntityManager();
           try {
               em.getTransaction().begin();
               
               // Persistir Propietario primero
               em.persist(propietario);
               
               // Asociar Propietario al Vehículo y persistir Vehículo
               vehiculo.setUnPropietario(propietario);
               em.persist(vehiculo);
               
               // Asociar Vehículo al Turno y persistir Turno
               turno.setUnVehiculo(vehiculo);
               em.persist(turno);
               
               em.getTransaction().commit();
           } catch (Exception e) {
               if (em.getTransaction().isActive()) {
                   em.getTransaction().rollback();
               }
               throw new RuntimeException("Error al guardar los datos: " + e.getMessage(), e);
           } finally {
               em.close();
           }
       }
   }