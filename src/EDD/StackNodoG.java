/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Usuario;
/**
 *
 * @author Gabriel
 */
public class StackNodoG {
    private NodoG peak;
    private int length;

    public StackNodoG() {
        this.peak = null;
        this.length = 0;
    }

    public NodoG getPeak() {
        return peak;
    }

    public void setPeak(NodoG peak) {
        this.peak = peak;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void push(Usuario usuario) {
        NodoG nodo = new NodoG(usuario);
        if (isEmpty()) {
            setPeak(nodo);
        } else {
            nodo.setNext(getPeak());
            setPeak(nodo);
        }
        length++;
    }

    public NodoG pop() {
        if (isEmpty()) {
            System.out.println("La lista se encuentra vacia");
            return null;
        } else {
            NodoG pointer = getPeak();
            setPeak(pointer.getNext());
            pointer.setNext(null);
            length--;
            System.out.print(pointer.getUsuario().getNumero());
            return pointer;
        }
    }

    public boolean isEmpty() {
        return getPeak() == null;
    }
    
    public void print(){
        NodoG pointer = getPeak();
        while (pointer != null) {
            System.out.println("[ " + pointer.getUsuario().getId() + " ]");
            pointer = pointer.getNext();
        } 
    }
}
