package conductores;

import com.sun.istack.internal.Pool;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestPoolConductores
{
    private PoolConductores pool;
    private ArrayList<Conductor> conductores;

    @Before
    public void setUp(){
        conductores = new ArrayList<>();
        conductores.add(new Conductor("Juan"));
        conductores.add(new Conductor("Pedro"));
        conductores.add(new Conductor("Luis"));
        pool = new PoolConductores(conductores);
    }

    @Test
    public void asignarConductorTest(){
        Conductor conductor = pool.asignarConductor();
        Assert.assertNotNull(conductor);

    }

}
