import java.util.Scanner;

public class Arreglo2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números:");
        int N = leer.nextInt();

        int almacen[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            almacen[i] = leer.nextInt() * 2;

        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < N; i++) {
            System.out.println("El doble del número " + (i + 1) + ": " + almacen[i]);
        }

        leer.close();
    }
}
