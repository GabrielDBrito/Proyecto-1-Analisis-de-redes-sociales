/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.ListaG;
import EDD.Lista;
import EDD.ListaArista;
import EDD.Nodo;
import EDD.NodoG;
import EDD.StackNodoG;
import Helpers.Helpers;


/**
 * @author Gabriel
 * version 24/10/23
 */
public class Grafo {
    private ListaG nodos;
    private ListaArista aristas;

    public Grafo() {
        ListaG lista=new ListaG();
        ListaArista lista1=new ListaArista();
        this.nodos=lista;
        this.aristas=lista1;
    }

    public ListaG getNodos() {
        return nodos;
    }

    public void setNodos(ListaG nodos) {
        this.nodos = nodos;
    }

    public ListaArista getAristas() {
        return aristas;
    }

    public void setAristas(ListaArista aristas) {
        this.aristas = aristas;
    }

    //imprime todos los atributos de los nodos
    public void printNodos() {
        NodoG pointer=nodos.getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    //imprime todos los atributos de los nodos
    public void printAristas(){
        Arista pointer=aristas.getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    /*
    Crea todos los usuarios a partir de una lista
    @param usuarios
    */
    public void crearUsuarios(Lista usuarios){
        int cont=0; //contador que le otorga el numero a cada usuario
        Nodo pointer=usuarios.getHead();
        while (pointer!= null){
            String id=pointer.getElement().toString();
            Usuario usuario=new Usuario(id,cont);
            getNodos().insertFinal(usuario);
            cont++;
            pointer=pointer.getNext();
        }
    }
    
    /*
    Crea todas las relaciones a partir de una lista
    @param relaciones
    */
    public void crearRelaciones(Lista relaciones){
        Nodo pointer = relaciones.getHead();
        Helpers helpers = new Helpers();
        while (pointer!=null){
            Lista lista =helpers.stringSplit(pointer.getElement().toString()); //separacion del string 
            Object id1=lista.getHead().getElement(); // se almacena id1 (id del usuario)
            Object id2=lista.getHead().getNext().getElement(); // se almacena id2 (id del usuario)
            NodoG nodo1=searchById(id1.toString()); // se busca el nodoG cuyo nombre de usuario sea correspondiente al id1 y se almacena en una variable
            NodoG nodo2=searchById(id2.toString()); // se busca el nodoG cuyo nombre de usuario sea correspondiente al id2 y se almacena en una variable
            nodo1.getAdyacentes().insertFinal(nodo2.getUsuario()); // se inserta el nodo 2 en la lista de relaciones del nodo 1
            Arista arista=new Arista(nodo1,nodo2);
            getAristas().insertFinal(arista);
            pointer=pointer.getNext();
        }
    }
    
    /*busqueda por id
    *@param id
    *@return
    */
    public NodoG searchById(String id){
        if (nodos.isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }else{
            NodoG pointer=nodos.getHead();
            NodoG temp=null;
            while(pointer!=null){
                if (pointer.getUsuario().getId().equals(id)){ //si la entrada id corresponde al id del usuario
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
            }
            if(temp!= null){
                return temp; // retorna el nodoG correspondiente
                
            } else{
                //System.out.println("El usuario no fue encontrado");
                return null;
            }
        }     
    }
    
    /*borrar nodo por id
    *@param id
    *@return
    */
    public NodoG deleteById(String id){
        if (nodos.isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;     
        }else{
            NodoG pointer=nodos.getHead();
            int cont=0;
            NodoG temp=null;
            while(pointer!=null){ //recorre la lista que contiene todos los nodos del grafo
                if (pointer.getUsuario().getId().equalsIgnoreCase(id)){ //si el id coincide el nodo correspondiente se almacena en la variable temp
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
            }
            if(temp!= null){
                nodos.deleteAtIndex(cont); //se borra el nodo del grafo
                NodoG pointer1=getNodos().getHead();
                while (pointer1!=null){ //se recorre nuevamente la lista que contiene todos los nodos del grafo
                    NodoG pointer2=pointer1.getAdyacentes().getHead();
                    int contador=0;
                    while(pointer2!=null){ //se recorre la lista de adyacentes de cada nodo del grafo
                        if (pointer2.getUsuario().getId().equalsIgnoreCase(id)){
                            //si se encuentra la lista de adyacencias el nodo que fue borrado, se borra de la lista de adyacencias tambien
                            pointer1.getAdyacentes().deleteAtIndex(contador); 
                        }
                        contador++;
                        pointer2=pointer2.getNext();
                    }
                    pointer1=pointer1.getNext();
                }
                //se ejecuta el metodo borrar por id tantas veces como la longitud de la lista de aristas
                //si encuentra el id del nodo borrado del grafo en alguna de las aristas, borra dicha arista
                for (int i=0; i<getAristas().getLength();i++){  
                    getAristas().deleteById(id);
                }
                return temp;
                } 
                else{
                return null;
            }
        }     
    }
    
    /*
    Agrega un nuevo usuario
    @Param id, numero, adyacentes
    @return
    */
    public Usuario nuevoUsuario(String id, Lista adyacentes){
        Helpers helpers=new Helpers();
        String ID=helpers.verificarId(id, this);
        Integer NUMERO=helpers.buscarNumero(this);
        boolean ADYACENTES=true;
        Nodo pointer=adyacentes.getHead();
        while (pointer!=null){
            boolean verificar=helpers.usuarioValido(pointer.getElement().toString(), this);
            if (verificar==false){
                ADYACENTES=false;
            }
            pointer=pointer.getNext();
        }
        
        if (ID==null || NUMERO==null || ADYACENTES==false){
            return null;
        }
        else{
            Usuario usuario=new Usuario(ID,NUMERO);
            getNodos().insertFinal(usuario);
            NodoG nodo =searchById(ID);
            Nodo pointer1=adyacentes.getHead();
            while (pointer1!=null){
                NodoG nodo2 =searchById(pointer1.getElement().toString());
                Arista arista=new Arista(nodo, nodo2);
                getAristas().insertFinal(arista);
                nodo.getAdyacentes().insertFinal(nodo2.getUsuario());
                pointer1=pointer1.getNext();
            }
            return usuario;
        }
    }
    
    /*
    Crea las relaciones del grafo a partir de las aristas
    Este metodo se utiliza para generar las relaciones del grafo transpuesto
  
    */  
    public void crearRelacionesTranspuesta(){
        Arista pointer = getAristas().getHead();
        ListaArista lista2=new ListaArista();
        while (pointer!=null){
            String id1=pointer.getInicio().getUsuario().getId();
            String id2=pointer.getObjetivo().getUsuario().getId();
            NodoG nodo1=searchById(id1); // se busca el nodoG cuyo nombre de usuario sea correspondiente al id1 y se almacena en una variable
            NodoG nodo2=searchById(id2); // se busca el nodoG cuyo nombre de usuario sea correspondiente al id2 y se almacena en una variable
            nodo2.getAdyacentes().insertFinal(nodo1.getUsuario()); //inserta el nodo 1 en los adyacentes del 2 (se hace al reves porque es la transpuesta)
            Arista arista=new Arista(nodo2,nodo1); //Se crea la nueva arista al reves (se hace al reves porque es la transpuesta)
            lista2.insertFinal(arista); //se insertan las aristas transpuestas en una lista
            pointer=pointer.getNext();
        }
        setAristas(lista2); //se establece la lista de las aristas transpuestas como las aristas del grafo
    }
    
    /*
    Crea el grafo traspuesto (grafo con la direccion de las aristas invertidas)
    @return
    
    */
    
    public Grafo grafoTraspuesto(){
        Grafo traspuesto=new Grafo();
        ListaG nodosTranspuestos=new ListaG();
        traspuesto.setAristas(getAristas());
        NodoG pointer=getNodos().getHead();
        while (pointer!=null){
            nodosTranspuestos.insertFinal(pointer.getUsuario());
            pointer=pointer.getNext();
        }
        traspuesto.setNodos(nodosTranspuestos);
        traspuesto.crearRelacionesTranspuesta();
        return traspuesto;
    }
     
}
    
    
    
    
    
    

