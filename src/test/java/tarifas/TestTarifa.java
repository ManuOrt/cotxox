package tarifas;

import carrera.Carrera;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tarifas.Tarifa;

public class TestTarifa
{
    Carrera carrera;
    @Before
    public void setUp(){
        carrera = new Carrera("12345");
    }
    @Test
    public void getCosteDistanciaTest(){
        double distancia = 7.75;
        double esperado = 10.4625;
        Assert.assertEquals(esperado, Tarifa.getCosteDistancia(distancia), 0);
    }

    @Test
    public void getCosteTiempo(){
        int minutos = 10;
        double esperado = 3.5d;
        Assert.assertEquals(esperado, Tarifa.getCosteTiempo(minutos), 0);
    }

     @Test
    public void getCosteTotalEsperadoTest(){
        carrera.setDistancia(3);
        carrera.setTiempoEsperado(3);
        double costeTotal = Tarifa.getCosteTotalEsperado(carrera);
        Assert.assertEquals(6.12,costeTotal,0);

     }
}
