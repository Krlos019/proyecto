package arbol;
public class Nodo {
    Nodo izquierda;
    int dato;
    Nodo derecha;
     
   
    public Nodo (int datosNodo)
    {
      
        dato = datosNodo;
        izquierda = derecha = null; 
    }
     
    //Buscar punto de insercion e inserter nodo nuevo
    public  void ordenar(int valorInsertar)
    {
        //Insertar en subarbol izquierdo
        if(valorInsertar < dato)
        {
            //Insertar en subarbol izquierdo
            if(izquierda == null)
                izquierda = new Nodo(valorInsertar);
            else    //continua recorriendo subarbol izquierdo
                izquierda.ordenar(valorInsertar);
        }
         
        //Insertar nodo derecho
        else if(valorInsertar > dato)
        {
            //Insertar nuevo nodoArbol
            if(derecha == null)
                derecha = new Nodo(valorInsertar);
            else
                derecha.ordenar(valorInsertar);
        }
    } 
}  

class Arbol
{
     Nodo raiz;
     
    //Construir  arbol vacio
    public Arbol()
    {
        raiz = null;
    }
     
    
    public  void insertar(int valorInsertar)
    {
        if(raiz == null) //Se toma el dato a ingresar X; Partiendo de la raíz preguntamos: Nodo == null

            raiz = new Nodo(valorInsertar); //En caso afirmativo X pasa a ocupar el lugar del nodo y ya hemos ingresado nuestro primer dato.
        else
            raiz.ordenar(valorInsertar);    //En caso contrario llamamos el metodo ordenar.   
    }
     
   
    public  void imprimePreorder()
    {
        preorder(raiz);
    }
    
     
    private void preorder(Nodo nodo)
    {
        if(nodo == null)
            return;
         
        System.out.print(nodo.dato + " ");     
        preorder(nodo.izquierda);   
        preorder(nodo.derecha);     
    }
     
    
    public  void imprimeInorder()
    {
        inorder(raiz);
    }
     
   
    private void inorder( Nodo nodo)
    {
        if(nodo == null)
            return;
         
        inorder(nodo.izquierda);
        System.out.print(nodo.dato + " ");
        inorder(nodo.derecha);
    }
     
   
    public  void imprimePosorder()
    {
        posorden(raiz);        
    }
     
   
    private void posorden(Nodo nodo)
    {
        if( nodo == null )
            return;
         
        posorden(nodo.izquierda);
        posorden(nodo.derecha);
        System.out.print(nodo.dato + " ");
        
    }
 
       public Nodo buscar(int valor){
    Nodo temp = raiz; 
    Nodo aux = temp;
         aux = raiz;
        
        while(aux.dato != valor){
        
            if(valor < aux.dato){
            
                aux = aux.izquierda;
            
            }else{
                
                aux = aux.derecha;
            }
            
                if (aux == null){
            
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
     
    public void borrar(int elemento){
    
    raiz = borrar(this.raiz,elemento);
    
    }
    private Nodo borrar (Nodo r, int elemento){
    if (r.dato==elemento){
        if(r.derecha == null && r.izquierda == null){
            r = null;
            return r;
        }
        if(r.derecha == null){
            r = r.izquierda;
            return r;
        }
        if(r.izquierda == null){
            r = r.derecha;
            return r;
        }
        //Este es el caso en el que el nodo tiene dos hijos
        r.dato = encontrarMaximo(r.izquierda);
        r = ajuste(r, r.izquierda, r);
        return r;
    }
    //si no era el nodo que se queria borrar se aprobecha su ordenamiento
    if(elemento > r.dato){
    r.derecha=borrar(r.derecha, elemento);
    return r;
    }
    r.izquierda=borrar(r.izquierda, elemento);
    return r;
    }
    // este metodo sirve para encontrar al nodo maximo
    //nos ayudara para la eliminacion del nodo en el metodo borrar
    private int encontrarMaximo(Nodo r){
    if(r.derecha == null)
    return r.dato;
    return encontrarMaximo(r.derecha);
    
    }
    //metodo que elimina el nodo repetido y ajusta el arbol
    private Nodo ajuste(Nodo padre, Nodo hijo, Nodo ances){
    if(hijo.derecha == null){
        if(padre.equals(ances)){
        padre.izquierda=hijo.izquierda;
        return padre;
        }
        padre.derecha = hijo.izquierda;
        return padre;
    }
    //aqui se sigue buscando en los nodos de mayor valor
    hijo = ajuste(hijo, hijo.derecha, ances);
    if (padre.equals(ances))
        padre. izquierda = hijo;
    else padre.derecha = hijo;
    return padre;
    }
    
    
}
    
    
    
    
    


        
        
        
        
        
        
        
        
        



