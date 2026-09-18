# Ejercicio-de-Estructura-de-Datos-I
Aquí vamos a darle respuestas a los ejercicios dados por el profesor en las conferencias brindadas.


# ArrayList 

import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        // Listas de nombres
        ArrayList<String> nombres = new ArrayList();
        nombre.add("Carlos");
        nombre.add("Juana");
        nombre.add("Pedro");
        
        System.out.println("Los nombres de la familia son", + nombre); 

        // Este Array devuelve un errores porque se declaro un ArrayList<int> y el elemento añadido debe un int no un String 
        ArrayList(int) numeros = new ArrayList();
            numeros.add("Pedro");
            numeros.add("Juan");
            numeros.add("Carlos");

        // Error al imprimir en la consola porque no se puede imprimir un ArrayList de tipo int
        System.out.println("Los números de la familia son", + numeros); 
    }
}


# LinkedList
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList();

        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Jose");

        System.out.println("Los nombres son:" + nombres);

        // Error no exite un elemento 4
        nombres.remove(4);

        // Error elemento 1 ya existe
        nombres.add("Juan");

        // Iterar con un bucle en Java
        for (String nombre : nombres) {
            System.out.println("Los nombres son:" + nombre);
        }
    }
}
