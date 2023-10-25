/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DFS;
import EDD.StackNodoG;
import EDD.ListaG;
import EDD.NodoG;

/**
 *
 * @author Gabriel
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
    
    public void dfs(ListaG lista, boolean[] visitado){
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
    
    
}
