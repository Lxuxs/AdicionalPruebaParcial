package com.mycompany.evaluacion_correcion2.logica;

import com.mycompany.evaluacion_correcion2.persistencia.ControladoraPersistencia;

public class Controladora {

    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void realizarRecarga(String cedula, String nombre, String apellido, int numeroCelular, 
                               String estadoCelular, String valorRecarga, double saldo, double megas) 
                               throws Exception {
        // Validar datos
        if (cedula == null || cedula.length() != 10) {
            throw new Exception("Cédula inválida (debe tener 10 dígitos)");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre es obligatorio");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new Exception("El apellido es obligatorio");
        }
        if (numeroCelular <= 0) {
            throw new Exception("Número de celular inválido");
        }
        if (saldo < 0 || megas < 0) {
            throw new Exception("Saldo o megas no pueden ser negativos");
        }

        // Buscar o crear cliente
        Cliente cliente = controlPersis.buscarClientePorCedula(cedula);
        if (cliente == null) {
            cliente = new Cliente();
            cliente.setCedula(cedula);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            controlPersis.crearCliente(cliente);
        }

        // Buscar o crear celular
        Celular celular = controlPersis.buscarCelularPorNumero(numeroCelular);
        if (celular == null) {
            celular = new Celular();
            celular.setNumero(numeroCelular);
            celular.setEstado(estadoCelular);
            celular.setSaldo(0);
            celular.setMegas(0);
            celular.setUnCliente(cliente); // Asocia el cliente al celular
            controlPersis.crearCelular(celular);
        } else {
            // Actualizar estado del celular si cambió
            celular.setEstado(estadoCelular);
            controlPersis.actualizarCelular(celular);
        }

        // Crear recarga
        Recargas recarga = new Recargas();
        recarga.setValor(valorRecarga);
        recarga.setSaldo(saldo);
        recarga.setMegas(megas);
        recarga.setUnCelular(celular); // Asocia la recarga al celular
        controlPersis.crearRecarga(recarga);

        // Actualizar saldo y megas del celular
        celular.setSaldo(celular.getSaldo() + saldo);
        celular.setMegas(celular.getMegas() + megas);
        controlPersis.actualizarCelular(celular);
    }
}