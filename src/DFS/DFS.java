 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DFS;
import Grafo.Grafo;
import EDD.StackNodoG;
import EDD.NodoG;

/**
 *
 * @author Gabriel
 * version 26/10/23
 */
public class DFS {
    private StackNodoG stack;
    
    /*
    Metodo constructor de la clase DFS, ademas comienza a emplear el algoritmo de busqueda en profundidad (dfs) en los nodos del 
    */
    public DFS(Grafo grafo,boolean[] visitado){
        StackNodoG stack=new StackNodoG();
        this.stack=stack;
        NodoG pointer=grafo.getNodos().getHead();
        while (pointer!=null){ //se recorre la lista de nodos del grafo y si no ha sido visitado, se le aplica el metodo dfs
            if (!visitado[pointer.getUsuario().getNumero()]){
                dfs(grafo, pointer,visitado); 
            }
            pointer=pointer.getNext();
        }
    }
    
    
    public StackNodoG getStack() {
        return stack;
    }

    public void setStack(StackNodoG stack) {
        this.stack = stack;
    }  
   
   /*
    Metodo encargado marcar un nodo como visitado y de emplear el algoritmo de busqueda en profundidad (dfs) en los nodos adyacentes al mismo
    */
   public void dfs (Grafo grafo, NodoG nodo, boolean[] visitado){
        visitado[nodo.getUsuario().getNumero()]=true; //se marca el nodo como visitado
        NodoG pointer=nodo.getAdyacentes().getHead();
        while (pointer!=null){  ////se recorre la lista de nodos adyacentes, si algun nodo no ha sido visitado, se le aplica el metodo dfs
            if (!visitado[pointer.getUsuario().getNumero()]){  
                dfs(grafo, pointer, visitado);
            }
        }
        stack.push(nodo.getUsuario()); //se agrega el nodo a una pila
        getStack().getPeak().setAdyacentes(nodo.getAdyacentes()); //se establecen los adyacentes del nodo
    }
}
