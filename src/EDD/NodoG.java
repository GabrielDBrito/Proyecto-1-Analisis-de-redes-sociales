package EDD;
import Grafo.Usuario;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 * version 27/10/23
 */
public class NodoG {
    private Usuario usuario;
    private NodoG next;
    private ListaG adyacentes;
    private Integer numeroComponente;

    public NodoG(Usuario usuario) {
        this.usuario = usuario;
        this.next = null;
        this.adyacentes = new ListaG();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoG getNext() {
        return next;
    }

    public void setNext(NodoG next) {
        this.next = next;
    }

    public ListaG getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ListaG adyacentes) {
        this.adyacentes = adyacentes;
    }

    public Integer getNumeroComponente() {
        return numeroComponente;
    }

    public void setNumeroComponente(Integer numeroComponente) {
        this.numeroComponente = numeroComponente;
    }
    
    //imprime los atributos del nodo
    public void print(){
        System.out.println("-----------------------------------");
        System.out.println("Id: "+getUsuario().getId());
        System.out.println("Numero: "+getUsuario().getNumero());
        System.out.print("Relaciones: ");
        NodoG pointer=getAdyacentes().getHead();
        while (pointer!=null){
            System.out.print("["+pointer.getUsuario().getId()+"]");
            pointer=pointer.getNext(); 
        }
        System.out.println(" ");
        System.out.println("-----------------------------------");
    }
  
}
