
package Tests;

import App.Numeros;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class NumerosTest {
    
    @Test
    public void Test01() {
        int inicio = 1;
        int termino = 5;

        List<Integer> esperado = List.of(2,3,4);
        List<Integer> resultado = Numeros.enMedioDe(inicio, termino);

        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void Test02() {
        int inicio = 5;
        int termino = 10;

        List<Integer> esperado = List.of(6,7,8,9);
        List<Integer> resultado = Numeros.enMedioDe(inicio, termino);

        Assert.assertEquals(esperado, resultado);
    }
}
