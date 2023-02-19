package tarifa;

import carrera.Carrera;

public class Tarifa
{
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final int COSTE_MINIMO = 5;
    static final double PORCENTAJE_COMISION = 1.20;

    public Tarifa()
    {}

    public static double getCosteTotalEsperado(Carrera coste){
        return ((coste.getDistancia() * COSTE_MILLA) + (coste.getTiempoEsperado() * COSTE_MINUTO)) * PORCENTAJE_COMISION;
    }

}
