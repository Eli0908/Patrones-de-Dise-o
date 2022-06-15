
package patrones.de.diseño; //Singleton

public class EstadisticaApp {
        public static void main (String[]args){
        PatronesDeDiseño PatronesDeDiseño1=PatronesDeDiseño.getInstance();
        
        double[] datos={2,3,5,7,11,13,17,19,25};
            System.out.println(PatronesDeDiseño1.promedio(datos));
            System.out.println(PatronesDeDiseño1.desviacionEstandar(datos));
            System.out.println(PatronesDeDiseño1);
            
            System.out.println();
    }
}


