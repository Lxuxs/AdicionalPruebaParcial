package com.mycompany.evaluacion_correcion2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Recargas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRec;
    
    private String valor;
    private double saldo;
    private double megas;
    
    @OneToOne
    private Celular unCelular;

    // Constructor vacío
    public Recargas() {
    }

    // Constructor con parámetros
    public Recargas(String valor, double saldo, double megas, Celular unCelular) {
        this.valor = valor;
        this.saldo = saldo;
        this.megas = megas;
        this.unCelular = unCelular;
    }

    // Getters y Setters
    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    public Celular getUnCelular() {
        return unCelular;
    }

    public void setUnCelular(Celular unCelular) {
        this.unCelular = unCelular;
    }
}