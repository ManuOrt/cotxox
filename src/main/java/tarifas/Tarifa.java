package tarifas;

import carrera.Carrera;

public class Tarifa
{
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;

    static final int COSTE_MINIMO = 5;
    static final double PORCENTAJE_COMISION = 1.20;

    public Tarifa()
    {}

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int minutos) {
        return minutos * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = (getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado())) * PORCENTAJE_COMISION;
        return costeTotal > COSTE_MINIMO ? costeTotal : COSTE_MINIMO;
    }

}
