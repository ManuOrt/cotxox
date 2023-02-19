package conductores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestConductor
{
    Conductor conductor;

    @Before
    public void setUp(){
        conductor = new Conductor("tomeu");
    }

    @Test
    public void setValoracionTest(){
        conductor.setValoracion((byte) 3);
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 5);

        Assert.assertEquals(4.0d, conductor.getValoracion(),0);
    }

    @Test
    public void calcularValoracionesMedia(){
        conductor.setValoracion((byte) 3);
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 6);
        conductor.setValoracion((byte) 7);

        double expectedAvarage = (3.0 + 4.0 + 5.0 + 6.0 + 7-0) / 5;
        double actualAvarage = conductor.calcularValoracionMedia();
        Assert.assertEquals(expectedAvarage, actualAvarage, 0);

    }


}
