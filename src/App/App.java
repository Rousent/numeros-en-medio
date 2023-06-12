
package App;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========[Contando numeros]========");

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Termino: ");
        int termino = sc.nextInt();

        System.out.println("Imprimiendo:");

        // Oteniendo los numeros de en medio.
        List<Integer> enMedio = Numeros.enMedioDe(inicio, termino);
        //Imprimir cada numero en la lista de numeros de en medio.
        for (int numero : enMedio) {
            System.out.println(numero);
        }
        // Cerrando el input stream.
        sc.close();
    }
}
