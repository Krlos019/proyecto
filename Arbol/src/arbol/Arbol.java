
package arbol;


public class Arbol {
 
    Nodo raiz=null;
    
   void Insertar(int dato){
       
       Nodo NewHoja = new Nodo(dato);
       
       if(raiz==null){
           
           raiz = NewHoja;
           
       }else{
       
           if(raiz.dato == NewHoja.dato){
              
           }else{
           
               if(raiz.dato<NewHoja.dato){
               
                   raiz.derecha = NewHoja;
                   
               }else{
               
                   raiz.izquierda = NewHoja;
               }
           }
       }  
   }  
    
    public static void main(String[] args) {
        
    System.out.println("Hola Mundo");
 
    Arbol arbol1 = new Arbol();       
           
    arbol1.Insertar(2);
    arbol1.Insertar(2);
    arbol1.Insertar(1);
    // arbol1.Insertar(2);
    
    //System.out.println("Raiz derecha: "+arbol1.raiz.derecha.dato);
    System.out.println("Raiz: "+arbol1.raiz.dato);
    System.out.println("Raiz izquierda: "+arbol1.raiz.izquierda.dato);
    
    }
    
}
