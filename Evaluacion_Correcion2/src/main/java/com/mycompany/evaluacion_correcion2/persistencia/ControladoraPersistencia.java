package com.mycompany.evaluacion_correcion2.persistencia;

import com.mycompany.evaluacion_correcion2.logica.Celular;
import com.mycompany.evaluacion_correcion2.logica.Cliente;
import com.mycompany.evaluacion_correcion2.logica.Recargas;

public class ControladoraPersistencia {

    private CelularJpaController celularJpa = new CelularJpaController();
    private ClienteJpaController clienteJpa = new ClienteJpaController();
    private RecargasJpaController recargasJpa = new RecargasJpaController();

    public void crearCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public Cliente buscarClientePorCedula(String cedula) {
        return clienteJpa.findByCedula(cedula);
    }

    public void crearCelular(Celular celular) {
        celularJpa.create(celular);
    }

    public Celular buscarCelularPorNumero(int numero) {
        return celularJpa.findByNumero(numero);
    }

    public void crearRecarga(Recargas recarga) {
        recargasJpa.create(recarga);
    }

    public void actualizarCelular(Celular celular) throws Exception {
        celularJpa.edit(celular);
    }
}