package patrones.de.diseño;

import java.io.Serializable;

//Singleton

public class PatronesDeDiseño implements Serializable {

    private static volatile PatronesDeDiseño instance = new PatronesDeDiseño();

    private PatronesDeDiseño() {
    }

    public static PatronesDeDiseño getInstance() {
        return instance;
    }

    public double promedio(double datos[]) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    public double desviacionEstandar(double datos[]) {
        double promedio = promedio(datos);
        double suma = 0;

        for (double dato : datos) {
            suma += Math.pow(dato-promedio,2);
        }
        return Math.sqrt(suma/datos.length);
    }
    
}

