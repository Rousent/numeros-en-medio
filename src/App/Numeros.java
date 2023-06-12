
package App;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para trabajar con numeros en este proyecto.
 */
public class Numeros {

    /**
     * Metodo que obtiene una lista de los numeros PARES de en medio
     * entre los parametros de entrada.
     * @param inicio El borde inferior de la lista.
     * @param termino El borde superior de la lista.
     * @return Lista de numeros PARES en medio de "inicio" y "termino", excluyendo ambos numeros al borde.
     */
    public static List<Integer> enMedioDe(int inicio, int termino) {
        List<Integer> enMedio = new ArrayList<Integer>();

        for (int i = (inicio +1); i<termino; i++) {
            if (i % 2 == 0) enMedio.add(i);
        }

        return enMedio;
    }
}
