/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.ListaG;

/**
 *
 * @author Gabriel
 * version 15/10/23
 * 
 */

public class Usuario {
    private String id;
    private Integer numero;
    private ListaG relaciones;
    private Usuario next;

    public Usuario(String nombre, Integer numero) {
        this.id = nombre;
        this.numero = numero;
        this.relaciones = new ListaG();
        this.next=null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ListaG getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(ListaG relaciones) {
        this.relaciones = relaciones;
    }

    public Usuario getNext() {
        return next;
    }

    public void setNext(Usuario next) {
        this.next = next;
    }
    
    public void print(){
        System.out.println("--------------");
        System.out.println("Id: "+getId());
        System.out.println("Numero: "+getNumero());
        System.out.println("Relaciones: ");
        Usuario pointer=relaciones.getHead();
        while (pointer!=null){
            System.out.print("["+pointer.getId()+"]");
            pointer=pointer.getNext(); 
        }
        System.out.println("--------------");
    }
    
    
    
}
