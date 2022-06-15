
package PatronFactory;

public class Rectangulo extends Figura{
    public double ancho;
    public double alto;
    
    public Rectangulo(){
    }
    
    public Rectangulo (double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }
    
    public double getAncho(){
        return ancho;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public double getAlto(){
        return alto;
    }
    
    public void setAlto(double alto){
        this.alto=alto;
    }
    
    public double calcularArea(){
        return ancho*alto;
    }
    
    @Override
    public double CalcularArea() {
        return 0;
       
    }
    
}
