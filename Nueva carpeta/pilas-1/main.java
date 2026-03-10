import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.Utilities;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean seguir = true;
    utilities u = new utilities();
    Stack p= new Stack<>();
    
    
    while (seguir) {
        System.out.println("bienvenido a la clase pilas");
        System.out.println("escoja una opcion valida");
        System.out.println("1. agregar un elemento a la pila");
        System.out.println("2. eliminar un elemento de la pila");
        System.out.println("3. mostrar el elemento superior de la pila");
        System.out.println("4. mostrar el tamaño de la pila");
        System.out.println("5. salir");
        int opt = u.ValidarEntero(sc);
        System.out.println(opt);
    }
    switch(opt) {
        case 1:
            p = u.LlenarPila(p);
            break;
        case 2:
            p=u.mostrarPila(p);
            
            break;
        
            System.out.println("opcion no valida");
    }
}
}