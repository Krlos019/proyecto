package arbol;
import java.util.Scanner;
public class main {
    
  public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        Arboles arbolito = new Arboles();
        int valor;
        String Dato;
         
		while(true) {
			
			System.out.println("\nMENU DE LISTAS SIMPLES\n"
					+ "1. Agregar \n"
					+ "2. imprimir \n");
					
                        int opcion = teclado.nextInt();
                        
                                
       
       
           
    
    switch (opcion) {
			case 1:
				System.out.println("Insertando los siguientes valores: ");
         
       
           System.out.println("Dame el valor para colocar en el Arbol");
           valor =teclado.nextInt();
           System.out.print(valor + " ");
            arbolito.insertarNodo(valor);
				break;
			case 2:  System.out.println("\n\nRecorrido Preorden");
        arbolito.recorridoPreorden();
         
        System.out.println("\n\nRecorrido Inorden");
        arbolito.recorridoInorden();
         
        System.out.println("\n\nRecorrido Postorden");
        arbolito.recorridoPosorden();
    
			
			break;
                            default:
				System.exit(0);
				break;
			}
		}
    }
  
}
        
      