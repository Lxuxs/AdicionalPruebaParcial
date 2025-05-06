package com.mycompany.evaluacion_correcion2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Celular implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCel;
    
    private int numero;
    private String estado;
    private double saldo;
    private double megas;
    
    @OneToOne
    private Cliente unCliente;

    // Constructor vacío
    public Celular() {
    }

    // Constructor con parámetros
    public Celular(int numero, String estado, double saldo, double megas, Cliente unCliente) {
        this.numero = numero;
        this.estado = estado;
        this.saldo = saldo;
        this.megas = megas;
        this.unCliente = unCliente;
    }

    // Getters y Setters
    public int getIdCel() {
        return idCel;
    }

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMegas() {
        return megas;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
}