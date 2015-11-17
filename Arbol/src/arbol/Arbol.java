package arbol;

import javax.swing.JOptionPane;

public class Arbol {

    //miembros de acceso
    Arbol nodoizquierdo;
    int datos;
    Arbol nododerecho;
     
    //iniciar dato y hacer de este nodo un nodo hoja
    public Arbol(int datosNodo)
    {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null; //el nodo no tiene hijos
    }
     
    //buscar punto de insercion e inserter nodo nuevo
    public  void insertar(int valorInsertar)
    {
        //insertar en subarbol izquierdo
        if(valorInsertar < datos)
        {
            //insertar en subarbol izquierdo
            if(nodoizquierdo == null)
                nodoizquierdo = new Arbol(valorInsertar);
            else    //continua recorriendo subarbol izquierdo
                nodoizquierdo.insertar(valorInsertar);
        }
         
        //insertar nodo derecho
        else if(valorInsertar > datos)
        {
            //insertar nuevo nodoArbol
            if(nododerecho == null)
                nododerecho = new Arbol(valorInsertar);
            else
                nododerecho.insertar(valorInsertar);
        }
    } // fin del metodo insertar
}  
class Arboles
{
    private Arbol raiz;
     
    //construir un arbol vacio
    public Arboles()
    {
        raiz = null;
    }
     
    //insertar un nuevo ndo en el arbol de busqueda binaria
    public  void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new Arbol(valorInsertar); //crea nodo raiz
        else
            raiz.insertar(valorInsertar); //llama al metodo insertar        
    }
     
    // EMPIEZA EL RECORRIDO EN PREORDEN
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    //meoto recursivo para recorrido en preorden
     
    private void ayudantePreorden(Arbol nodo)
    {
        if(nodo == null)
            return;
         
        System.out.print(nodo.datos + " ");     //mostrar datos del nodo
        ayudantePreorden(nodo.nodoizquierdo);   //recorre subarbol izquierdo
        ayudantePreorden(nodo.nododerecho);     //recorre subarbol derecho
    }
     
    //EMPEZAR RECORRIDO INORDEN
    public synchronized void recorridoInorden()
    {
        ayudanteInorden(raiz);
    }
     
    //meoto recursivo para recorrido inorden
    private void ayudanteInorden( Arbol nodo)
    {
        if(nodo == null)
            return;
         
        ayudanteInorden(nodo.nodoizquierdo);
        System.out.print(nodo.datos + " ");
        ayudanteInorden(nodo.nododerecho);
    }
     
    //EMPEZAR RECORRIDO PORORDEN
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);        
    }
     
    //meotod recursivo para recorrido posorden
    private void ayudantePosorden(Arbol nodo)
    {
        if( nodo == null )
            return;
         
        ayudantePosorden(nodo.nodoizquierdo);
        ayudantePosorden(nodo.nododerecho);
        System.out.print(nodo.datos + " ");
        
    }
    
}

