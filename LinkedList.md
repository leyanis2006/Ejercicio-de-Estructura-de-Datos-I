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
