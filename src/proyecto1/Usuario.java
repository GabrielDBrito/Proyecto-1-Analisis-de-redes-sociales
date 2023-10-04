/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import EDD.Lista;

/**
 *
 * @author Gabriel
 * version 04/10/23
 * 
 */

public class Usuario {
    private String nombre;
    private Integer numero;
    private Lista relaciones;

    public Usuario(String nombre, Integer numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.relaciones = new Lista();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Lista getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(Lista relaciones) {
        this.relaciones = relaciones;
    }
    
    
}
