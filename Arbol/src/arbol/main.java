package arbol;
import java.util.Scanner;
public class main {
    
  public static void main(String args [])
    {
         Arboles arbol = new Arboles();
         /*Scanner teclado = new Scanner(System.in);
       
        int valor;
        String Dato;
         
		while(true) {
			
			System.out.println("\nMENU DE LISTAS SIMPLES\n"
					+ "1. Agregar \n"
					+ "2. imprimir \n"
                                        + "3. imprimir hijo \n"                    );
					
                        int opcion = teclado.nextInt();
                        
                                
       
       
           
    
    switch (opcion) {
			case 1:
				System.out.println("Insertando los siguientes valores: ");
         
       
           System.out.println("Dame el valor para colocar en el Arbol");
           valor =teclado.nextInt();
           System.out.print(valor + " ");
            arbolito.insertar(valor);
				break;
			case 2:  System.out.println("\n\nRecorrido Preorden");
        arbolito.imprimePreorder();
         
        System.out.println("\n\nRecorrido Inorden");
        arbolito.imprimeInorder();
         
        System.out.println("\n\nRecorrido Postorden");
        arbolito.imprimePosorder();
    
			
			break;
                            default:
				System.exit(0);
				break;
			}
		}
    }  */
  
 arbol.insertar(5);
 arbol.insertar(3);
 arbol.insertar(9);
 arbol.insertar(2);
 arbol.insertar(4);
 arbol.insertar(7);
 arbol.insertar(11);
 arbol.insertar(6);
 arbol.insertar(8);
    
  arbol.imprimePreorder();    System.out.println("\n");
  arbol.imprimeInorder();    System.out.println("\n");
  arbol.imprimePosorder();    System.out.println("\n");
  
    System.out.println(arbol.buscaHijoIzq(5));
    System.out.println(arbol.buscaHijoDer(5));
  
    }
  
}
        
      