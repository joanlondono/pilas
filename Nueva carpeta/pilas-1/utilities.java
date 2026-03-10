import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.Utilities;
public class utilities {
    Scanner sc = new Scanner(System.in);
    public int ValidarEntero(Scanner sc) {
        while(!sc.hasNextInt()) {
            System.out.println("por favor ingrese un numero entero valido");
            sc.nextLine();
        }
        return sc.nextInt();
    }
    public double ValidarDecimal(Scanner sc) {
        while(!sc.hasNextDouble()) {
            System.out.println("por favor ingrese un numero decimal valido");
            sc.nextLine();
        }
        return sc.nextDouble();
    }
    public int ValidarRango(int n1,int n2, int numero){
        utilities u = new utilities();
        int result=0;
        while(numero<n1 || numero>n2) {
            System.out.println("por favor ingrese un numero entre "+n1+" y "+n2);
            numero = u.ValidarEntero(sc);
        }
        return numero;
    }
    public Stack<Integer> LlenarPila(Stack<Integer> p) {
        utilities u = new utilities();
        boolean continuar = true;
        int numero=0;
        int opt=0;
        while(continuar) {
            System.out.println("ingrese un numero entero para agregar a la pila");
            numero = u.ValidarEntero(sc);
            p.push(numero);
            System.out.println("desea agregar mas registros? 1=si 2=no");
            int opcion = u.ValidarRango(1, 2, opt);
            opt = u.ValidarEntero(sc);

            if(opcion == 2) {
                continuar = false;
            }
        }
        return p;
    }
    public void mostrarPila(Stack<Integer> p) {
       System.out.println("elementos de la pila:");
        }
    }




