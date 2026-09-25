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
