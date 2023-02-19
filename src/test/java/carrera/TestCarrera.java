package carrera;

import conductores.Conductor;
import conductores.PoolConductores;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCarrera
{
    Carrera carrera;

    @Before
    public void setUp(){
        carrera = new Carrera("12345");
    }

    @Test
    public void asignarConductoresTest(){
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        Conductor conductor = null;
        String[] nombres = { "Samantha", "Fox", "Mola" };
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }
        PoolConductores conductors = new PoolConductores(poolConductores);
        carrera.asignarConductor(conductors);
        Assert.assertNotNull(carrera);
    }

    @Test
    public void liberarConductorTest(){
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        Conductor conductor = null;
        conductor = new Conductor("Samantha");
        poolConductores.add(conductor);
        PoolConductores conductors = new PoolConductores(poolConductores);
        carrera.asignarConductor(conductors);
        carrera.liberarConductor();
        Assert.assertFalse(carrera.getConductor().isOcupado());
    }

}
