package conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores
{

    Conductor conductor;
    List<Conductor> conductores = new ArrayList<>();
    public PoolConductores(List<Conductor> conductores)
    {
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores(){
        return conductores;
    }

    public Conductor asignarConductor()
    {
        Random random = new Random();
        int index = random.nextInt(conductores.size());

        // Obtiene el conductor aleatorio de la lista
        conductor = conductores.get(index);

        // Devuelve el conductor seleccionado aleatoriamente
        return conductor;
    }
}
