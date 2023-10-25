package EDD;
import Grafo.Usuario;
import EDD.ListaG;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 * version 19/10/23
 */
public class NodoG {
    private Usuario usuario;
    private NodoG next;
    private ListaG adyacentes;
    private boolean visitado;
    private Integer numeroComponente;

    public NodoG(Usuario usuario) {
        this.usuario = usuario;
        this.next = null;
        this.adyacentes = new ListaG();
        this.visitado=false;
        this.numeroComponente=null;
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

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Integer getNumeroComponente() {
        return numeroComponente;
    }

    public void setNumeroComponente(Integer numeroComponente) {
        this.numeroComponente = numeroComponente;
    }
    
    
    
    //imprime todos los atributos del nodo
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
