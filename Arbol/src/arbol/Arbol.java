package arbol;

import javax.swing.JOptionPane;

public class Arbol {

    //miembros de acceso
    Arbol izquierda;
    int dato;
    Arbol derecha;
     
   
    public Arbol(int datosNodo)
    {
        dato = datosNodo;
        izquierda = derecha = null; 
    }
     
    //Buscar punto de insercion e inserter nodo nuevo
    public  void insertar(int valorIns)
    {
        //Insertar en subarbol izquierdo
        if(valorIns < dato)
        {
            //Insertar en subarbol izquierdo
            if(izquierda == null)
                izquierda = new Arbol(valorIns);
            else    //continua recorriendo subarbol izquierdo
                izquierda.insertar(valorIns);
        }
         
        //Insertar nodo derecho
        else if(valorIns > dato)
        {
            //Insertar nuevo nodoArbol
            if(derecha == null)
                derecha = new Arbol(valorIns);
            else
                derecha.insertar(valorIns);
        }
    } 
}  
class Arboles
{
    private Arbol raiz;
     
    //Construir  arbol vacio
    public Arboles()
    {
        raiz = null;
    }
     
    
    public  void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new Arbol(valorInsertar); 
        else
            raiz.insertar(valorInsertar);       
    }
     
   
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    
     
    private void ayudantePreorden(Arbol nodo)
    {
        if(nodo == null)
            return;
         
        System.out.print(nodo.dato + " ");     
        ayudantePreorden(nodo.izquierda);   
        ayudantePreorden(nodo.derecha);     
    }
     
    
    public synchronized void recorridoInorden()
    {
        ayudanteInorden(raiz);
    }
     
   
    private void ayudanteInorden( Arbol nodo)
    {
        if(nodo == null)
            return;
         
        ayudanteInorden(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        ayudanteInorden(nodo.derecha);
    }
     
   
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);        
    }
     
   
    private void ayudantePosorden(Arbol nodo)
    {
        if( nodo == null )
            return;
         
        ayudantePosorden(nodo.izquierda);
        ayudantePosorden(nodo.derecha);
        System.out.print(nodo.dato + " ");
        
    }
    
}

