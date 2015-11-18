package arbol;

import javax.swing.JOptionPane;

public class Arbol {
 Arbol izquierda;
    int dato;
    Arbol derecha;
     
   
    public Arbol (int datosNodo)
    {
      
        dato = datosNodo;
        izquierda = derecha = null; 
    }
     
    //Buscar punto de insercion e inserter nodo nuevo
    public  void ordenar(int valorIns)
    {
        //Insertar en subarbol izquierdo
        if(valorIns < dato)
        {
            //Insertar en subarbol izquierdo
            if(izquierda == null)
                izquierda = new Arbol(valorIns);
            else    //continua recorriendo subarbol izquierdo
                izquierda.ordenar(valorIns);
        }
         
        //Insertar nodo derecho
        else if(valorIns > dato)
        {
            //Insertar nuevo nodoArbol
            if(derecha == null)
                derecha = new Arbol(valorIns);
            else
                derecha.ordenar(valorIns);
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
     
    
    public  void insertar(int valorInsertar)
    {
        if(raiz == null)
            raiz = new Arbol(valorInsertar); 
        else
            raiz.ordenar(valorInsertar);       
    }
     
   
    public synchronized void imprimePreorder()
    {
        preorder(raiz);
    }
    
     
    private void preorder(Arbol nodo)
    {
        if(nodo == null)
            return;
         
        System.out.print(nodo.dato + " ");     
        preorder(nodo.izquierda);   
        preorder(nodo.derecha);     
    }
     
    
    public synchronized void imprimeInorder()
    {
        inorder(raiz);
    }
     
   
    private void inorder( Arbol nodo)
    {
        if(nodo == null)
            return;
         
        inorder(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        inorder(nodo.derecha);
    }
     
   
    public synchronized void imprimePosorder()
    {
        posorden(raiz);        
    }
     
   
    private void posorden(Arbol nodo)
    {
        if( nodo == null )
            return;
         
        posorden(nodo.izquierda);
        posorden(nodo.derecha);
        System.out.print(nodo.dato + " ");
        
    }
 
       public Arbol buscar(int valor){
    Arbol temp = raiz; 
    Arbol aux = temp;
         aux = raiz;
        
        while(aux.dato != valor){
        
            if(valor < aux.dato){
            
                aux = aux.izquierda;
            
            }else{
                
                aux = aux.derecha;
            }
            
            if (aux==null){
            
                return null;
            }
        }
        
        return aux;
    }
    
   
    
    public int buscaHijoIzq(int valor){
    
        return buscar(valor).izquierda.dato;
    }
    
    public int buscaHijoDer(int valor){
    
        return buscar(valor).derecha.dato;
    }
}

