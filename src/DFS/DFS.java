/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DFS;
import Grafo.Grafo;
import EDD.StackNodoG;
import EDD.ListaG;
import EDD.NodoG;

/**
 *
 * @author Gabriel
 * version 26/10/23
 */
public class DFS {
    private StackNodoG stack;

    public DFS(){
        StackNodoG stack=new StackNodoG();
        this.stack=stack;
    }
    
    public StackNodoG getStack() {
        return stack;
    }

    public void setStack(StackNodoG stack) {
        this.stack = stack;
    }  
    
   /* public void dfs (Grafo grafo, NodoG nodo, boolean[] visitado){
        visitado[nodo.getUsuario().getNumero()]=true;
        NodoG pointer=grafo.getNodos().getHead();
        while (pointer!=null){
            if (!pointer.isVisitado()){
                dfs(grafo, pointer, visitado);
            }
        }
        stack.push(nodo.getUsuario());
        getStack().getPeak().setAdyacentes(nodo.getAdyacentes());
    }
    
    /*/
    
      /*public DFS(Grafo grafo){
        StackNodoG stack=new StackNodoG();
        this.stack=stack;
        NodoG pointer=grafo.getNodos().getHead();
        while (pointer!=null){
            if (!pointer.isVisitado()){
                dfs(pointer);
            }
            pointer=pointer.getNext();
        }
    }
*/
    
    
    
    /*public void dfs(NodoG nodo){
        nodo.setVisitado(true);
        NodoG pointer1=nodo.getAdyacentes().getHead();
        while (pointer1!=null){
            if (!pointer1.isVisitado()){
                dfs(pointer1);
            }
            pointer1=pointer1.getNext();
        }
        getStack().push(nodo.getUsuario());
        getStack().getPeak().setAdyacentes(nodo.getAdyacentes());
    }
    /*/
    
    /*public void dfs(ListaG lista, boolean[] visitado){
        NodoG nodo = lista.getHead();
        while (nodo!= null){
            if (!nodo.isVisitado()){
            nodo.setVisitado(false);
            dfsRecursivo(nodo);
            }
            else{
                nodo.getNext();
            }
        }
    }
    
    public void dfsRecursivo(NodoG nodo){
        ListaG adj=nodo.getAdyacentes();
        NodoG nodo1=adj.getHead();
        while (nodo1!= null){
            if (!nodo1.isVisitado()){
                nodo1.setVisitado(true);
                dfsRecursivo(nodo1);
            }
        }
    }
    
    */
}
