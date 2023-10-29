/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DFS;
import Grafo.Grafo;
import EDD.NodoG;

/**
 *
 * @author Gabriel
 * version 26/10/23
 */
public class Kosaraju {
    private int [] numeros;
    private int contador;
    private boolean [] visitado;
    
   /*
    Metodo constructor de la calse kosaraju, ademas comienza a emplear el algoritmo de kosaraju, aplicando dfs en cada uno de los nodos obtenidos en la stack (atributo del objeto DFS creado) 
    */
   public Kosaraju(Grafo grafo){
        this.visitado=new boolean [grafo.getNodos().getLength()]; 
        this.numeros=new int [grafo.getNodos().getLength()];
        this.contador=0;
        DFS dfs =new DFS(grafo.grafoTraspuesto(), getVisitado()); //se crea un objeto dfs con el grafo traspuesto y se inicia el metodo recursivo
        NodoG pointer=dfs.getStack().getPeak(); 
        while(pointer!=null){   //se recorre la pila generada por el dfs y a cada nodo que no este visitado se le se aplica el metodo dfs
            if (!visitado[pointer.getUsuario().getNumero()]){
                dfs (pointer, grafo);
                contador++;
            }
            pointer=pointer.getNext();
        }
    }
    
   /*
   Metodo encargado marcar un nodo como visitado y de emplear el algoritmo de busqueda en profundidad (dfs) en los nodos adyacentes al mismo
   */
    private void dfs (NodoG nodo, Grafo grafo){
        visitado[nodo.getUsuario().getNumero()]=true; //se marca el nodo como visitado
        numeros[nodo.getUsuario().getNumero()]=contador;
        NodoG nododef =grafo.searchById(nodo.getUsuario().getId());
        nododef.setNumeroComponente(contador); //se establece el numero de componente al que pertenece el nodo
        
        NodoG pointer= nodo.getAdyacentes().getHead();
        while(pointer!=null){   //se recorre la lista de nodos adyacentes del nodo pointer y a cada uno que no haya sido visitado se le aplica el metodo dfs
            if (!visitado[pointer.getUsuario().getNumero()]){
                dfs(pointer,grafo);
            }
            pointer=pointer.getNext();
        }
    }
    

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public boolean[] getVisitado() {
        return visitado;
    }

    public void setVisitado(boolean[] visitado) {
        this.visitado = visitado;
    }
    
    
}
