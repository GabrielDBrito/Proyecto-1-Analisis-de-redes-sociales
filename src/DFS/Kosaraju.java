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
 */
public class Kosaraju {
    private int [] numeros;
    private int contador;
    private boolean [] visitado;
    
    /*public Kosaraju(Grafo grafo){
        DFS dfs =new DFS(grafo.grafoTraspuesto());
        this.numeros=new int [grafo.getNodos().getLength()];
        this.visitado=new boolean [grafo.getNodos().getLength()];
        this.contador=0;
        
        NodoG pointer=dfs.getStack().getPeak();
        while(pointer!=null){
            if (!visitado[pointer.getUsuario().getNumero()]){
                dfs (pointer, grafo);
                contador++;
            }
            pointer=pointer.getNext();
        }
    }
    /*/
    private void dfs (NodoG nodo, Grafo grafo){
        visitado[nodo.getUsuario().getNumero()]=true;
        numeros[nodo.getUsuario().getNumero()]=contador;
        NodoG nododef =grafo.searchById(nodo.getUsuario().getId());
        nododef.setNumeroComponente(contador);
        
        NodoG pointer= nodo.getAdyacentes().getHead();
        while(pointer!=null){
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
