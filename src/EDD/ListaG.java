/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Usuario;
/**
 *
 * @author Gabriel
 * version 13/10/23
 */
public class ListaG {
    private Usuario head;
    private Integer length;

    public ListaG() {
        this.head = null;
        this.length = 0;
    }

    public Usuario getHead() {
        return head;
    }

    public void setHead(Usuario head) {
        this.head = head;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    
    
    public void insertBegin(Usuario usuario) {
        if (isEmpty()){
        setHead(usuario);
        }
        else{
        usuario.setNext(getHead());
        setHead(usuario);
        }
        length++;
    }

    
    public void insertFinal(Usuario usuario) {
        if (isEmpty()){
            setHead(usuario);
        }
        else{
            Usuario pointer=getHead();
            while (pointer.getNext()!=null){
                pointer=pointer.getNext();
            }
            pointer.setNext(usuario);
        }
        length++;
    }

    
    public void insertAtIndex(Usuario usuario, int index) {
        if (isEmpty() || index==0){
        insertBegin(usuario);
        }
        else {
            if (index<length){
                Usuario pointer=getHead();
                int cont=0;
                while (cont<index-1){
                    pointer=pointer.getNext();
                    cont++;
                }
                usuario.setNext(pointer.getNext());
                pointer.setNext(usuario);
                length++;
            } 
            else if (index==length){
                insertFinal(usuario);
            } 
            else {
                System.out.println("Index not valid");
            }
        }
    }

    
    public Usuario deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            Usuario temp=getHead();
            setHead(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }

   
    
    public Usuario deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            Usuario pointer=getHead();
            while(pointer.getNext().getNext()!=null){
                pointer=pointer.getNext();
            }
            Usuario temp=pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    
    public Usuario deleteAtIndex(int index) {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            if (index==0){
                return deleteBegin();
            }
            else{
                if (index<getLength()){
                    Usuario pointer=getHead();
                    int cont=0;
                    while(cont<index-1){
                        pointer=pointer.getNext();
                        cont++;
                    }
                    Usuario temp=pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    length--;
                    return temp;    
                }
                else{
                    if (index==getLength()-1){
                        return deleteFinal();
                    } 
                    else{
                        System.out.println("Index not valid");
                        return null;
                    }
                    
                }
            }
        }
    }

    
    public boolean isEmpty() {
            return getHead()==null;    
    }
    public void print() {
        Usuario pointer=getHead();
        while (pointer!=null){
            System.out.println(" ["+pointer.getId()+"] " );
            pointer=pointer.getNext();
        }
    }
    
}
